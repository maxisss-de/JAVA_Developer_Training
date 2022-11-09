import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием," + " введите номер от 0 до 4, чтобы выстрелить," + " -1 чтобы выйти%n", player.getSlotsCount());
        int slot;

        while (true) {
            int choiceOfWeapons = scanner.nextInt();
            {
                slot = choiceOfWeapons;
                if (-1 >= choiceOfWeapons) {
                    break;
                } else {
                    player.shotWithWeapon(slot);
                }
            }
        }
        System.out.println("Game over!");
    }
}
