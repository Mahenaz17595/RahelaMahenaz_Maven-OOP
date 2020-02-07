package com.epam.app;


public class Halva extends Sweets {


    public Halva() {
    }

    public Halva(double aSugar, double aWeight) {
        setSugarLevel(aSugar);
        setWeight(aWeight);
    
    }
    public int calcwt(int quantity,int weight)
	{
		return quantity*weight;
	}

}