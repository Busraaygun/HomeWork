package Concretes;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws RemoteException {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
			
		}
		
		else {
			
			System.out.println("not a person..");
		}

}
}