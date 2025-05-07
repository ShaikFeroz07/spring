package com.neoteric.springboot.endpoints;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.PanelUI;

@Configuration
@ComponentScan("com.neoteric.springboot.endpoits")
public class SpringJavaTest {

    @Bean
    public HikariDataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/student_endpoints");
        config.setUsername("root");
        config.setPassword("Salaar07");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return new HikariDataSource(config);

    }

    @Bean
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaTest.class);
        HelloService helloService = context.getBean(HelloService.class);
        for (int i = 0; i < 10; i++){
            helloService.sayHi();
        }
    }
}
