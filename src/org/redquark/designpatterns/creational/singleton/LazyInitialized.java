/**
 * 
 */
package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma 
 * 
 * This class creates the instance in the public access
 * method. The instance will be created only when it is required, hence
 * the name Lazy Initialization
 */
public class LazyInitialized {

	// Single instance of this singleton
	private static LazyInitialized INSTANCE;

	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private LazyInitialized() {
		// Empty constructor
	}

	/**
	 * This block instantiates the INSTANCE if it is null i.e if it is not already
	 * created
	 * 
	 * @return {@link LazyInitialized}
	 */
	public static LazyInitialized getInstance() {
		// Check if the instance is not already created
		if (INSTANCE == null) {
			// Instantiate the instance
			INSTANCE = new LazyInitialized();
		}
		return INSTANCE;
	}
}
