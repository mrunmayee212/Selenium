package com.polymorphism;

public class OverLoad {

	void demo(int a) {
System.out.println("a"+ a);
	}

	void demo(int a, int b) {
		System.out.println("a: b"+ a+b);
	}

	double demo(double a) {
		System.out.println("double a"+ a);
		return a*a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad obj = new OverLoad();
		obj.demo(10);
		obj.demo(10, 20);
		double result = obj.demo(5.6);
		System.out.println("Output of double is "+ result);
	}

}
