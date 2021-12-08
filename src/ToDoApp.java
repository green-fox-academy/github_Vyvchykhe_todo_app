

public class ToDoApp {
    public static void main(String[] args) {
        String operation = args[0];
        if (operation.isEmpty()){
            System.out.println("Parancssori Todo applikáció");
            System.out.println("=============================");
            System.out.println("Parancssori argumentumok:");
            System.out.println("\t" + "-l   Kilistázza a feladatokat");
            System.out.println("\t" + "-a   Új feladatot ad hozzá");
            System.out.println("\t" + "-r   Eltávolít egy feladatot");
            System.out.println("\t" + "-c   Teljesít egy feladatot");
        } else {
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

}