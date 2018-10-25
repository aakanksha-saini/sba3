package com.telecom.tel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.tel.Dao.CustomerDao;
import com.telecom.tel.Model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerDao custDao;
	
	@Override
	public List<Customer> getAllCustomers() {
		return custDao.findAll(); 
	}

	@Override
	public void addCustomer(Customer cust) {
		 custDao.save(cust);
	}

}
