package com.designpattern;

public class ObserverDesignPattern {
	public static void main(String[] args) {
		Celebrity dhoni = new Celebrity("Dhoni");
		Celebrity sachin = new Celebrity("Sachin");
		
		Follower satish = new Follower("Satish");
		Follower amrish = new Follower("Amrish");
		Follower kundan = new Follower("Kundan");
		Follower amit = new Follower("Ammit");
		
		
		dhoni.register(satish);
		dhoni.register(amrish);
		dhoni.register(amit);
		
		sachin.register(kundan);
		sachin.register(satish);
		sachin.register(amit);
		
		dhoni.tweet("Hye Guys, came accros worl cup 2021 scheduled, check it venue");
		sachin.tweet("Good Morning...");
		
		dhoni.unregister(amit);
		dhoni.tweet("Welcome to Football club county...");
	}
}
