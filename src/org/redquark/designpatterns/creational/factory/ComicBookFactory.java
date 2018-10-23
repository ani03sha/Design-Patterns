package org.redquark.designpatterns.creational.factory;

/**
 * @author Anirudh Sharma
 * This class returns the object of child classes based on the parameter passed
 */
public class ComicBookFactory {
	
	/**
	 * This method returns the appropriate object to the client
	 * @param param
	 * @return {@link ComicBook}
	 */
	public static ComicBook getPublisher(String param) {
		
		// Cases for the parameter passed
		switch (param) {
		
		case "Marvel":
			return new Marvel();
			
		case "DC":
			return new DC();
			
		case "Virgin":
			return new Virgin();
			
		default:
			return null;
		}
	}

}
