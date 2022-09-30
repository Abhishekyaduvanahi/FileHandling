package FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 File f = new File("C:\\\\Users\\\\lalud\\\\OneDrive\\\\Desktop\\\\Abhishek\\\\hatct.txt");
		 
		 if(f.exists()) {
		  System.out.println("File name "+f.getName());
		  System.out.println("File Location "+f.getAbsolutePath());
		  System.out.println("File Writable "+f.canWrite());
		  System.out.println("File Readable "+f.canRead());
		  System.out.println("File Size " +f.length());
		//  System.out.println("File Removed"+f.delete());
		 }
		 else {
			 System.out.println("File Does not exist");
		 }
	}

}
