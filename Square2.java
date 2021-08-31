package test;

public class Square2 implements Shape2, Shape3 {
	
	public void area() {
		System.out.print("Area of square is : ");
	}

	public void area(int side) {
		System.out.println(side * side);
	}

	public static void main(String[] args) {

		Shape3 s3 = new Square2();
		s3.area();
		Shape2 s2=new Square2();
		s2.area(10);
		s3.show();	//This method is implemented in interface class
	}

}
