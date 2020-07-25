package fundamental_task;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Scanner;

public class MainTask_2_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введи два слова через пробел и нажми Энтер");

        String line = scan.nextLine();

        String longWord = "", shortWord = line;

        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }

        System.out.println("Самое длинное слово: '" + longWord + "'");
        System.out.println("Длина: " + longWord.length());
        System.out.println("Самое короткое слово: '" + shortWord + "'");
        System.out.println("Длина: " + shortWord.length());
    }
}
