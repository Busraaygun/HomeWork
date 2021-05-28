package Concretes;

import Abstract.StoreService;
import Entitis.Campaign;
import Entitis.Game;
import Entitis.Gamer;

public class StoreManager implements StoreService {

	@Override
	public void saleWithoutCampaign(Gamer gamer, Game game) {
		
       System.out.println(game.getGameName()+ "/"+ game.getGameCategory() + "satýþ fiytý : " + game.getPrice() );
       System.out.println("Tebrikler" + gamer.getFirstName()+ gamer.getLastName()+ ", oyunu baþarýyla satýn aldýnýz.");
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		
		var result = game.getPrice() - (game.getPrice() * campaign.getDiscountPersentage()/ 100);
		
		System.out.println(game.getId()+ "/" + game.getGameCategory() + "ile satýn alýn: "+ campaign.getCampaignName() + "ile" + result  );
		System.out.println("Tebrikler"+ gamer.getFirstName() + gamer.getLastName() +", oyunu baþarýyla satýn aldýnýz" );
	}

	

}
