package com.boot.awsbootex;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class AwsParameters {

//    @Value("${secret.key}")
//    private String secret;

    @Value("${address}")
    private String url;

    @Value("${password}")
    private String password;

    @Value("${username}")
    private String username;
}
