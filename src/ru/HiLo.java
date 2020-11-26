package ru;

import java.util.Scanner; // импорт класса сканер для обработки данных введенных с клавиатуры

public class HiLo {
    // Игра - угадай число, да комменты будут на русском - пишу для себя :)
    public static void main(String[] args) {
        // создаем класс сканер - для принятия значений с клавиатуры
        Scanner scan = new Scanner(System.in);
        String playAgain;
        int numberOfTries = 0;
        // делаем еще один цикл ду-вайл - чтобы можно было повторно сыграть.
        do {
            /* генерация случайного числа через класс Мас.рандом - фишка в том, что рандом генерит в промежутке
             от 0.0 до 0.9999, поэтому умножаем на 100 - так как в игре надо угадать число от 1 до 100 + 1 чтобы когда
             выпадет ноль случайным образом получить 1 и еще важная штука приведение типа - (int) -
             изменяет тип с десятичной дроби в целое число, отбрасывая десятки */
            int theNumber = (int) (Math.random() * 200 - 100 + 1);
            // проверка генерации случайного числа чере вывод на экран
            // System.out.println(theNumber);
            // объявление и инициализация переменной
            int guess = 0;
            // System.out.println("Введи число от 1 до 100 и нажми Enter");
        /* сохраним ответ пользователя в переменную guess и применим созданный ранее объект scan, класс Scanner
        содержит метод nextInt(), который ожидает значение типа Инт введенное пользователем.
         */
            //guess = scan.nextInt();
            //System.out.println("Вы ввели " + guess + ".");
            // добавляем цикл, чтобы можно было угадывать бесконечно долго :)
            while (guess != theNumber) {
                System.out.println("Введи число от -100 до 100 и нажми Enter");
                guess = scan.nextInt(); // сканирует ввод с клавиатуры целых чисел
                System.out.println("Вы ввели " + guess + ".");
                numberOfTries++; // добавляем счетчик попыток
                // делаем условия
                if (guess < theNumber) {
                    System.out.println(guess + " меньше числа. Попробуй еще раз");
                } else if (guess > theNumber) {
                    System.out.println(guess + " больше числа. Попробуй еще разок");
                } else {
                    System.out.println("Ты победил!!!");
                    System.out.println("Ты угадал за " + numberOfTries + " раз");
                }
            } // конец цикла вайл
            System.out.println("Сыграем еще разок??? (y/n)");
            playAgain = scan.next(); // scan.next сканирует ввод с клавиатуры символов и записывает в playAgain
        } while (playAgain.equalsIgnoreCase("y")); /* сравнивает данную строку с другой строкой,
        игнорируя регистр. */
        System.out.println("Спасибо за игру!!! До встречи!!!");
        scan.close(); // закрываем соединение с клавиатурой - чтобы в теории не переполнить память.
    }
}

