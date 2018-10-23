package org.redquark.designpatterns.creational.factory;

/**
 * @author Anirudh Sharma
 * This class drives the code showing Factory design pattern demo
 */
public class Main {

	public static void main(String[] args) {

		try {

			// Getting instance of DC
			ComicBook comicBook1 = ComicBookFactory.getPublisher("DC");
			System.out.println("Comic Book Publisher: " + comicBook1.publisher());

			// Getting instance of Virgin
			ComicBook comicBook2 = ComicBookFactory.getPublisher("Virgin");
			System.out.println("Comic Book Publisher: " + comicBook2.publisher());

			// Getting instance of Marvel
			ComicBook comicBook3 = ComicBookFactory.getPublisher("Marvel");
			System.out.println("Comic Book Publisher: " + comicBook3.publisher());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
