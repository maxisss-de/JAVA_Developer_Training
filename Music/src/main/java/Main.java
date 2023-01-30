public class Main {                     // Это класс для реализации (что мы делали планы и чертежи в других классах)

    public static void main(String[] args) throws Exception {    // 14.11) "throws Exception" добавляется вместе с этой командой см. 14.9)
        Instrument[] instruments = {      // 11.1) Массив инструментов ([Первый индекс][] -номер инструмента, а [][второй индекс] - номер секунды.)
            new Guitar(),                 // 11.2) = см. 12.2)
                    new Piano(),          // 11.3) = см. 12.3)
                    new Flute(),          // 11.4) = см. 12.4)
                    new Guitar(),         // 11.5) = см. 12.5)
        };

        boolean[][] shouldPlay = {                           // 12.1) Информация о том, когда, какой инструмент будет играть
                {false, true, true, true, true, false},      // 12.2) Как будет играть Guitar
                {true, false, true, false, true, false},     // 12.3) Как будет играть Piano
                {false, false, true, true, false, false},    // 12.4) Как будет играть Flute
                {false, true, true, true, true, false}       // 12.5) Как будет играть Guitar
        };

        Song song = new Song(instruments, shouldPlay);
        {  // 13) Создаём объект нашей песни (чтобы она была видна тут). Передаём туда массив инструментов(instruments) и схема для игры(shouldPlay)
            song.play();                                    // 14.12) Если вызовем метод play(), который находиться в классе Song у нас пойдёт игра музыкальных инструментов

        }
    }
}
