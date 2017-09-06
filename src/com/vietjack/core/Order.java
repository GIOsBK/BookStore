package com.vietjack.core;

import java.util.Date;

public class Order {
	private long id;
	private Date orderDate;
	private Customer customer;
	

	public Order() {
		super();
	}

	public Order(long id, Date orderDate, Customer customer) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.customer = customer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", customer=" + customer + "]";
	}

}
