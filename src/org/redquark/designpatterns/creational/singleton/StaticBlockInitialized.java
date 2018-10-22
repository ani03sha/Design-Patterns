package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * This class creates a single instance in the static block
 */
public class StaticBlockInitialized {

	// Single instance of this singleton
	private static StaticBlockInitialized INSTANCE;

	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private StaticBlockInitialized() {
		// Empty constructor
	}

	// Static block to instantiate the INSTACE. This will be created at the time of
	// class loading
	static {
		try {
			INSTANCE = new StaticBlockInitialized();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the only instance of this Singleton to other classes
	 * @return {@link StaticBlockInitialized}
	 */
	public static StaticBlockInitialized getInstance() {
		// Instance was already created at the time of class loading in the static block
		return INSTANCE;
	}
}
