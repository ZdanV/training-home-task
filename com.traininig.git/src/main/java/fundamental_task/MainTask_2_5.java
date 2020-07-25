package fundamental_task;
/* Найти количество чисел, содержащих только четные цифры,
 а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MainTask_2_5 {
    public static void main(String[] args) {

        int n;
        System.out.println("Введие n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] massiv_chisel = new int[n]; // массив вводимых чисел

        int chet_qiwra = 0; // кол-во четных цифр в числе
        int nechet_qiwra = 0; // кол-во нечетных

        int chet_itog = 0; // итоговое кол-во чисел, состоящих ТОЛЬКО из четных цифр
        int nechet_chet_itog = 0; // а тут равных четных-нечетных

        for (int s = 0; s < n; s++) {   // вводим число

            System.out.println("Число " + (s + 1) + " : ");
            massiv_chisel[s] = sc.nextInt();

            ArrayList<Integer> qiwri = new ArrayList<>();
            while (massiv_chisel[s] != 0) {
                qiwri.add(massiv_chisel[s] % 10);
                massiv_chisel[s] /= 10;
            }

            for (int i = 0; i < qiwri.size(); i++) { // проверяем кажду цифру на четность и увеличиваем соответствующий счетчик
                if (qiwri.get(i) % 2 == 0) chet_qiwra++;
                else nechet_qiwra++;
            }

            if (chet_qiwra == qiwri.size()) chet_itog++; // если кол-во четных цифр = кол-ву цифр в чисел
            else if (chet_qiwra == nechet_qiwra) nechet_chet_itog++; // а если четные = нечетным - второе

            chet_qiwra = 0; // обнулим счетчики
            nechet_qiwra = 0;

        }

        System.out.println("Цифр состоящих только из четных чисел : " + chet_itog +
                "\nА чисел, где кол-во четных и нечетных чисел равны : " + nechet_chet_itog);
    }
}
