package collection_task.optional_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class OptionalTask_2 {
    public static void main(String[] args) {
        System.out.println("Inter the number:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Stack<Integer> digitsStack = new Stack<>();
            char[] digitsAsChars = reader.readLine().toCharArray();
            for (char digitAsChar : digitsAsChars) {
                digitsStack.push(Character.getNumericValue(digitAsChar));
            }
            Collections.reverse(digitsStack);
            System.out.print("Reversed number: ");
            for (Integer digit : digitsStack) {
                System.out.print(digit);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
