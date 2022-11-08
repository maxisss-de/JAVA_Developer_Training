import java.util.Scanner;

class Main {
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        int result = sum(a,b,c);

        System.out.println("Сумма чисел = " + result);
    }
}
