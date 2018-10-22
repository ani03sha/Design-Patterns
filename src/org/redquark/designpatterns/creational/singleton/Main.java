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
		
		// Calling the Static Block Initialized Singleton
		System.out.println("Static Block Initialized Singleton: " + StaticBlockInitialized.getInstance().hashCode());
		
		// Calling the Lazy Initialized Singleton
		System.out.println("Lazy Initialized Singleton: " + LazyInitialized.getInstance().hashCode());
	}
}
