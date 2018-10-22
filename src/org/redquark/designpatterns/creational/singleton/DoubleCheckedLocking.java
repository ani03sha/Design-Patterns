package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * 
 * This class provides the singleton pattern in a multi threaded
 * environment with slightly reduced cost of the synchronization
 *
 */
public class DoubleCheckedLocking {

	// Single instance of this class
	private static volatile DoubleCheckedLocking INSTANCE;
	
	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private DoubleCheckedLocking() {
		// Empty constructor
	}
	
	/**
	 * This method creates the instance of this singleton and we are double checking
	 * the nullability of the instance to make sure that the instance does not get
	 * initialized more than once in a multi-threaded environment
	 * 
	 * @return {@link DoubleCheckedLocking}
	 */
	public static DoubleCheckedLocking getInstance() {
		// Check if the instance is not null 
		if(INSTANCE == null) {
			// Synchronized block to make thread safety
			synchronized (DoubleCheckedLocking.class) {
				// Checking again nullability
				if(INSTANCE == null) {
					// Creating the instance	
					INSTANCE = new DoubleCheckedLocking();
				}
			}
		}
		return INSTANCE;
	}
}
