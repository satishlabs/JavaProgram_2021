package com.array;

import java.util.HashSet;
//https://stackoverflow.com/questions/58037771/find-minimum-window-substring-leetcode-solution-not-working
public class MinWindowSubstring  {
public static void main(String[] args) {
		
		System.out.println("ans="+ match("adobecodebanc","abc"));
	}
	
	public static String match(String input, String sub)
	{
		if(input.length()<sub.length()) 
			return null;
		
		boolean[] set= new boolean [256];
		int start=0,end=0,maxlen=0;
		HashSet<Character> map = new HashSet <Character>();
		
		for(int p=0; p<set.length;p++)
		{
			set[p]= false;
		}
		for(int i=0; i<sub.length();i++)
		{
			set[(int)sub.charAt(i)]= true;
			System.out.println("sub char="+sub.charAt(i)+","+(int)sub.charAt(i));
		}
		
		boolean reset= true;		
		for(int j=0,k=0; j<input.length();j++,k++)
		{	System.out.println(input.charAt(j));
			if(reset==true)
			{ 	map.clear();
				start=j;end=j;	
			}
			if(set[(int)input.charAt(j)]== true)
			{	
				System.out.println("char match="+input.charAt(j));
				map.add(input.charAt(j));
				reset=false;
			}				
				end++;
				if(map.size()==sub.length())
				{	System.out.println("map full");
					if( maxlen<j)
					{	maxlen=j;
					}
					reset=true;
				}
		}
		System.out.println("start="+start+",end="+end);
		if(maxlen>=sub.length())
			return input.substring(start,end);
		else
			return null;
	}
}
