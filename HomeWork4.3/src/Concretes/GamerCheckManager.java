package Concretes;

import Abstract.GamerCheckService;
import Entitis.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
	System.out.println("Sisteme giriþ yapýldý.");
		return true;
	}

	@Override
	public boolean checkIfNotRealPerson(Gamer gamer) {
	    System.out.println("sisteme giriþ yapýlamadý...");
		return false;
	}

	

}
