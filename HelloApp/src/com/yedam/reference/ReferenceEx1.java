package com.yedam.reference;

class Student {
	String name;
	int age;
}

public class ReferenceEx1 {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		
		Student s2 = s1;
		s1.name = "김길동";
		s1.age = 22;
		
		System.out.println(s1.name + ", " + s2.name);
	}
}
