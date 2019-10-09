package com.Head.Controller;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Head.Model.Employee;

@Configuration
@RestController
public class ScheduledController {

	
	@Autowired
	private RestTemplate template;
	
	@Scheduled(fixedRate = 60000)
	public void addEmployee() {
		
		Random random=new Random();
		HttpEntity<Employee> request = new HttpEntity<>(new Employee(random.nextInt(100) , "xyz", random.nextInt(14-10)+10, 22));
		
		Employee emp=template.postForObject("http://employee-Service/addEmployee",request, Employee.class);
		
		//ResponseEntity<Employee> addressResponse = template.exchange("http://employee-Service/addEmployee",
			//	HttpMethod.POST, request, new ParameterizedTypeReference<Employee>() {
				//});
		
		System.out.println("Employee "+emp.getId() +" is created..");
		System.out.println("Refreshed...!");
		
	}
}
