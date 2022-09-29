package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\lalud\\OneDrive\\Desktop\\Abhishek\\hatct.txt");
		
	
		
			if(f.createNewFile()) {
				System.out.println("File Is Created ");
			}
			else {
				System.out.println("File Already exist");
			}

	}

}
