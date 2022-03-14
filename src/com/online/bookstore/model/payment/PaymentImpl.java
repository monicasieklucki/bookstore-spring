package com.online.bookstore.model.payment;

public class PaymentImpl implements Payment{
	
	private boolean paymentReceived;
	
	public boolean isPaymentReceived() {
		return paymentReceived;
	}

	public void setPaymentReceived(boolean paymentReceived) {
		this.paymentReceived = paymentReceived;
	}
}
