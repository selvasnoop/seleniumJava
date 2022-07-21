package com.seleniam;

public class Sample {
	
	int a=10;
	int b=20;
	
	public void display() {
	  
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		
		Sample sa=new Sample();
		
		sa.display();
	}

}
