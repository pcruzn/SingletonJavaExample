package cl.utfsm.inf.adsw.singleton;

public enum SingletonEnum {
	// single instance
	// what about 'multitons/multipletons'?
	INSTANCE;
	
	public synchronized void print (String text) {
		System.out.println("Printing " + text + " in console.");
	}
}
