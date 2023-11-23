package com.company;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Heimerich", 6);  // 1. Создали собаку Heimerich с аппетитом 6
        Plate plate = new Plate(300);       // 2. Создали тарелку plate, в которой лежит 300 ед.еды
        plate.getInfo();                    // 3. Просим отпечатать информацию о тарелке (Было еды в тарелки)
        dog.setEat(plate);                  // 4. Просим Heimerich покушать из тарелки plate (Cъела собака)
        plate.getInfo();                    // 5. Смотрим как изменилась тарелка (Сейчас еды в тарелки)
    }
}


// Результат:
// Food amount: 300 - Было еды в тарелки
// Food amount: 294 - Сейчас еды в тарелки (после того, как съела собака dog.setEat(plate) )
