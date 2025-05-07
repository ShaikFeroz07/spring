package com.neoteric.springboot.endpoints;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DBService {

    private final HikariDataSource dataSource;

    public DBService(HikariDataSource dataSource){
        this.dataSource=dataSource;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
