package me.umov.auth.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import me.umov.auth.dao.CustomerDao;
import me.umov.auth.model.Customer;

@RequestScoped
public class CustomerService {

	@Inject
	private CustomerDao dao;
	
	public Customer add(Customer customer){
		return dao.save(customer);
	}
	
	public Customer findByDomain(String domain) {
		return dao.findByDomain(domain);
	}

}
