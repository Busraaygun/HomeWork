package Concretes;

import Abstract.GamerCheckService;
import Entitis.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
	System.out.println("Sisteme giri� yap�ld�.");
		return true;
	}

	@Override
	public boolean checkIfNotRealPerson(Gamer gamer) {
	    System.out.println("sisteme giri� yap�lamad�...");
		return false;
	}

	

}
