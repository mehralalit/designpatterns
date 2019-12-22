package edu.immune.sw.pattern.test;

import edu.immune.sw.pattern.observer.AccountantDisplay;
import edu.immune.sw.pattern.observer.CustomerDisplay;
import edu.immune.sw.pattern.observer.FinancialExchange;
import edu.immune.sw.pattern.observer.FinancialExchangeMonitor;
import edu.immune.sw.pattern.observer.Observer;

/**
 * Functional Test to verify Observer Design Patter functionality
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 * @see CustomerDisplay
 * @see AccountantDisplay
 * @see FinancialExchange
 * @see FinancialExchangeMonitor
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		
		/* Initialise Observers */
		Observer customerDisplay = new CustomerDisplay();
		Observer accountantDisplay = new AccountantDisplay();
		
		/* Initialise FinancialExchangeMonitor and register observers with it */
		FinancialExchangeMonitor monitor = new FinancialExchangeMonitor();
		monitor.registerObserver(customerDisplay);
		monitor.registerObserver(accountantDisplay);
		
		/* Initialise FinancialExchange */
		FinancialExchange exchange = new FinancialExchange(monitor);
		exchange.start();
		
	}

}
