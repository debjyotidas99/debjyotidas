package com.jtc.spring_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean("getEmails")
	public List<String> getEmails() {
		List<String> email = new ArrayList<String>();
		email.add("abc@gmail.com");
		email.add("efg@gmail.com");
		email.add("xyz@gmail.com");
		return email;
	}

	@Bean("getPhones")
	public Set<Long> getPhones() {
		Set<Long> phone = new HashSet<Long>();
		phone.add((long) 951350579);
		phone.add((long) 834972419);
		phone.add((long) 942732579);
		return phone;
	}

	@Bean("getRef")
	public Map<String, Integer> getRef() {
		Map<String, Integer> ref = new HashMap<String, Integer>();
		ref.put("Amazon", 2);
		ref.put("Flipkart", 3);
		ref.put("Messho", 1);
		return ref;
	}
//---------------------------------------------------------------------------

	@Bean("getAddress2")
	public Address createAddressess() {
		System.out.println("Addresses");
		Address add3 = new Address("Ashti", "Gadchiroli", 443805);
		return add3;
	}
	
	@Bean("getAddress2")
	public Address createAddress() {
		System.out.println("Address");
		Address add1 = new Address("Vasantpur", "Gadchiroli", 442707);
		return add1;
	}

	@Bean("getAddress2")
	public Address createAddresses() {
		System.out.println("Addresses");
		Address add2 = new Address("Ghot", "Gadchiroli", 446306);
		return add2;
	}
	
	

//----------------------------------------------------------------------------
	@Bean("getAccount")
	public List<Account> getAccount() {
		System.out.println("Account");
		List<Account> account = new ArrayList<Account>();
		account.add(new Account(98364933, "Ashti", 3000.00, 2000f));
		account.add(new Account(987465216, "Ghot", 4500.00, 3000f));
		return account;
	}

	@Bean("getCustomer")
	public Customer getCustomer(List<String> email, Set<Long> phone, Map<String, Integer> ref, Address add,
			List<Account> acc) {
		System.out.println("Customer");
		Customer cust = new Customer();
		cust.setCid(101);
		cust.setName("Jaggu");
		cust.setsalary(36000.00);
		cust.setEligibleToVote(true);
		cust.setEmails(email);
		cust.setPhones(phone);
		cust.setRef(ref);
		cust.setAddress(add);
		cust.setAccount(acc);
		return cust;
	}

}