package Concretes;

import Abstract.GamerSevice;

import Entitis.Gamer;

public class GamerManager implements GamerSevice{



	public GamerManager(GamerCheckManager gamerCheckManager) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Gamer gamer) {
		
		System.out.println("oyuncu kaydedildi" + gamer.getFirstName()+ gamer.getLastName());
	}

	@Override
	public void Delet(Gamer gamer) {
		System.out.println("oyuncu silindi" + gamer.getFirstName()+ gamer.getLastName());
	
	}

	@Override
	public void updelet(Gamer gamer) {
		System.out.println("oyuncu güncelendi" + gamer.getId());	
	}

	
		
	

}
