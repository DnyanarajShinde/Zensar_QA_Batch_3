
public class MultipleException {

	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			a[5]=30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException exception occurs");
		}
		catch(Exception e) {
			System.out.println("Parent exception occurs");
		}
		System.out.println("Rest of the code");
	}

}
