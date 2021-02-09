import java.util.*;
import java.io.*;

public class fileHandling{
	void createFile(){ //only creates the file
		try {
			File fileObj = new File("file1.txt");
			if(fileObj.createNewFile()) {
				System.out.println("new file is created");
			} else {
				System.out.println("file already exsists");
			}
		} catch (IOException e) {
			System.out.println("Error occured "+ e); //displays short message
			e.printStackTrace(); //displays the full trace
		}
	}

	void writeFile(){ //create a file if not exsists and writes the content in the file
		try {
			FileWriter fileObj = new FileWriter("file1.txt", false); //append will have the sec param as true

			fileObj.write("I am going to write this content in my file \n");
			fileObj.write("I am going to write another content in my file");

			fileObj.close();

			System.out.println("Added content to the file");
		} catch (IOException e) {
			System.out.println("Error occured "+ e); //displays short message
			e.printStackTrace(); //displays the full trace
		}
	}

	void readFile(){ //read's the file
		try {
			File fileObj = new File("file1.txt");

			Scanner ob = new Scanner(fileObj);

			while(ob.hasNextLine()){
				System.out.println(ob.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error occured "+ e); //displays short message
			e.printStackTrace(); //displays the full trace
		}
	}

	void deleteFile(){ //delete the file
		try {
			File fileObj = new File("file1.txt");

			if(fileObj.delete()){
				System.out.println("file1.txt is deleted");
			} else {
				System.out.println("file1.txt is not deleted");
			}
		} catch(Exception e){
			System.out.println("Error occured "+ e);
			e.printStackTrace();
		}
	}

	void getFileDetails() { //get details of the file
		try {
			File fileObj = new File("file1.txt");

			if(fileObj.exists()){
				System.out.println("Name: " + fileObj.getName());
				System.out.println("Path: " + fileObj.getAbsolutePath());
				System.out.println("can write: " +fileObj.canWrite());
				System.out.println("can read: " +fileObj.canRead());
			}

		} catch(Exception e) {
			System.out.println("Error occured "+ e); //displays short message
			e.printStackTrace(); //displays the full trace
		}
	}
	public static void main(String args[]){
		fileHandling ob = new fileHandling();

		ob.createFile();

		ob.writeFile();

		ob.readFile();

		ob.getFileDetails();

		ob.deleteFile();

	}
}