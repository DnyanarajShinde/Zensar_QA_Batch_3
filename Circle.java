package test;

public class Circle extends Shape{
	int r=2;
	double pi=3.14, area;
	
	void area() {
		area = pi*(r*r);
		System.out.println("Area of circle is "+area);
	}

}
