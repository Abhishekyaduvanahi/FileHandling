package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writingInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter f = new FileWriter("C:\\Users\\lalud\\OneDrive\\Desktop\\Abhishek\\hatct.txt");
			try {
				f.write("HatCoder will be the best coder of this planet ");
			}
			finally{
				f.close();
			}
			System.out.println("Successfully Data wrote in file");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
