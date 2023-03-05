package com.seed.inDemo;

public enum Coffee {
	COLDCOFFEE,CHESSEPIZZA,BURGER,BADAMSHAKES;
	
	public double COFFEEPrice(int qty)
	{	
		return 45.00 *qty;
	}
	public double CHESSEPIZZAPrice(int qty)
	{
		return 350.00 * qty;
	}
	public double BURGERPrice(int qty)
	{
		return 70.00 *qty;
	}
	public double BADAMSHAKESprice(int qty)
	{
		return 40.00 *qty;
	}

}
