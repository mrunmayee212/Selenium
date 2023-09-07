package com.polymorphism;

public class TestPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingBase base = new OverridingBase();
		base.methodToOverride();

		OverridingBase base1 = new DerivedClassOverride();
		base1.methodToOverride();
	}

}
