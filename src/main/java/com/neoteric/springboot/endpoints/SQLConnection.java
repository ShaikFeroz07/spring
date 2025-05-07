package com.neoteric.springboot.endpoints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//public class SQLConnection {
//    public List<Employee> getEmployeeDetails(){
//
//        String url = "jdbc:mysql://localhost:3306/emp_db";
//        String username = "root";
//        String password = "Salaar07";
//        List<Employee>list = new ArrayList<>();
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (Exception e){
//            System.out.println("exception occurred while loading the driver" + e);
//            e.printStackTrace();
//        }
//
//        try {
//            Connection connection = null;
//            connection = DriverManager.getConnection(url,username, password);
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp_db.employees");
//            while (resultSet.next()){
//                String id = resultSet.getString("empId");
//                String name= resultSet.getString("name");
//                double salary = resultSet.getDouble("sal");
//                Employee empDetails = new Employee();
//                empDetails.setEmpId(id);
//                empDetails.setName(name);
//                empDetails.setSal(salary);
//                list.add(empDetails);
//            }
//
//        } catch (Exception e) {
//            System.out.println("Exception occurred while getting the connection");
//
//        }finally {
//            System.out.println("Exit from getEmpDetails");
//        }
//
//         return list;
//    }
//}
