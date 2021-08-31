package test;

public class Area extends Shape1{

	void rectangleArea(int l, int b) {
		System.out.println("Area of rectangle is: "+l*b);
		
	}

	void squareArea(int s) {
		System.out.println("Area of square is: "+(s*s));
		
	}

	void circleArea(int r) {
		System.out.println("Area of circle is: "+(3.14*(r*r)));
		
	}
	
//	void show() {
//		System.out.println("Child concrete method");	
//	}

	public static void main(String[] args) {
		
		Area a=new Area();
		a.rectangleArea(4,5);
		a.squareArea(5);
		a.circleArea(3);
//		Shape1 s= new Area();
//		s.show();
		Shape1.show();

	}
	
}
