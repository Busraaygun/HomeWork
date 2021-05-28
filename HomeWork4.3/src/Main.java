import java.time.LocalDate;

import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerCheckManager;
import Concretes.GamerManager;
import Concretes.StoreManager;
import Entitis.Campaign;
import Entitis.Game;
import Entitis.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer (1 , "Büþra", "Aygün",LocalDate.of(1999, 1, 3), "11265049050");
	
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
				
		gamerManager.save(gamer);
		gamerManager.updelet(gamer);
		gamerManager.Delet(gamer);
		

		Game game1 = new Game(3, "League of Legends","League of Legends onile strateji oyunu ", 20);
		
		GameManager gameManager = new GameManager();
		
		gameManager.save(game1);
		gameManager.Delet(game1);
		gameManager.update(game1);
		
		Campaign campaign = new Campaign(1, "Hafta sonu indirimleri", "Hafta sonuna özel indirimleri",15.0);
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.deleteCampaign(campaign);
		campaignManager.NewCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		StoreManager storeManager = new StoreManager();
		storeManager.saleWithCampaign(gamer, game1, campaign);
		storeManager.saleWithoutCampaign(gamer, game1);
		
	   System.out.println(gamer.getFirstName()+gamer.getLastName());
	
	   storeManager.saleWithCampaign(gamer, game1, campaign);
	   storeManager.saleWithoutCampaign(gamer, game1);
	   
	   System.out.println(game1.getPrice());
	   
		
	
}
}
