package org.redquark.designpatterns.creational.factory;

/**
 * @author Anirudh Sharma
 * 
 * This interface exposes the method which returns comic book publisher
 */
public interface ComicBook {
	
	/**
	 * Method that returns the appropriate instance
	 * @return {@link String}
	 */
	public String publisher();

}
