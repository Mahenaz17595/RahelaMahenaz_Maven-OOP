package com.epam.app;

public class WhiteChocolate extends Sweets {

    public WhiteChocolate() {
        super();
    }

    public WhiteChocolate(double aSugarLevel, double aWeight) {
        setSugarLevel(aSugarLevel);
        setWeight(aWeight);
    }

	@Override
	public int calcwt(int quantity, int weight) {
		// TODO Auto-generated method stub
		return 0;
	}

}