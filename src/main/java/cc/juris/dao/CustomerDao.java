package cc.juris.dao;

import javax.enterprise.context.RequestScoped;

import cc.juris.model.Customer;
import static org.hibernate.criterion.Restrictions.eq;

@RequestScoped
public class CustomerDao extends AbstractDao<Customer> {

	public Customer findByDomain(String domain) {
		return getByCriteria(eq("domain", domain));
	}
	
}
