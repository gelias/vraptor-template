package cc.juris.controller;

import javax.inject.Inject;

import cc.juris.model.Customer;
import cc.juris.service.CustomerService;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class CustomerController {

	@Inject
	private Result result;
	@Inject
	private CustomerService service;

	@Get("/customer/add/{codigo}/{name}")
	public void index(Long codigo, String name) {
		Customer customer = new Customer();
		customer.setId(codigo);
		customer.setDomain(name);
		service.add(customer);
	}

}
