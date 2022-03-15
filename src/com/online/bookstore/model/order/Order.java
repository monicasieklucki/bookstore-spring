package com.online.bookstore.model.order;

import java.util.List;

public interface Order {
	public String getOrderId();
	public void setOrderId(String orderId);
	public List<OrderDetail> getOrderDetails();
	public void setOrderDetails(List<OrderDetail> orderDetails);
	public void setOrderState(String orderState);
	public String getOrderState();
	public boolean getPaymentStatus();
	public void setPaymentStatus(boolean paymentReceived);
	public void addProduct(OrderDetail orderDetail);
	public void cancelOrder();
	public void confirmOrder();
	public void orderDelivered();
	public void orderPayed();
	public void orderSendOut();
	public boolean isFinished();
	public double getOrderTotal();
}
