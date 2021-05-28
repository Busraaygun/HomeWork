import java.rmi.RemoteException;
import java.sql.Date;

import Abstracts.BaseCustomerManager;
import Concretes.NeroCustomerMAnager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new NeroCustomerMAnager();
		customerManager.Save(new Customer(1, "B��ra", "Ayg�n", "12345678910", Date.valueOf("1999, 1, 4")));
		System.console ();
	}

	

}
