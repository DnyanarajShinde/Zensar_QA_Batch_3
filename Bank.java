package test;

class Database {
	private double Balance;
	private double deposit;
	private double withdraw;

	public double getWithdraw() {
		return (deposit + Balance) - withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getDeposit() {
		return deposit + Balance;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
}

public class Bank {

	public static void main(String[] args) {
		Database d = new Database();
		d.setBalance(5000);
		d.setDeposit(217.50);
		d.setWithdraw(917.50);
		System.out.println("Total amount in your account is: " + (d.getBalance()));
		System.out.println("Successfully deposited the amount!");
		System.out.println("Total amount in your account after deposited amount is: " + (d.getDeposit()));
		System.out.println("Successfully withdrawed the amount!");
		System.out.println("Total amount in your account after withdrawal is: " + (d.getWithdraw()));
	}
}
