public class Flute extends Instrument {  // 3) Создали класс Flute (это класс сын) он наследуется(extends) от класса Instrument (это класс отец)

    @Override  // Проверка метода
    public char playSound() {  	        // 4) Переопределили метод playSound(), если его будет вызывать из класса Flute, то будет работать этот метод
        return '!';    		              // 5) Возвращает  '!'
    }
}
