package com.baeldung.stripe;

import lombok.Data;

@Data
public class ChargeRequest {

    public enum Currency {
        EUR, USD;
    }
    private String description;
    private int amount = 100; // cents
    private Currency currency;
    private String stripeEmail = "a@gmail.com";
    private String stripeToken;
	public Object getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}
	public Object getCurrency() {
		// TODO Auto-generated method stub
		return currency;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	public Object getStripeToken() {
		// TODO Auto-generated method stub
		return stripeToken;
	}
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		this.description = "Checking";
		
	}
	public void setCurrency(Currency usd) {
		// TODO Auto-generated method stub
		this.currency = usd;
	}
}
