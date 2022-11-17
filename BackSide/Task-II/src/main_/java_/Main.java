import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {                                    // Работает бесконечно, пока не введут "end"
            System.out.println();
            System.out.println("Напишите любые слова и они будут перевёрнуты");
            System.out.println(",если хотите закончить программу напишите слово end");
            System.out.println();
            String inputWords = scanner.nextLine();
            String[] parts = inputWords.split(" ");      // Делим слова на два 1."Привет Мир", стало 1."Привет" 2."Мир" и положили всё parts в массив

            for (int i = 0; i < parts.length; i++) {
                char[] s1 = parts[i].toCharArray();      // Метод toCharArray() — преобразует данную строку в новый массив символов
                for (int j = s1.length-1; j >= 0; j--)
            { System.out.print(s1[j]); }
                System.out.print(" ");
            }
            if ("end".equals(inputWords)) {
                break;
            }
        }
        scanner.close();
        System.out.println("Программа завершена!");
    }
}
