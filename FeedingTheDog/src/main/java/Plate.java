package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

  // Добавим тарелке поведение (метод decreaseFood(int amount)): в тарелке может уменьшаться количество еды. см. 1.
    public void setDecreaseFood(int amount) {
        food -= amount;
    }
  
    public void getInfo() {
        System.out.println("Food amount: " + food);
    }
}

// 1. То есть вызывая у тарелки метод decreaseFood(5) вы должны указать то количество еды, которое надо “убрать” из тарелки.
