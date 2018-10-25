package com.telecom.tel.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.tel.Model.Customer;
import com.telecom.tel.Service.CustomerService;

//This is the change in the existing file

@RestController
@RequestMapping("/cust")
public class CustomerApi {

	@Autowired
	CustomerService custServ;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<>(custServ.getAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer cust) {
		custServ.addCustomer(cust);
	}
	
}
