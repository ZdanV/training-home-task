package collection_task.main_task;

public class FloristHelper {
    public static String convertCoinsToBin(int coins) {
        return String.format("%d.%02d BYN", coins / 100, coins % 100);
    }
}
