package com.saurabh;

public class SingletonClass {
	public static void main(String args[]) {
		TestSingletonClass testSingletonClass = TestSingletonClass.getInstance();
		System.out.println(testSingletonClass.getGreetings());
	}
}

class TestSingletonClass {
	private static TestSingletonClass testSingletonClass = null;

	private TestSingletonClass() {

	}

	public static TestSingletonClass getInstance() {
		if (testSingletonClass == null) {
			testSingletonClass = new TestSingletonClass();
		}
		return testSingletonClass;
	}

	public String getGreetings() {
		return "Hello good morning";
	}
}
