package com.company;

public class Dog {
    private String name;
    private int appetite;

    public Dog(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
  
  // Модифицируем метод eat() в классе Dog, что делаем: см. ниже, 1 и 2
    public void setEat(Plate p) { 
        p.setDecreaseFood(appetite);
    }
}

// Метод eat(): 1. Когда мы просим собаку поесть, необходимо указать на тарелку из которой он должен кушать, для этого в качестве аргумента прокидываем в метод eat(Plate plate) ссылку на объект типа Plate.
// Метод eat(): 2. Во время выполнения метода eat() мы считаем что в тарелке должно уменьшиться количество еды, в зависимости от аппетита собаки (так как он эту еду съест) ->  
// -> Поэтому обращаемся к тарелке и вызываем у неё метод decreaseFood(передавая сюда аппетит собаки).
