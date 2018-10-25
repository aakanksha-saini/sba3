package com.telecom.tel.Service;

import java.util.List;

import com.telecom.tel.Model.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	void addCustomer(Customer cust);
}
