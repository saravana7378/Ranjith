package com.project;

public class Armstrong {

	private static void arms() {
		int i=0,a,j=0; 
				int k = 1000;
		for (int n = 152; n < k; n++) {
		//int n=153;
			a=n;
			while (a>0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
				
			}
			if (n==j) {
				System.out.println(n);
				
			}
			
			
		}

	}
	public static void main(String[] args) {
		arms();
	}
}
