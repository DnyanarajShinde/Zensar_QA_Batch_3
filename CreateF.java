import java.io.FileWriter;
import java.io.IOException;

public class CreateF {

	public static void main(String[] args) throws IOException{
		String str="File handling in java using "+
					"  Filewriter and Filereader";
		
		FileWriter fw=new FileWriter("output.txt");
		
		for (int i=0;i<str.length();i++) 
			fw.write(str.charAt(i));
		
		System.out.println("String Successfull");
		fw.close();
		
	}

}