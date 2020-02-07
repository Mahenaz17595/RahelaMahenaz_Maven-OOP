package com.epam.app;


public class Candies extends Sweets {
	
	public Candies () {
	    }

	    public Candies(double aSugarLevel, double aWeight) {
	        setSugarLevel(aSugarLevel);
	        setWeight(aWeight);
	    }
	    public int calcwt(int quantity,int weight)
		{
			return quantity*weight;
		}
	    
}