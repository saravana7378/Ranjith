package com.project;

public class CountOfLetters {
	public static void letter() {
		
		int Cap=0;
		int sma=0;
		int num=0;
		int sym=0;
		String s="FFFFF*&%$fgaiywerqiwg262";
		for (int i = 0; i < s.length(); i++) {
			if ('A'<=s.charAt(i)&&s.charAt(i)<='Z') {
				Cap++;
			}
			else if ('a'<=s.charAt(i)&&s.charAt(i)<='z') {
				sma++;
			}
			else if ('1'<=s.charAt(i)&&s.charAt(i)<='9') {
				num++;
			}
			else {
				sym++;
			}
			
			
		}
		System.out.println("Capital Letters"+"="+Cap);
		System.out.println("samll Letters"+"="+sma);
		System.out.println(" numb"+"="+num);
		System.out.println("symbol"+"="+sym);

	}
	public static void main(String[] args) {
		letter();
	}

}
