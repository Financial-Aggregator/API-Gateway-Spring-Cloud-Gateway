package ru.bank.apigatewayspringcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewaySpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewaySpringCloudGatewayApplication.class, args);
    }

}
