
public class NestedTryBlocks {

	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			System.out.println(a[5]);
		
			try {
			int[] b=new int[5];
			b[5]=30/0;
			}
			catch(Exception e2) {
			System.out.println("Divide by zero exception handled");
			}
		}
		
		catch(Exception e) {
			System.out.println("Exception Handled");	
		}	
		
	}

}
