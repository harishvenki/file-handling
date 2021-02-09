FILE  HANDLING IN JAVA
File handling in java is an easy task 
In the end of this blog we will able to perform various file handling operations such as create, append, read, delete and also to get the various information of the file using java
First we will see how to create a file
creating a file in java is very simple, for handling the files in java we need to import the java.util.io.* package.
after which we can simply call the class with the createNewFile() method which will return true or false . please refer the below code sample
Code sample:
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
Write or append in the file
To write content into the file we need to call the FileWriter class which takes the file name as well as the boolean value which decides to erase the file content and write it newly or append with the existing content.
void writeFile(){ //create a file if not exist and writes the content in the file
 try {
  FileWriter fileObj = new FileWriter("file1.txt", false); //append      will have the sec param as true
  fileObj.write("I am going to write this content in my file \n");
  fileObj.write("I am going to write another content in my file");
  fileObj.close();
  System.out.println("Added content to the file");
 } catch (IOException e) {
  System.out.println("Error occured "+ e); //displays short message
  e.printStackTrace(); //displays the full trace
 }
}
Get informations of the file:
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
file object has those methods named getName, getAbsolutePath, canWrite and canRead from which we will be able to get the basic file informations.
Delete file:
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
deleting a file is as easy as it looks we just have to call the delete function with the file object 
For the ease of understanding we have used a single file named file.txt in the same location as the java program.
I hope you are clear about the basic operations of file handling 
Thanks for reading 
i have attached the git hub code please check it out for output and any kind of reference needed.
See you in the next blog