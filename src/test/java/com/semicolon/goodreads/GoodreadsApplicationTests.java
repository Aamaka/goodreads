//package com.semicolon.goodreads;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.sql.DataSource;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//class GoodreadsApplicationTests {
//
//
//    @Autowired
//    private DataSource dataSource;
//    @Test
//    void contextLoads() {
//        assertNotNull(dataSource);
//        try{
//            Connection connection = dataSource.getConnection();
//            assertNotNull(connection);
//            assertEquals("goodreads", connection.getCatalog());
//            log.info("Catalog --> {}", connection.getCatalog());
//        }catch (SQLException e){
//            log.info("An error occurred --> {}", e.toString());
//        }
//    }
//
//}
