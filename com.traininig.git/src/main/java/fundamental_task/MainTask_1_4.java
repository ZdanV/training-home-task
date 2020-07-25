package fundamental_task;
//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class MainTask_1_4 {
    public static void main(String[] args) {

        int summa = 0;
        int product = 1;

        System.out.print("Command line arguments: ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            int number = Integer.parseInt(args[i]);
            summa += number;
            product *= number;
        }
        System.out.println("\nSum: " + summa);

        System.out.println("Product: " + product);
    }
}
