package test;

public class Restaurant1 extends Restaurant{
	
	

	public static void main(String[] args) {
		Restaurant.wel();
		Restaurant r1=new Restaurant1();
		r1.show();

	}

	void show() {
		System.out.println("This restaurant is currently open!");
		
	}
	
	

}
