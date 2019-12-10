package edu.immune.sw.pattern.strategy;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;

/**
 * Processes refund between two entities
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 */
public class Refund implements Transactionable {
	
	/**
	 * Since the business will be in the center of transactions, the business account is bound to the implementations 
	 */
	private BusinessAccount businessAccount;
	
	public Refund(BusinessAccount businessAccount) {
		this.businessAccount = businessAccount;
	}

	/**
	 * make a refund to the customer
	 */
	public synchronized void transact(Customer customer, long amount) {
		businessAccount.deduct(amount);
		customer.add(amount);
	}

}
