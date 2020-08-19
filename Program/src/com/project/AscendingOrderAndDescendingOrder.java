package com.project;

public class AscendingOrderAndDescendingOrder {
	public static void ascend() {
		int temp;
		int [] a = {10,40,60,100,200};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
	}
	public static void desc() {
		int temp;
		int [] a = {10,40,60,100,200};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
	}
	public static void main(String[] args) {
		ascend();
		desc();
	}

}
