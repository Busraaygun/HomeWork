package Adapter;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdepter implements CustomerCheckService  {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.valueOf(Customer.getNationalityid()), customer.getFirstName(), customer.getLastName(), customer.getBirthDate());
		
		

}
}