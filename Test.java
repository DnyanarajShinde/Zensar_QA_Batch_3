import java.io.*;
public class Test {

	public static void main(String[] args) {
		String fileName="temp.text";
		try {
			FileWriter fileWriter=new FileWriter(fileName);
			
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Hello there, ");
			bufferedWriter.write("welcome to file handling.");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing, ");
			bufferedWriter.write("the text to the file.");
			
			bufferedWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error writing to file '"+fileName+"'");
		}
		System.out.println("Written the file successfully!");
	}

}
