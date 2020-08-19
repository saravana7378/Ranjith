package com.project;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DuplicateFromArray {
	public static void aar() {
		String [] s= {"ABC","BCD","ABC","CDE"};
		List<String> arrs= Arrays.asList(s);
		TreeSet<String>tree= new TreeSet<String>(arrs);
		System.out.println(tree);
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if (s[i]==s[j]) {
					System.out.println(s[j]);
				}
				
			}
			
		}
		
		

	}public static void main(String[] args) {
		aar();
	}

}
