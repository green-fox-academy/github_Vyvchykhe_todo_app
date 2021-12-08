import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task {
    String taskName;
    boolean ready;

    public static void fileReader(){
        Path taskFile = Paths.get("mytasks.txt");
        try {
            List<String> taskFileLines = Files.readAllLines(taskFile);
        } catch (IOException e){
            System.out.println("Nem található a keresett fájl");
        }
    }
}
