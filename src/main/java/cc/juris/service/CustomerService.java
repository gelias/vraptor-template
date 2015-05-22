package cc.juris.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import cc.juris.dao.CustomerDao;
import cc.juris.model.Customer;

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
