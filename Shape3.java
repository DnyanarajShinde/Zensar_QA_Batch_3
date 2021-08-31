package test;

public interface Shape3 {
	
	abstract void area();	
	
	// We can also use another access specifiers to implement methods here
	public default void show() {
		System.out.println("This is the method implemented in interface class");
	}
	
}
