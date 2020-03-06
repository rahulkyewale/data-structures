package com.study.linearProbing;

class A 
{
	public A()
	{
		System.out.println("Inside A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("Inside B");
	}
}

class C extends B 
{
	public C()
	{
		System.out.println("Inside C");
	}
}

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		A a = new A(); System.out.println("");
		B b = new B(); System.out.println("");
		C c = new C(); System.out.println("");
		
		A upCast = b;
		System.out.println("");
		
		B downCast = (B) upCast;
		System.out.println("");
	}
}
