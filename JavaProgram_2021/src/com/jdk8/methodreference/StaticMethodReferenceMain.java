package com.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StaticMethodReferenceMain {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5});
		
		
		Function<Integer, Integer> function1 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer num) {
				
				return PowerFunctions.power(num);
			}
		};
		
		List<Integer> calculatePowForList1 = PowerFunctions.calculatePowOf2ForList(list, function1);
		System.out.println(calculatePowForList1);
	}
}
