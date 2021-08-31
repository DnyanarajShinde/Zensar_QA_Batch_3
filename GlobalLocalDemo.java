package test;

public class GlobalLocalDemo {
	//Global Variables 
	static int i=0;
	public int a=1;

	public static void main(String[] args) {
		//Local Variables
		int a=2;
		double b=2;
		System.out.println(a);
		System.out.println(i);
	}
}
