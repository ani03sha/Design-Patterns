package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * Main class to invoke all the singleton types
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calling the Eager Initialized Singleton
		System.out.println("Eager Initialized Singleton: " + EagerInitialized.getInstance().hashCode());		
	}
}
