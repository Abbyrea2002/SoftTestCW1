
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class FileManagerTest {
    @Test
    public void testWritingToFile(){
        //call write method
        FileManager.WriteToFile();
        //path to file
        String filePath = "C:\\Users\\abbyr\\OneDrive\\Documents\\write.txt";
        File file = new File(filePath);
        //verifies if given condition is true
        assertTrue(file.exists(), "File should exist after writing.");

        // Read the file content
        String fileContent = FileManager.ReadFile(filePath);


        // checks wether two values are equal
        assertEquals("Files in java might be tricky, but its fun enough!", fileContent );

        // Cleanup (optional)
        file.delete();


    }
    @Test
    public void testReadFile(){
        String filePath = "C:\\Users\\abbyr\\OneDrive\\Documents\\read.txt";
        String content = FileManager.ReadFile(filePath);

        assertEquals("this file should be read", content);
    }
    @Test
    public void testDeleteFile(){
        String filePath = "C:\\Users\\abbyr\\OneDrive\\Documents\\delete.txt";
        FileManager.DeleteFile();
        File file = new File(filePath);
        assertFalse(file.exists());//verifies if given condition is false
    }
}
