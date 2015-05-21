package me.umov.auth.dao;

import javax.enterprise.context.RequestScoped;
import static org.hibernate.criterion.Restrictions.eq;

import me.umov.auth.model.Customer;

@RequestScoped
public class CustomerDao extends AbstractDao<Customer> {

	public Customer findByDomain(String domain) {
		return getByCriteria(eq("domain", domain));
	}
	
}
