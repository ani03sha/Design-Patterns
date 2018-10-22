package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * 
 * This class demonstrates the Bill Pugh Singleton implementation
 */
public class BillPughSingleton {
	
	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private BillPughSingleton() {
		
	}

	/**
	 * It is the static inner class which provides the INSTANCE for this singleton.
	 * The good thing is that this only be loaded in the memory when a client calls
	 * the getInstance() method, not before that
	 */
	private static class SingletonBuilder {
		// Creating the instance of this class
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	/**
	 * This method returns the Singleton instance
	 * @return {@link BillPughSingleton}
	 */
	public static BillPughSingleton getInstance() {
		// Calls the SingletonBuilder class' variable
		return SingletonBuilder.INSTANCE;
	}
}
