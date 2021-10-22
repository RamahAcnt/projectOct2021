package org.git;

public class Sample {
	
	private void add(int a , int b) {
		
		int c= a+b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.add(10, 25);
	}
}
