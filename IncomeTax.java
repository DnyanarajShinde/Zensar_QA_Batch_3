package test;

import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your earning: ");
		double emp_earning = sc.nextDouble();

		if (emp_earning <= 50000) {
			System.out.println("You have no need to pay any tax");
		} else if (emp_earning <= 60000 && emp_earning>50000) {
			System.out.println("You have to pay " + (emp_earning / 100) * 10 + " rupees tax");
		} else if (emp_earning <= 150000 && emp_earning>60000) {
			System.out.println("You have to pay " + (emp_earning / 100) * 20 + " rupees tax");
		} else {
			System.out.println("You have to pay " + (emp_earning / 100) * 30 + " rupees tax");
		}
	}

}
