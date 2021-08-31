import java.io.*;
public class TestR {

	public static void main(String[] args) {
		String fileName="temp.text";
		String line=null;
		
		try {
			FileReader fileReader=new FileReader(fileName);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			while((line=bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Unable to open file '"+fileName+"'");		
		}
		catch(IOException e) {
			System.out.println("Error reading file '"+fileName+"'");
		}
		
	}

}
