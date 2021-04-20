package com.designpattern;

import java.util.ArrayList;

public class Celebrity implements Subject{
	private String celebrityName; //name of celebrity
	private ArrayList<Observer> followers; //list of followers
	
	public Celebrity(String celebrityName) {
		this.celebrityName = celebrityName;
		followers = new ArrayList<Observer>();
	}
	
	/*
	 * add followers to the celebrity's registered follower list
	 * */
	@Override
	public void register(Observer observer) {
		followers.add(observer);
		System.out.println(observer+" has started following "+celebrityName);
	}

	/*
	 * remove followers from celebrity's  registered follower list
	 * */
	@Override
	public void unregister(Observer observer) {
		followers.remove(observer);
		System.out.println(observer+" has stopped following "+celebrityName);
	}

	/*
	 * Notify all the registered followers
	 * */
	@Override
	public void notifyAllObservers(String tweet) {
		for(Observer follower: followers) {
			follower.update(celebrityName, tweet);
		}
		System.out.println();
	}

	/*
	 * This method update the tweet
	 * It will internally call notifyAllObservers(tweet) method after updating the tweet
	 * */
	public void tweet(String tweet) {
		System.out.println("\n"+celebrityName+" has tweeted : "+tweet);
		notifyAllObservers(tweet);
	}
}
