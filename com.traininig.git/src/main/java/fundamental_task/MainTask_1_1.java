package fundamental_task;
//Приветствовать любого пользователя при вводе его имени через командную строку

import java.util.Scanner;

public class MainTask_1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свое имя, пжл:");
        String name = scanner.next();
        System.out.println("Привет дорогой Друг, " + name);
    }
}
