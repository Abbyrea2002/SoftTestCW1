import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static   String ReadFile(String filePath){
        StringBuilder content = new StringBuilder();
        try{
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            System.out.print("Sucessfully read file");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content.append(data);

            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }
        return content.toString().trim();

    }

    public static void WriteToFile(){
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\abbyr\\OneDrive\\Documents\\write.txt");
            myWriter.write("Files in java might be tricky, but its fun enough!\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }

    public static void DeleteFile(){
        File myObject = new File("C:\\Users\\abbyr\\OneDrive\\Documents\\delete.txt");
        if(myObject.delete()){
            System.out.println("Deleted the file: " + myObject.getName());
        }else{
            System.out.println("Failed to delete file");
        }

    }


}
