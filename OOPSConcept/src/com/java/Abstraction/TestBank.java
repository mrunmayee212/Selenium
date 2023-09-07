package com.java.Abstraction;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
   Bank b = new SBIBank();
   System.out.println("Rate of interest is:" + b.getRateofInterest());
   
   
   Bank b1 = new HDFCBank();
   System.out.println("Rate of interest is:" + b1.getRateofInterest());
	}

}
