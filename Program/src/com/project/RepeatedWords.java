package com.project;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedWords {
	private static void letters() {
		String s ="AHSHSUUUJAJ";
		String[] ss = s.split("");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String x : ss) {
			
		
			if (map.containsKey(x)) {
				Integer count = map.get(x);
				map.put(x, count+1);
				
			}
			else {
				map.put(x, 1);
			}
			
		}
		System.out.println(map);
		
		

	}
	public static void Words() {
		String s = "welcome to god god";
		String[] ss = s.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String x : ss) {
			if (map.containsKey(x)) {
				Integer count = map.get(x);
				map.put(x, count+1);
			}
			else {
				map.put(x, 1);
			}
			
		}
		System.out.println(map);

	}
	public static void main(String[] args) {
		Words();
		letters();
	}

}
