package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * 
 * This class makes the Singleton thread safe using the synchronized keyword
 */
public class ThreadSafeSingleton {

	// Single instance of this class
	private static ThreadSafeSingleton INSTANCE;

	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private ThreadSafeSingleton() {
		// Empty constructor
	}

	// The synchronized keyword makes the initialization thread-safe
	public static synchronized ThreadSafeSingleton getInstance() {
		// Check if the instance is not already created
		if (INSTANCE == null) {
			// Instantiate the instance
			INSTANCE = new ThreadSafeSingleton();
		}
		return INSTANCE;
	}
}
