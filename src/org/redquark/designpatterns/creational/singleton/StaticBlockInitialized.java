package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * 
 * This class gives the single instance initialized in the static block
 */
public class StaticBlockInitialized {

	// Single instance of this singleton
	private static StaticBlockInitialized INSTANCE;

	// Private constructor to avoid any external apps to use it. If it is not
	// private, they might use it for creating multiple instance
	private StaticBlockInitialized() {
		// Empty constructor
	}

	// This block instantiates the INSTACE at the time of class loading
	static {
		try {
			INSTANCE = new StaticBlockInitialized();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the only instance of this Singleton to other classes
	 * 
	 * @return {@link StaticBlockInitialized}
	 */
	public static StaticBlockInitialized getInstance() {
		// Instance is already instantiated at the time of class loading
		return INSTANCE;
	}
}
