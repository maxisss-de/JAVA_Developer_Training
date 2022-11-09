import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n На сколько повернуть?\n на 90 С.\n на 180 С.\n на 270 С.");
        System.out.println();
        int degree = scanner.nextInt();
        System.out.println();

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        printMatrix(colors);
        if (degree == 90) {
            for (int i = 0; i < colors.length; i++) {
                for (int j = 0; j < colors.length; j++) {
                     rotatedColors[j][colors.length - i - 1] = colors[i][j];
                }
            }
        } else if (degree == 180) {
            for (int i = 0; i < colors.length; i++) {
                for (int j = 0; j < colors.length; j++) {
                     rotatedColors[colors.length - i - 1][colors.length - j - 1] = colors[i][j];
                }
            }
        } else {
            for (int i = 0; i < colors.length; i++) {
                for (int j = 0; j < colors.length; j++) {
                     rotatedColors[colors.length - j - 1][i] = colors[i][j];
                }
            }
        }
        colors = rotatedColors;
        System.out.println();
        printMatrix(colors);
    }

    public static void printMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
}
