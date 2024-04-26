package org.restAssured;

import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestExamplesSuite {

    String URL = "https://test-abbs-api.cargoes.com/abbs/api/v1/customers/addresses/EUC00002515";
    HashMap<String , String> headerMap;
    Header headers = new Header("","");


    @BeforeTest
    public void setup(){
        headerMap = new HashMap<>();
        headerMap.put("tenant-id","026d4b96-4ae6-4f1b-858d-4c3190a6a596");
    }
    @Test
    public void get(){
        Response response = given()
                .headers(headerMap)
                .queryParam("tenant_id","026d4b96-4ae6-4f1b-858d-4c3190a6a596")
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
        Assert.assertEquals(jsonPath.get("paymentMethod"),"DIRECT_DEBIT");
        Assert.assertTrue(response.body().asString().contains("paymentMethod"));
/**
        String resp = response.getBody().asString();
        BillDetails billDetails = mapper.readValue(resp, BillDetails.class);
 */
    }

}
