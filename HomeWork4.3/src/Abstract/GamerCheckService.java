package Abstract;

import Entitis.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
	boolean checkIfNotRealPerson(Gamer gamer);

}
