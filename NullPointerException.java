
public class NullPointerException {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		System.out.println("Remaining program is running");

	}

}
