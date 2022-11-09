package weapons;
//import Weapon;

public class Knife extends Weapon {

    @Override
    public void shot() {
        System.out.println("Кончились патроны, но у меня есть ещё нож");
    }
}
