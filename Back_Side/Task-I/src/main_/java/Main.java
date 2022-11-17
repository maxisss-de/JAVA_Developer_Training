import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String rev = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {                      // Работает бесконечно, пока не введут "end"
            System.out.println("Напишите любые слова и они будут перевёрнуты");
            System.out.println(",если хотите закончить программу напишите слово end");
            System.out.println();
            String words = scanner.nextLine();

            int length = words.length();
            for (int i = length - 1; i >= 0; i--)
                rev = rev + words.charAt(i); // Метод charAt() – возвращает символ, расположенный по указанному индексу строки
            System.out.println("Reversed string: " + rev);
            if ("end".equals(words)) {
                break;
            }
        }
        scanner.close();
        System.out.println("Программа завершена!");
    }
}
