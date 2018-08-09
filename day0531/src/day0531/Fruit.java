package day0531;

public class Fruit {
	String name;
	int amount = 0;
	String color[]= {"red","yellow","green"};
	public void eat(Fruit fruit,int eatAmount) {
		System.out.println("Áö±Ý "+fruit.name+"¸¦  ¸ÔÀ½");
		amount= amount-eatAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	
}
