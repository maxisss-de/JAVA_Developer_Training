import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        Piano piano = new Piano();          // Создали класс Piano тут, чтобы отображался
        Guitar guitar = new Guitar();       // Создали класс Guitar тут, чтобы отображался
        objectList.add(piano);              // Добавили класс Piano(piano) в objectList
        objectList.add(guitar);             // Добавили класс Guitar(guitar) в objectList

        objectList.forEach(object -> {                              // Метод forEach() позволяет последовательно перебрать все элементы массива. / "object" относиться к objectList, но за вместо "object", можно указать любое название (ну лучше указывать, то название к чему оно похоже)
            if (object instanceof Guitar) {                         // Тут мы определили, что этот объект является инстансом Гитары / Оператор instanceof позволяет проверить, принадлежит ли объект указанному классу, с учётом наследования.
                System.out.println(((Guitar) object).playSound());  // То есть если Guitar принадлежит к objectList, то она будет играть "playSound()"
            } else if (object instanceof Piano) {                   // Тут мы определили, что этот объект является инстансом Пианино / Оператор instanceof позволяет проверить, принадлежит ли объект указанному классу, с учётом наследования.
                System.out.println(((Piano) object).playSound());   // То есть если Guitar принадлежит к objectList, то она будет играть "playSound()"
            }
        });

        // ТОЖЕ САМОЕ, НО КАК ЭТО ИСПОЛЬЗУЕТСЯ ОБЫЧНО, БЕЗ (КАСТА) В СКОБКАХ

        List<Instrument> instrumentList = new ArrayList<>();
        Piano piano2 = new Piano();
        Guitar guitar2 = new Guitar();
        instrumentList.add(piano2);
        instrumentList.add(guitar2);

        instrumentList.forEach(instrument -> {              // Метод forEach() позволяет последовательно перебрать все элементы массива. / "instrument" относиться к instrumentList, но за вместо "instrument", можно указать любое название (ну лучше указывать, то название к чему оно похоже)
            if (instrument instanceof Guitar) {             // В этом случае мы не кастим в гитару / Оператор instanceof позволяет проверить, принадлежит ли объект указанному классу, с учётом наследования.
                System.out.println(instrument.playSound()); // В этом случае мы не кастим в гитару / То есть если Guitar принадлежит к instrumentList, то она будет играть "playSound()"
            } else if (instrument instanceof Piano) {       // В этом случае мы не кастим в пианино / Оператор instanceof позволяет проверить, принадлежит ли объект указанному классу, с учётом наследования.
                System.out.println(instrument.playSound()); // В этом случае мы не кастим в пианино / То есть если Piano принадлежит к instrumentList, то она будет играть "playSound()"
            }
        });
    }
}
