import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        AllTasks allTasks = new AllTasks();
        Scanner scanner = new Scanner(System.in); 

        while (true) { 
            System.out.println(" МЕНЮ:\n 1. Добавить задачу\n 2. Показать все задачи\n 3. Удалить все задачи\n 4. Выход\n (Выберите задачу и нажмите Enter)"); 
            System.out.println();
            int selectedTask = Integer.parseInt(scanner.nextLine()); 
            switch (selectedTask) {   
                case 1: {                   
                    allTasks.addTask();
                    break; 
                }
                case 2: {  
                    allTasks.printAllTasks();
                    break;
                }
                case 3: {   
                    allTasks.clearAllMissedCalls();
                    break;
                }
                case 4: { 
                    scanner.close();
                    break;           
                }
            }
        }
    }
}
