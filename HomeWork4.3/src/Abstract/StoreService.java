package Abstract;

import Entitis.Campaign;
import Entitis.Game;
import Entitis.Gamer;

public interface StoreService {

 void saleWithoutCampaign ( Gamer gamer, Game game);
 void saleWithCampaign (Gamer gamer, Game game, Campaign campaign);
	
	
}

