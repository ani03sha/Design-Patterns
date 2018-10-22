/**
 * 
 */
package org.redquark.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * @author Anirudh Sharma
 *
 */
public class SerializedSingleton implements Serializable {

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 2609918406814395191L;

	private SerializedSingleton() {
		// Empty constructor
	}
	
	private static class SerializedSingletonHelper{
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SerializedSingletonHelper.INSTANCE;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
