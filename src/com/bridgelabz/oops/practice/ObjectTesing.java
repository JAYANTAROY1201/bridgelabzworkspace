package com.bridgelabz.oops.practice;


class A{
	int i=5;
	void method1(){
		System.out.println("this is class A method");
	}
}

class B extends A{
	int j=9;
	void method2() {
		System.out.println("This is class B method");
	}
	
}

public class ObjectTesing {

	public static void main(String[] args) {
		A a=new A();
		A a1=new B();
		B b=(B) new A();
		B b1=new B();
		A a2=(A)b1;
		B b4=(B) a;
	}

}
