package test;

//Encapsulation --> Binding of data and methods in a single unit

class Stud {
	//Variables should be private always
	private int rollno;						//data
	private String name;					//data

	//Getter and Setter Methods
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationDemo {

/*	Uses : 1. Provides security to data by protecting data from unwanted access
 		   2. Code is more flexible and easy to change as per new requirements
 		   3. Prevents other classes from accessing the private fields	  */
	
	public static void main(String[] args) {
		Stud s=new Stud();
		s.setRollno(1);
		s.setName("Dnyanaraj");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}

}
