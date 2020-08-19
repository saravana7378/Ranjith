package com.project;

public class Butterfly {
	public static void butterfly() {
		int[]i= {1,2,3,4,5,6,7,8,9,10};
		int len=i.length/2;
		for (int j = len-1; j>=0; j--) {
			System.out.println(i[j]);
		}
		for (int j =i.length-1; j >=len; j--) {
			System.out.println(i[j]);
			
		}
		
		
		

	}
	public static void main(String[] args) {
		butterfly();
	}

}
