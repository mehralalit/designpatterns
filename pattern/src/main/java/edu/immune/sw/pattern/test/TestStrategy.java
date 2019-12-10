package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.base.model.BusinessAccount;
import edu.immune.sw.pattern.base.model.Customer;
import edu.immune.sw.pattern.strategy.Payment;
import edu.immune.sw.pattern.strategy.Refund;
import edu.immune.sw.pattern.strategy.Transactionable;

/**
 * Functional Test
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 *
 */
public class TestStrategy {

	private Transactionable payment;
	private Transactionable refund;
	private BusinessAccount businessAccount;
	
	public TestStrategy() {
		businessAccount = new BusinessAccount("BA001", "Immune Inc.", 1000);
		payment = new Payment(businessAccount);
		refund = new Refund(businessAccount);
	}
	
	public Transactionable getPayment() {
		return payment;
	}
	
	public Transactionable getRefund() {
		return refund;
	}
	
	public BusinessAccount getBusinessAccount() {
		return businessAccount;
	}
	
	public static void main(String[] args) {
		TestStrategy testStrategy = new TestStrategy();
		Customer customer = new Customer("Superman", "Cust001");
		
		System.out.println("Initiating Transaction");
		customer.print();
		testStrategy.getBusinessAccount().print();
		System.out.println();
		
		testStrategy.getPayment().transact(customer, 50);
		
		System.out.println("Process Payment");
		customer.print();
		testStrategy.getBusinessAccount().print();
		System.out.println();
		
		testStrategy.getRefund().transact(customer, 30);
		
		System.out.println("Process Refund");
		customer.print();
		testStrategy.getBusinessAccount().print();
	}
	
}
