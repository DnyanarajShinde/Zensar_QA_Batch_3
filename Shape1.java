package test;

public abstract class Shape1 {
	
	abstract void rectangleArea(int l,int b);	//Abstract Method
	
	abstract void squareArea(int s);
	
	abstract void circleArea(int r);
	
	static void show() {					//Concrete Method
		System.out.println("This is concrete method");
	}
	
	public static void main(String[] args) {
		Shape1.show();  //Make show method static to call this method
	}
}