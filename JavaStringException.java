public class JavaStringException {
	public static void main(String[] args) {
		String str = "smith";
		//String str = "250";

		try {
			int i = Integer.parseInt(str);
			System.out.println(i);
		} 
		catch (NumberFormatException e) {
			System.out.println(e);
		}
		finally {	//Execution of finally block is mandatory but it is not mandatory to always use finally block everytime.
		System.out.println("I execute always!");
		}
	}
}
