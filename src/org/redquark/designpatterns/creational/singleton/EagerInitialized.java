package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * This class represents the eager initialization of Singleton class
 */
public class EagerInitialized {

	// Initializing the instance at the time of class loading i.e. eagerly, hence
	// the name Eager initialization
	private static final EagerInitialized INSTANCE = new EagerInitialized();

	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private EagerInitialized() {
		// Empty constructor
	}

	/**
	 * This method returns the only instance of this Singleton to other classes
	 * @return {@link EagerInitialized}
	 */
	public static EagerInitialized getInstance() {
		// Instance was already created at the time of class loading
		return INSTANCE;
	}
}
