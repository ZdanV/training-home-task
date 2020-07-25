package collection_task.optional_task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OptionalTask_1 {
    public static void main(String[] args) {

        File inputTaskFile = new File("src/main/resources/optionalTask1in.txt");
        File outputTaskFile = new File("src/main/resources/optionalTask1out.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputTaskFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputTaskFile))) {
            List<String> stringList = new ArrayList<>();
            String incomingString = null;
            while ((incomingString = reader.readLine()) != null) {
                stringList.add(incomingString);
            }

            ListIterator<String> itr = stringList.listIterator(stringList.size());
            while (itr.hasPrevious()) {
                writer.write(itr.previous() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
