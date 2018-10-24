package org.redquark.designpatterns.creational.abstractfactory;

/**
 * @author Anirudh Sharma
 * 
 * This is the factory of factories. This will return the factory of ComicBook type
 *
 */
public abstract class ComicAbstractFactory {
	
	public abstract ComicBook getComicBookPublisher(String param);

}
