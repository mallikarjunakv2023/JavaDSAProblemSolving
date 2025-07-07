package CollectionAndDSA.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In this example, the difference between `Comparable` and `Comparator` is as follows:
 *
 * ### `Comparable`:
 * - The `Employee` class implements the `Comparable<Employee>` interface.
 * - The `compareTo` method (lines 46-49) defines the natural ordering of `Employee` objects, which is based on the `id` field.
 * - When you use `Arrays.sort(empArr)` (line 61), it will sort the array using this natural ordering defined in the `compareTo` method.
 *
 * ### `Comparator`:
 * - A custom `Comparator<Employee>` is defined as a lambda expression (lines 26-33).
 * - This allows you to define an alternative ordering for `Employee` objects, also based on the `id` field in this case.
 * - When you use `Arrays.sort(empArr, com)` (line 77), it sorts the array using this custom comparator instead of the natural ordering.
 *
 * ### Key Differences:
 * 1. **Purpose**:
 *    - `Comparable` is used to define the natural ordering of objects (e.g., default sorting).
 *    - `Comparator` is used to define custom sorting logic.
 *
 * 2. **Implementation**:
 *    - `Comparable` is implemented in the class itself (`Employee` in this case).
 *    - `Comparator` is implemented externally, allowing multiple sorting strategies without modifying the class.
 *
 * 3. **Usage**:
 *    - `Comparable` is used when calling `Arrays.sort(empArr)` directly.
 *    - `Comparator` is used when calling `Arrays.sort(empArr, com)` with a custom comparator.
 *
 * In this example, both approaches sort by `id`, but `Comparator` provides flexibility to define additional or alternative sorting logic.
 */

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Override the compareTo method to compare Employee objects based on id, this is for Comparable interface.
    // This ensures the natural order of Employee objects based on id.
    //@Override
    public int compareTo1(Employee o) {
        return this.id - o.id;
    }

    // compareTo method to compare based on name
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Employee[] empArr = new Employee[6];
        empArr[0] = new Employee(5,"Mallik");
        empArr[1] = new Employee(2,"Ajum");
        empArr[2] = new Employee(3,"Arjun");
        empArr[3] = new Employee(1,"Madan");
        empArr[4] = new Employee(5,"Madan");
        empArr[5] = new Employee(10,"Chethan");

        // Sorting the Employee array using the compareTo method
        Arrays.sort(empArr);
        System.out.println("Array1 : "+Arrays.toString(empArr));

        // Using a custom comparator to sort Employee objects based on id in ascending order. This is for Comparator interface.
        // The custom comparator is defined using a lambda expression. This ensures that the Employee objects are
        // sorted based on id in ascending order.
        Comparator<Employee> com = (e1, e2) -> {
            if(e1.id < e2.id){
                return -1;
            }else if(e1.id > e2.id){
                return 1;
            }
            return 0;
        };

        // Sorting the Employee array using the custom comparator
        Arrays.sort(empArr, com);

        System.out.println("Array2 : "+Arrays.toString(empArr));
    }

    @Override
    public String toString(){
        return this.id +" "+this.name;
    }
}
