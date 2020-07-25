package fundamental_task;
//Отобразить в окне консоли аргументы командной строки в обратном порядке

import java.util.Scanner;

public class MainTask_1_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введи число: ");

        for (int i = 0; true; i++) {
            StringBuffer rev = new StringBuffer(input.nextLine());
            rev.reverse();
            System.out.println("Реверс ввода - " + rev.toString());

            System.out.println("Для выхода нажми СТОП, для продолжения введи число: ");
        }
    }
}
