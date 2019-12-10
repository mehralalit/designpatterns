package edu.immune.sw.pattern.strategy;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;

/**
 * Processes payment between two entities
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 *
 */
public class Payment implements Transactionable {

	
	/**
	 * Since the business will be in the center of transactions, the business account is bound to the implementations 
	 */
	private BusinessAccount businessAccount;
	
	public Payment(BusinessAccount businessAccount) {
		this.businessAccount = businessAccount;
	}
	
	/**
	 * make a payment to the business account
	 */
	public synchronized void transact(Customer customer, long amount) {
		customer.deduct(amount);
		businessAccount.add(amount);
	}

}
