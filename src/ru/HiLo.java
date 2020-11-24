package ru;

import java.util.Scanner; // импорт класса сканер для обработки данных введенных с клавиатуры

public class HiLo {
    // Игра - угадай число, да комменты будут на русском - пишу для себя :)
    public static void main(String[] args) {
        // создаем класс сканер - для принятия значений с клавиатуры
        Scanner scan = new Scanner(System.in);
        // генерация случайного числа через класс Мас.рандом - фишка в том, что от 0.0 до 0.9, поэтому и * на 100
        int theNumber = (int) (Math.random() * 100 + 1);
    }
}
