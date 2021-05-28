package com.boot.awsbootex;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@RequiredArgsConstructor
public class ConnectionManager {

    private final AwsParameters parameters;


    @Value("${address}")
    private String url;

    @Value("${password}")
    private String password;

    @Value("${username}")
    private String username;

    static {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Connection getConn() throws SQLException {
        String db = "jdbc:mariadb://" + url +"/" + username;

        return DriverManager.getConnection(db, username, password);
    }
}
