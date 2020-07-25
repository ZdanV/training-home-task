package fundamental_task;
//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел

import java.util.Scanner;

public class MainTask_1_5 {

    static void setMonth(int getNumberMounth) {

        String setMounth;

        String[] month = {"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        try {
            setMounth = month[getNumberMounth - 1];
            System.out.println("Это месяц - " + setMounth + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int numberMounth = sc.nextInt();
        setMonth(numberMounth);
    }
}
