package com.boot.awsbootex;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class AwsParametersTest {

    @Autowired
    AwsParameters parameters;

    @Autowired
    ConnectionManager manager;

    @Autowired
    ObjectMapper mapper;

    @Test
    void mapperTest() throws JsonProcessingException {
        String n = "123";
        assertEquals(n, mapper.readValue(mapper.writeValueAsString(n), String.class));
    }

    // TEST success
    @Test
    void parameter() {
        String key = parameters.getUrl();
        System.out.println(key);
        assertNotNull(key);
    }

    // TEST SUCCESS
    @Test
    void dbConnTest() throws SQLException {
        ResultSet rs = manager.getConn().prepareStatement("SELECT 1 FROM dual").executeQuery();
        assert rs.next();
        assertEquals(rs.getInt(1), 1);
    }
}