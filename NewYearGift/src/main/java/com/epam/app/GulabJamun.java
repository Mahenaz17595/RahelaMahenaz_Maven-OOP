package com.epam.app;

public class GulabJamun extends Sweets {

    public GulabJamun () {
    }

    public GulabJamun(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
    }
    
    public int calcwt(int quantity,int weight)
	{
		return quantity*weight;
	}
   


}