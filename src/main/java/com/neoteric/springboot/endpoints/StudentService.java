package com.neoteric.springboot.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class StudentService {
    @Autowired
    private DBService dbService;

    public void hello(){
        try (Connection conn = dbService.getConnection()){
            System.out.println("Connected to DB:" + !conn.isClosed());
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("Hello from Student service");
    }
}
