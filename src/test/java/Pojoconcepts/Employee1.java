package Pojoconcepts;

import io.restassured.mapper.ObjectMapper;



public class Employee1 {

    public static void main(String args[]) {
        Employee employee1 = new Employee();

        employee1.setFirst_name("world");
        employee1.setLast_name("hello");
        employee1.setCity("keeranur");

        System.out.println(employee1.getFirst_name());


//
//   ObjectMapper mapper= new ObjectMapper();
//
//   String employyejson=mapper.writeWIthdefaultprettyprinter().writevalue();



        };
    }
