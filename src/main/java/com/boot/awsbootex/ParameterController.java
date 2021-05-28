package com.boot.awsbootex;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ParameterController {


    private final AwsParameters parameters;

    @GetMapping("/")
    public String param(){
        return parameters.getUrl();
    }
}
