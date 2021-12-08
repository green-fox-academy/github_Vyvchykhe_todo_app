import java.util.List;

public class FileManager {
    List<Task> toDoList;

    public static void printTasks(List<Task> myTasks){
        if (myTasks.size() != 0){
            for (int i = 0; i < myTasks.size(); i++) {
                System.out.println(i + 1 + ".)" + myTasks.get(i).taskName);
            }
        } else {
            System.out.println("Nincs mára tennivalód! :)");
        }
    }
}
