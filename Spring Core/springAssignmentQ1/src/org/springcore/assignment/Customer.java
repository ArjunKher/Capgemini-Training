package org.springcore.assignment;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	
	public Customer(int customerId, String customerName, int customerNumber, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress=customerAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}


	public String getCustomerName() {
		return customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void printDetails() {
		System.out.println("Customer ID: "+getCustomerId());
		System.out.println("Customer Name: "+getCustomerName());
		System.out.println("Customer Contact: "+getCustomerContact());
		System.out.println("Customer Address:\n Street: "+ getCustomerAddress().getStreet() +"\n City: "+getCustomerAddress().getCity() +"\n State: "+getCustomerAddress().getState()+"\n Zip Code: "+getCustomerAddress().getZip()+"\n Country: "+getCustomerAddress().getCountry() );
	}
}
