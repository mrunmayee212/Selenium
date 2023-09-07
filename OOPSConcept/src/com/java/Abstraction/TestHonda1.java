package com.java.Abstraction;

public class TestHonda1 {

	public static void main(String[] args) {
		Honda1 h = new Honda1();
		System.out.println(h.wheels);
		h.start();
		
		Suzuki s = new Suzuki();
		s.start();
	}

}
