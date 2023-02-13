public class Piano extends Instrument {  // 3) Создали класс Piano (это класс сын) он наследуется(extends) от класса Instrument (это класс отец)

    @Override  // Проверка метода
    public char playSound() {  	        // 4) Переопределили метод playSound(), если его будет вызывать класс Piano, то будет работать этот метод
        return '#';    		              // 5) Возвращает  '#'
    }
}
