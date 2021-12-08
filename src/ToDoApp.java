

public class ToDoApp {
    public static void main(String[] args) {
        String operation = args[0];
        switch (operation){
            case "-l":
                System.out.println("print todo list");
                break;
            case "-a":
                System.out.println("new task");
                break;
            case "-r":
                System.out.println("delete task");
                break;
            case "-c":
                System.out.println("complete task");
                break;
            default:
                System.out.println("not supported operation");
        }
    }

}