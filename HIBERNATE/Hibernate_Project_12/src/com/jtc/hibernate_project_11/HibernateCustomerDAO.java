package com.jtc.hibernate_project_11;

public class HibernateCustomerDAO implements CustomerDAO {

	Hibernate_Template temp = null;

	public HibernateCustomerDAO(Hibernate_Template temp) {
		this.temp = temp;
	}

	

	@Override
	public void addCustomer(CustomerTO cto) {
		Customer cust = new Customer(cto.getCid(), cto.getName(), cto.getEmail(), cto.getPhone());
		temp.save(cust);

	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Customer cust = new Customer(cto.getCid(), cto.getName(), cto.getEmail(), cto.getPhone());
		temp.update(cust);

	}

	@Override
	public void deleteCustomer(int cid) {
		temp.delete(Customer.class, cid);

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer cust = (Customer) temp.load(Customer.class, cid);
		CustomerTO cto = new CustomerTO(cust.getCid(), cust.getName(), cust.getEmail(), cust.getPhone());
		return cto;
	}

}
