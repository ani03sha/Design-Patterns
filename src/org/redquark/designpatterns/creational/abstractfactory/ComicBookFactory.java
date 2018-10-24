package org.redquark.designpatterns.creational.abstractfactory;

/**
 * @author Anirudh Sharma
 *
 */
public class ComicBookFactory  extends ComicAbstractFactory{

	@Override
	public ComicBook getComicBookPublisher(String param) {
		
		try {
			
			switch (param) {
			
			case "DC":
				return new DC();
				
			case "Virgin":
				return new Virgin();
				
			case "Marvel":
				return new Marvel();

			default:
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
