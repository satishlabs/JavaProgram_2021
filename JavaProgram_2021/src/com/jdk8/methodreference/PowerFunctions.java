package com.jdk8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PowerFunctions {
	
	public static Integer power(int a) {
		return a*a;
	}
	
	
	public static List<Integer> calculatePowOf2ForList(List<Integer> list,Function<Integer, Integer>function){
		List<Integer> powNumbers = new ArrayList<Integer>();
		for(Integer num : list) {
			Integer powOf2 = function.apply(num);
			powNumbers.add(powOf2);
		}
		return powNumbers;
	}
}
