package com.getterSetter;

public class Pizza {
	private String sizeOfPizza;
	private int numOfcheese;
	private int numOfPepperoni;
	private int numOfHam;
	
	
	public Pizza(String sizeOfPizza, int numOfcheese, int numOfPepperoni, int numOfHam) {
		
		this.sizeOfPizza = sizeOfPizza;
		this.numOfcheese = numOfcheese;
		this.numOfPepperoni = numOfPepperoni;
		this.numOfHam = numOfHam;
	}
//we use getters setters methods with private variable otherwise it is unnecessary
	public String getSizeOfPizza() {
		return sizeOfPizza;
	}

	public void setSizeOfPizza(String sizeOfPizza) {
		this.sizeOfPizza = sizeOfPizza;
	}

	public int getNumOfcheese() {
		return numOfcheese;
	}

	public void setNumOfcheese(int numOfcheese) {
		this.numOfcheese = numOfcheese;
	}

	public int getNumOfPepperoni() {
		return numOfPepperoni;
	}

	public void setNumOfPepperoni(int numOfPepperoni) {
		this.numOfPepperoni = numOfPepperoni;
	}

	public int getNumOfHam() {
		return numOfHam;
	}

	public void setNumOfHam(int numOfHam) {
		this.numOfHam = numOfHam;
	}

	public double calcCost()
	{		
		if(sizeOfPizza.equalsIgnoreCase("small"))
		{
			return 10 + (numOfcheese + numOfPepperoni + numOfHam) * 2;
		}
		else if(sizeOfPizza.equalsIgnoreCase("medium"))
		{
			return 12 + (numOfcheese + numOfPepperoni + numOfHam) * 2;
		}
		else if(sizeOfPizza.equalsIgnoreCase("large"))
		{
			return 14 + (numOfcheese + numOfPepperoni + numOfHam) * 2;
		}
		else
		{
			return 0.0;
		}
	}

	public String getDescription()
	{
		return sizeOfPizza + " Pizza with "+numOfcheese+" Cheese toppings, " 
				+ numOfPepperoni + " Pepperoni toppings, "
				+ numOfHam + " Ham toppings. " 
				+ "\n Total Price: " + calcCost()+"\n";
	}
}