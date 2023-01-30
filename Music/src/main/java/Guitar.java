public class Guitar extends Instrument {  // 3) Создали класс Guitar (это класс сын) он наследуется(extends) от класса Instrument (это класс отец)

    @Override  // Проверка метода
    public char playSound() {  	          // 4) Переопределили метод playSound(), если его будет вызывать из класса Guitar, то будет работать этот метод
        return '$';    		                // 5) Возвращает  '$'
    }
}
