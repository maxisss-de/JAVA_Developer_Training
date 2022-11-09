import weapons.*;

public class Player extends Weapon {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new BigGun(),       // Большой пистолет
                new AssaultRifle(), // Штурмовая винтовка
                new Rpg(),          // РПГ
                new Grenade(),      // Граната
                new Knife()         // Нож
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (this.getSlotsCount() <= slot && slot >= 0) {
            System.out.println("Нужно вводить от 0 до " + (this.getSlotsCount() - 1));
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}
