
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
        String filePath = "C:\\Users\\B00835054\\Downloads\\Write.txt";
        File file = new File(filePath);

        assertTrue(file.exists(), "File should exist after writing.");

        // Read the file content
        String fileContent = FileManager.ReadFile();

        // Assert the expected content
        assertEquals("Files in java might be tricky, but its fun enough!", fileContent.toString(), "File content should match expected output.");

        // Cleanup (optional)
        file.delete();


    }

}
