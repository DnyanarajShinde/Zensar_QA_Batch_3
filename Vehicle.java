package test;

public class Vehicle {
	void show() {
		System.out.println("Here is the info about vehicles: ");
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.show();
		Bike b =new Bike();
		b.show();
		Bike b1 =new Bullet();
		b1.show();
		Bike b2 =new Suzuki();
		b2.show();
		Car c =new Car();
		c.show();
		Car c1=new Maruti();
		c1.show();
		Car c2=new Lamborghini();
		c2.show();
	}

}
