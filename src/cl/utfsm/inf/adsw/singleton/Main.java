/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.singleton;

public class Main {
	public static void main(String[] args) {
		// using the singleton with enum (Java allows this)
		// in Java we have the 'enum type' class
		// which allows this implementation of a singleton
		SingletonEnum.INSTANCE.print("ADSW (enum)");
		
		// using the generic singleton
		SingletonGeneric singleton = SingletonGeneric.getInstance();
		singleton.print("ADSW (generic)");
	}
}
