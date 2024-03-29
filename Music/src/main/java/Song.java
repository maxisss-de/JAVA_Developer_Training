public class Song {  // 6) Создали класс Song

    protected Instrument[] instruments;  // 7) Набор инструментов
    protected boolean[][] shouldPlay;  	 // 8) Схема игры: [Первый индекс][] -номер инструмента, а [][второй индекс] - номер секунды. В этом массивы будут ответы: да(true) или нет(false)

    public Song(Instrument[] instruments, boolean[][] shouldPlay) {  // 9) Конструктор
        this.instruments = instruments;
        this.shouldPlay = shouldPlay;
    }

    public void play() throws Exception {  		                    // 14.10) "throws Exception" добавляется вместе с этой командой см. 14.9)
        int time = shouldPlay[0].length; 		                      // 14.1) time - общие время; shouldPlay[0].length - вынимаем первый внутрений массив
        for (int t = 0; t < time; t++) {		                       // 14.2) Тут обрабатываем одну секунду за раз. "t" - это секунда (потому-что считаем секунды). Этот цикл "for (int t = 0; t < time; t++)" будет повторят для каждой секунды
            // 14.3.1) Что надо делать на каждой секунде?
            for (int i = 0; i < instruments.length; i++) {  		  // 14.3.2) По сути нам надо пройтись по всем инструментам у каждого из них спросить тот символ, который сотворяет их звук, но тот символ мы будем выводит, только в том случае, если этот инструмент должен играть, если он не должен играть, мы поставим прочерк или пробел.
            // 14.5.1) Нам надо проверить, должен ли играть этот инструмент вообще?
                if (shouldPlay[i][t]) {   					              // 14.5.2) В [первом индексе][] указываем "i" - это -номер инструмента; Во [][втором индексе] указываем "t" - это номер секунды.
                    Instrument instrument = instruments[i];		    // 14.4) Тут будем вынимать нужный нам инструмент. Хотя мы храним значение с типом Instrument ..., на самом деле там будет лежать объект который "instrument (это может быть: Piano, Guitar, Flute)" имеет тип наследника класса Instrument
                    char c = instrument.playSound();			        // 14.6) Если инструмент должен играть, тогда вынимаем его из массива и спрашиваем его какой символ осотворяет твой звук и ложим его в "с"
                    System.out.print(c + " "); 				            // 14.7) Выводим на экран это
                } else {
                    System.out.print("  "); 				              // 14.7) Если инструмент не должен играть выводим два пробела "  "
                }

            }
            System.out.println(); // 14.8) Нажимаем потом Enter
            Thread.sleep(1000);   // 14.9) Немного, чтобы быстро не выводилось всё в консоли, а выводилось медленно. В скобках () указывается скорость + нужно добавить см.14.10).
        }
    }
}
