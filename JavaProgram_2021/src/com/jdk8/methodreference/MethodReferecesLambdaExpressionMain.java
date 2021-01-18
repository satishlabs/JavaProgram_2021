package com.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferecesLambdaExpressionMain {
	public static void main(String[] args) {
		List<String> countryList =  Arrays.asList(new String[] {"India", "China","Nepal","Russia"});
		System.out.println("=======================");
        System.out.println("Using anonymous class");
        System.out.println("=======================");
        
        //Using anonymous class
        countryList.stream().forEach(
        		new Consumer<String>() {

					@Override
					public void accept(String country) {
						System.out.println(country);
					}
				});
	}
}
