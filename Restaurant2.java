package test;

public class Restaurant2 extends Restaurant{

	public static void main(String[] args) {
		Restaurant.wel();
		Restaurant2 r2=new Restaurant2();
		r2.show();
		

	}

	void show() {
		System.out.println("Sorry, this Restaurant is currently closed!");
	}

}
