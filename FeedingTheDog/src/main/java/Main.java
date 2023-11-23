package com.company;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Heimerich", 6);
        Plate plate = new Plate(300);
        plate.getInfo();   // Было еды в тарелки
        dog.setEat(plate); // Cъела собака
        plate.getInfo();   // Сейчас еды в тарелки
    }
}
