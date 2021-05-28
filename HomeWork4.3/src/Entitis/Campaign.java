package Entitis;

import java.time.LocalDate;

public class Campaign {

	private int id;
	String campaignName;
	int discountPersentage;
	private LocalDate StartDate;
	private LocalDate FinalDate;
	
	
	public Campaign(int id, String campaignName, int discountPersentage, LocalDate startDate, LocalDate finalDate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPersentage = discountPersentage;
		StartDate = startDate;
		FinalDate = finalDate;
	}
	public Campaign(int i, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public int getDiscountPersentage() {
		return discountPersentage;
	}
	public LocalDate getStartDate() {
		return StartDate;
	}
	public LocalDate getFinalDate() {
		return FinalDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public void setDiscountPersentage(int discountPersentage) {
		this.discountPersentage = discountPersentage;
	}
	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}
	public void setFinalDate(LocalDate finalDate) {
		FinalDate = finalDate;
	}
	
	
}
