package com.example.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/temp")
public class TempControllerApiV1 {

    @Value("${server.port}")
    private Integer serverPort;

    @Value("${message}")
    private String message;

    @GetMapping
    public String get() {
        return "product-service port : " + serverPort + " message " + message;
    }

}
