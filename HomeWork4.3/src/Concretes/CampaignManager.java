package Concretes;

import Abstract.CampingService;
import Entitis.Campaign;

public class CampaignManager implements CampingService {

	@Override
	public void NewCampaign(Campaign campaign) {
		System.out.println("yeni kampanya olu�turuldu. "+ campaign.getCampaignName()+ campaign.getStartDate()+ campaign.getFinalDate()+ campaign.getDiscountPersentage());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("kanpanya silindi." + campaign.getCampaignName());
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("kampanya g�ncelendi." + campaign.getId()+ campaign.getStartDate()+campaign.getFinalDate());
		
	}

}
 