import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String compareNubers ="Сравнить"; 

    String roundNubers = "Округлить";

    String discardFraction = "Отбросить дробную часть";

    System.out.println("Напишите слово: Сравнить, если хотите сравнить числа");
    System.out.println("Напишите слово: Округлить, если хотите округлить числа");
    System.out.println("Напишите слово: Отбросить дробную часть, если хотите отбросить дробную часть");
    
    System.out.println("Какую операцию вы хотите сделать?");
    String s = scanner.nextLine();

    if (s.equals(compareNubers)) {
      System.out.println("Введите первое число");
      double a = scanner.nextDouble();
      System.out.println("Введите второе число");
      float b = scanner.nextFloat();
      // сравнить числа
      if (Math.abs(a -b) <= 0.01){
      System.out.println("Числа равны");
      } else if (a > b) {
        System.out.println("Самое большое число: " + a + " Числа не равны");
        } else {
        System.out.println("Самое большое число: " + b + " Числа не равны");
        }

    } else if (s.equals(roundNubers)) {
      System.out.println("Введите первое число");
      double a = scanner.nextDouble();
      System.out.println("Введите второе число");
      float b = scanner.nextFloat();
      // округлить 
      double value = a;
      int result = (int) Math.round(value);
      System.out.println(result);

      float value2 = b;
      int result2 = (int) Math.round(value2);
      System.out.println(result2);
    
    } else if (s.equals(discardFraction)){
      System.out.println("Введите первое число");
      double a = scanner.nextDouble();
      System.out.println("Введите второе число");
      float b = scanner.nextFloat();
      // отбросить дробь
      double value3 = a;
      long result3 = (long) Math.ceil(value3);
      System.out.println(result3);

      float value4 = b;
      long result4 = (long) Math.ceil(value4);
      System.out.println(result4);
    
    } else {
      System.out.println("Вы ввели неправильно, попробуйте снова");
    }
  }
}
