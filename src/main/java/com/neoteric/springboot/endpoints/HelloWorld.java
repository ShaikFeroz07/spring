package com.neoteric.springboot.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorld {

//    private static Map<String,Employee> employeeMap = new HashMap<>();
//
//    static {
//        Employee e = new Employee();
//        e.setName("gopi");
//        e.setSal(10000.00);
//        e.setEmpId("NEO123");
//
//        Employee e2 = new Employee();
//        e2.setName("feroz");
//        e2.setSal(20000.00);
//        e2.setEmpId("NEO123");
//        employeeMap.put(e.getEmpId(),e);
//        employeeMap.put(e2.getEmpId(),e2);
//
//    }

    SQLConnection sqlConnection = new SQLConnection();



    @GetMapping(value = "/getemployee/{empId}")
    public Employee findEmployee (@PathVariable String empId) {
        System.out.println("Enter into getEmployee" + empId);
        //Employee e = employeeMap.get(empId);
        List<Employee> employees=sqlConnection.getEmployeeDetails();
      //  System.out.println("Exit from getEmployee");
       // return e;

        for (Employee employee:employees){

            if (employee.getEmpId().equalsIgnoreCase(empId)){
                System.out.println("Eixt from getEmployee:found");
            }
        }
        System.out.println("Exit from getEmployee:notFound");
        return null;
    }


}

