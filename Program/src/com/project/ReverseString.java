package com.project;


public class ReverseString {
	public static void letters() {
		String s = "welcome";
		String rev = "";
		String ress= "";
		for(int i =s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			char ccc = s.charAt(i);
		char c = Character.toUpperCase(ccc);
		
			ress= ress+c;
		}
		System.out.println(rev);
		System.out.println(ress);
		

	}
	private static void word() {
		String s="Welcome To god";
		String[] ss = s.split(" ");
		String revword="";
		for (String x : ss) {
			String revchar="";
			for (int i = x.length()-1;i>=0; i--) {
				revchar= revchar+ x.charAt(i);
				
				
			}
			revword= revword+revchar +" ";
			
		}
		System.out.println(revword);

	}
	public static void main(String[] args) {
		word();
		letters();
	}

}
