import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static   String ReadFile(){
        try{
            File myFile = new File("C:\\Users\\B00835054\\Downloads\\Read.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }

    }

    public static void WriteToFile(){
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\B00835054\\Downloads\\Write.txt");
            myWriter.write("Files in java might be tricky, but its fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }

    public static void DeleteFile(){
        File myObject = new File("C:\\Users\\B00835054\\Downloads\\Delete.txt");
        if(myObject.delete()){
            System.out.println("Deleted the file: " + myObject.getName());
        }else{
            System.out.println("Failed to delete file");
        }

    }


}
