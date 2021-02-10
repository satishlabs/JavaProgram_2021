package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrangeDuplucatValue {
	public static void main(String[] args) {
		int []nums ={2,0,2,1,1,0};
		customSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void customSort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: nums) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		int i=0;
		for(var entry: map.entrySet()) {
			int val = entry.getValue();
			while(val-- >0) {
				nums[i++] = entry.getKey();
			}
		}
	}
}
