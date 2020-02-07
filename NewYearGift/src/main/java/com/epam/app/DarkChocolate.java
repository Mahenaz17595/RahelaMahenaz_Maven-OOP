package com.epam.app;

public class DarkChocolate extends Sweets {

    public DarkChocolate() {
    }

    public DarkChocolate(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
    }
    
    public int calcwt(int quantity,int weight)
	{
		return quantity*weight;
	}

}
