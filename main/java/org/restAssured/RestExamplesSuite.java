package org.restAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.hamcrest.CoreMatchers;

import java.util.HashMap;
import static io.restassured.RestAssured.given;

public class RestExamplesSuite {

    String URL = "https://test-abbs-api.cargoes.com/abbs/api/v1/customers/addresses/EUC00002515";
    HashMap<String, String> headerMap;
    Header headers = new Header("", "");


    @BeforeTest
    public void setup() {
        headerMap = new HashMap<>();
        headerMap.put("tenant-id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596");
    }

    @Test
    public void get() {
        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL);

        System.out.println(response.asString());
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.get("paymentMethod").toString());
        System.out.println(response.getBody().asString().contains("does not exist"));
        System.out.println(response.getBody().asPrettyString());
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
        System.out.println(response.getBody());
        System.out.println(response.body().asPrettyString());

    }

    @Test
    public void bodyValidation() {
        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL);

        JsonPath jsonPath = response.jsonPath();
        Assert.assertTrue(response.getStatusCode() == 200);
        Assert.assertEquals(jsonPath.get("paymentMethod"), "DIRECT_DEBIT");
        Assert.assertTrue(response.body().asString().contains("paymentMethod"));
/**
 String resp = response.getBody().asString();
 BillDetails billDetails = mapper.readValue(resp, BillDetails.class);
 */
    }

    @Test
    public void hamcrestCoreMatchers() {
        given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL)
                .then()
                .statusCode(200)
                .body("paymentMethod", CoreMatchers.equalTo("DIRECT_DEBIT"));

        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL);
        Assert.assertEquals(response.getBody().asString(), CoreMatchers.is("DIRECT_DEBIT"));
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.get("paymentMethod"), "DIRECT_DEBIT");
    }

    @Test
    public void hamcrestCoreMatchers1() {
                given()
                    .headers(headerMap)
                    .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .when()
                    .get(URL)
                .then()
                    .statusCode(200)
                    .body("companyOfficeDetails[0].officeReference", CoreMatchers.is("EUO00002164"));

        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL);
        System.out.println(response.getDetailedCookies());

        JsonPath jsonPath = response.jsonPath();
        String s = jsonPath.getString("paymentMethod");
        System.out.println(s);

        Assert.assertEquals(jsonPath.get("paymentMethod"), "DIRECT_DEBIT");

    }
    @Test
    public void hamcrestCoreMatchers2() {
        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL);

    }

    //Deserilise response using jackson lib using ObjectMapper class
    public static Object getMappedResponse(Response response, Class className) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Object mappedResponse = mapper.readValue(response.asString(), className);
        return mappedResponse;
    }

    //Serialize body using gson lib
    public static String objectToJson(Object body){
        Gson gson = new Gson();
        return gson.toJson(body);
    }

    //DeSerialize body using gson lib
    public static Object jsonToObject(String response){
        Gson gson = new Gson();
        return gson.fromJson(response, Object.class);
    }

    //Lombok for building pojo class
    /**
     * @Getter
     * @Setter
     * @Builder
     * @Data
     */
    @Test
    public void hamcrestCore() {

        given()
                .headers(headerMap)
                .queryParam("tenant_id", "026d4b96-4ae6-4f1b-858d-4c3190a6a596")
                .get(URL)
                .then()
                .body("paymentMethod", CoreMatchers.is("DIRECT_DEBIT"))
                .body("paymentMethod", CoreMatchers.equalTo("DIRECT_DEBIT"))
                .body("paymentMethod", CoreMatchers.any(Object.class))
                .body("paymentMethod", CoreMatchers.anything("DIRECT_DEBIT"))
                .body("paymentMethod", CoreMatchers.instanceOf(String.class))
                .body("paymentMethod", CoreMatchers.notNullValue())
                .body("paymentMethod", CoreMatchers.allOf(CoreMatchers.is("DIRECT_DEBIT"),CoreMatchers.instanceOf(String.class)))
                .body("paymentMethod", CoreMatchers.anyOf(CoreMatchers.is("DIRECT_DEBIT"),CoreMatchers.instanceOf(Integer.class)));

    }
}