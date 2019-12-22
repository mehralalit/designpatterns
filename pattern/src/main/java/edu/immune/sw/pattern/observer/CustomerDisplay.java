package edu.immune.sw.pattern.observer;

import edu.immune.sw.pattern.base.model.FinancialTransaction;

/**
 * Observer of Financial Exchange. Displays customer relevant information.<br>
 * 
 * @author Lalit Mehra
 * @since Dec 20, 2019
 */
public class CustomerDisplay implements Observer {
	
	@Override
	public void update(FinancialTransaction txn) {
		System.out.printf("Customer Display | Payer: %s, Amount: %d, Balance: %d \n", txn.getPayer().getName(), txn.getAmount(), txn.getPayee().getBalance());
	}
	
	public String getName() {
		return "Customer Display";
	}

}
