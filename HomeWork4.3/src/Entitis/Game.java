package Entitis;

public class Game {
	
	private int id;
	private String gameName;
	private String gameCategory;
	private double price;
	
	
	
	public Game(int id, String gameName, String gameCategory, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public String getGameName() {
		return gameName;
	}


	public String getGameCategory() {
		return gameCategory;
	}


	public double getPrice() {
		return price;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	
	
		
	

}
