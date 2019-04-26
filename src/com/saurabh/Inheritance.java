package com.saurabh;

class A {
	public int add() {
		return 2 + 2;
	}

	public int sub() {
		return 3 - 2;
	}
}

class B extends A {
	public int divide() {
		return 10 / 2;
	}
}

public class Inheritance {
	public static void main(String args[]) {
		B b = new B();
		b.add();
		b.sub();
		b.divide();

	}
}