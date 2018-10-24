package org.redquark.designpatterns.creational.abstractfactory;

/**
 * @author Anirudh Sharma
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ComicAbstractFactory abstractFactory = FactoryProducer.getFactory("Comic Book");
		
		ComicBook comicBook1 = abstractFactory.getComicBookPublisher("DC");
		System.out.println("Comic Book Publisher is: " + comicBook1.publisher());
		
		ComicBook comicBook2 = abstractFactory.getComicBookPublisher("Marvel");
		System.out.println("Comic Book Publisher is: " + comicBook2.publisher());
		
		ComicBook comicBook3 = abstractFactory.getComicBookPublisher("Virgin");
		System.out.println("Comic Book Publisher is: " + comicBook3.publisher());

	}

}
