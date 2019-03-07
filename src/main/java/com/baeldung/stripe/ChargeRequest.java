package com.baeldung.stripe;

import lombok.Data;

@Data
public class ChargeRequest {

    public enum Currency {
        EUR, USD;
    }
    private String description;
    private int amount; // cents
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
	public Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCurrency() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getStripeToken() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setCurrency(Currency usd) {
		// TODO Auto-generated method stub
		this.currency = usd;
	}
}
