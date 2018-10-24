package org.redquark.designpatterns.creational.abstractfactory;

/**
 * @author Anirudh Sharma
 *
 */
public class FactoryProducer {
	
	public static ComicAbstractFactory getFactory(String param) {
		
		if(param.equalsIgnoreCase("Comic Book")) {
			return new ComicBookFactory();
		}
		
		return null;
	}

}
