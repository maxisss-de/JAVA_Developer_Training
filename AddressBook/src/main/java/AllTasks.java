import java.util.*;

public class AllTasks {
    List<String> allTasks = new ArrayList<>();

    public void addTask() {
        System.out.println("МЕРОПРИЯТИЕ:\n Добавьте название (пробел) \n Добавьте описание темы (Enter)");
        System.out.println();
        Scanner scanner = new Scanner(System.in); 
        String tasks = scanner.nextLine(); 
        allTasks.add(tasks);  
        System.out.println();
    }

    public void printAllTasks() {
        System.out.println(allTasks.isEmpty() ? "Задач нет!" : "Список задач:");
            for (int i = 0; i < allTasks.size(); i++) {  
                System.out.printf("%d. %s, \n", i + 1, allTasks.get(i));  
            }
        System.out.println();
    }

    public void clearAllMissedCalls() { 
        allTasks.clear();   
        System.out.println("Все задачи удалены!");
        System.out.println();
    }
}
