package cl.utfsm.inf.adsw.singleton;

public class SingletonGeneric {
	private static SingletonGeneric instance;
	
	// return an instance of the SingletonGeneric class if there is no
	// other instance of the class
	public static synchronized SingletonGeneric getInstance() {
		if (instance == null) {
			instance = new SingletonGeneric();
		}
		// instance is static, thus this always returns "THE" instance
		return instance;
	}
	
	// constructor not publicly available
	// no one could invoke 'new SingletonGeneric()' from outside
	private SingletonGeneric () {}
	
	// methods and attributes...
	public synchronized void print (String text) {
		System.out.println("Printing " + text + " in console.");
	}
}
