public class ArrayException {  
  
    public static void main(String[] args) {  
    	try {
    	String[] arr = {"Ram","Jay","Root","Rahul"};   
          
       for(int i=0;i<=arr.length;i++) {       
  
             System.out.println(arr[i]);  
        }
    	}
        /*catch(RuntimeException e) {		//ArrayIndexOutOfBoundsException
        	System.out.println(e);      	
        }*/
    	catch(Exception e) {
    		System.out.println("Parent exception occurs");
    	}
    	System.out.println("Exception handled successfully!");
    }  
 } 
