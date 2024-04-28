package org.CollectionAndDSA.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Employee[] empArr = new Employee[6];
        empArr[0] = new Employee(5,"Mallik");
        empArr[1] = new Employee(2,"Ajum");
        empArr[2] = new Employee(3,"Arjun");
        empArr[3] = new Employee(1,"Madan");
        empArr[4] = new Employee(5,"Madan");
        empArr[5] = new Employee(10,"Chethan");
        //Arrays.sort(empArr);
        System.out.println("Array : "+Arrays.toString(empArr));

        Comparator<Employee> com = (e1, e2) -> {
            if(e1.id < e2.id){
                return -1;
            }else{
                return 1;
            }
        };
        Arrays.sort(empArr, com);
        System.out.println("Array : "+Arrays.toString(empArr));
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name;
    }
}
