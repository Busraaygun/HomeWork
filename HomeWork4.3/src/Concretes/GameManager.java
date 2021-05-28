package Concretes;

import Abstract.GameService;
import Entitis.Game;

public class GameManager implements GameService {

	@Override
	public void save(Game game) {
		System.out.println("oyun kaydedildi" + game.getGameName());
		
	}

	@Override
	public void Delet(Game game) {
		System.out.println("oyun silindi" + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncelendi " + game.getGameName());
		
	}

	@Override
	public void Login(Game game) {
		System.out.println("oyuna girildi" + game.getGameName());
		
	}

	
	

	
}
