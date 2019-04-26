package com.saurabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer implements Comparable<Customer> {
	Integer customerId;
	String name;
	Integer age;

	public Customer(Integer customerId, String name, Integer age) {
		this.customerId = customerId;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Customer o) {
		return name.compareTo(o.name);
	}

}

class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareTo(o2.name);
	}

}

class AgeComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.age > o2.age)
			return 1;
		else if (o1.age < o2.age)
			return -1;
		else
			return 0;

	}
}

public class ComparatorImpl {

	public static void main(String args[]) {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "saurabh", 23));
		list.add(new Customer(2, "Kumar", 12));
		list.add(new Customer(3, "HJ", 35));

		Collections.sort(list);

		for (Customer cs : list) {
			System.out.println(cs.customerId + " " + cs.name + " " + cs.age);
		}
	}

}
