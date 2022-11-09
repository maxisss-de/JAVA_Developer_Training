import java.util.Scanner;

class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"}; // Продукция
        int[] prices = new int[]{100, 200, 300}; // Цены на товар
        int[] basket = new int[4];               // basket - корзина массив (куда сохраняются данные вода)

        int productNumber = 0; // Для номера продукта
        int productCount = 0;  // Для количество товара
        int sumProducts = 0;   // Сумма ИТОГО

        while (true) {
            System.out.println();
            System.out.println("Список возможных товаров для покупки:");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " " + prices[i]);
            }
            System.out.println("Выберите товар и количество или введите end");
            String inputString = scanner.nextLine();          // inputString - строка ввода
            if ("end".equals(inputString)) {
                break;
            }

            String[] parts = inputString.split(" ");         // текст преобразовали в массив ["1 2"]
            productNumber = Integer.parseInt(parts[0]) - 1;  // из массива преобразовали текст в число 1 - 1
            productCount = Integer.parseInt(parts[1]);       // из массива преобразовали текст в число 2 - 1

            sumProducts = sumProducts + (prices[productNumber] * productCount);  // currentPrice - текущая цена товара (в колличестве)
            basket[productNumber] = basket[productNumber] + productCount;
        }
      
        System.out.println("Программа завершена!");
        System.out.println();
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара: " + " " + "Количество: " + " " + "Цена/за.ед: " + " " + "Общая стоимость: ");
        for (int i = 0; i < products.length; i++) {
            int currentPrice = basket[i] * prices[i];     // Текущая цена всего на один товар
            if (basket[i] != 0){
                System.out.println(products[i] + "                       " + basket[i] + "           " + prices[i] + "              " + currentPrice);
            }
        }
        System.out.println("Итого: " + sumProducts);
    }
}
