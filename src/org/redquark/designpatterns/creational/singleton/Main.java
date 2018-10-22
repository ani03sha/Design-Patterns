package org.redquark.designpatterns.creational.singleton;

/**
 * @author Anirudh Sharma
 * Main class to invoke all the singleton types
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calling the Eager Initialized Singleton
		System.out.println("Eager Initialized Singleton: " + EagerInitialized.getInstance().hashCode());

		// Calling the Static Block Initialized Singleton
		System.out.println("Static Block Initialized Singleton: " + StaticBlockInitialized.getInstance().hashCode());

		// Calling the Lazy Initialized Singleton
		System.out.println("Lazy Initialized Singleton: " + LazyInitialized.getInstance().hashCode());

		// Calling the Thread Safe Singleton from two different threads
		Runnable t1 = () -> {
			System.out.println("Singleton instance created by " + Thread.currentThread().getName() + " is: "
					+ ThreadSafeSingleton.getInstance().hashCode());
		};
		new Thread(t1).start();

		Runnable t2 = () -> {
			System.out.println("Singleton instance created by " + Thread.currentThread().getName() + " is: "
					+ ThreadSafeSingleton.getInstance().hashCode());
		};
		new Thread(t2).start();

		// Calling the Double Checked Locking Singleton from two different threads
		Runnable t3 = () -> {
			System.out.println("Singleton instance created by " + Thread.currentThread().getName() + " is: "
					+ DoubleCheckedLocking.getInstance().hashCode());
		};
		new Thread(t3).start();

		Runnable t4 = () -> {
			System.out.println("Singleton instance created by " + Thread.currentThread().getName() + " is: "
					+ DoubleCheckedLocking.getInstance().hashCode());
		};
		new Thread(t4).start();
		
		// Getting the singleton from the Enum
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		System.out.println("Enum Singleton: " + singleton.hashCode());
		
		// Getting the singleton from the Bill Pugh implementation
		System.out.println("Bill Pugh Singleton: " + BillPughSingleton.getInstance().hashCode());
		
	}
}
