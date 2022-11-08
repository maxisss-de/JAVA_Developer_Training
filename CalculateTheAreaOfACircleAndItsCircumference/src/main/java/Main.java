import java.util.Scanner;

class Main {
    public static final double PI = 3.14;

    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах");
        int radius = scanner.nextInt();
        System.out.println("Площадь круга: " + calculateCircleArea(radius) + " см.кв.");
        System.out.println();
        System.out.println("Длина окружности: " + calculateCircleLength(radius) + " см.");
    }
}
