package com.epam.app;

public class MilkChocolate extends Sweets {

    public MilkChocolate() {
        super();
    }

    public MilkChocolate(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
    }
    
    public int calcwt(int quantity,int weight)
	{
		return quantity*weight;
	}

}