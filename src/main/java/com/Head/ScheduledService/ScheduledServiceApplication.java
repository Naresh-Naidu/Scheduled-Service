package com.Head.ScheduledService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.head")
@EnableEurekaClient
@EnableScheduling
public class ScheduledServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledServiceApplication.class, args);
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
