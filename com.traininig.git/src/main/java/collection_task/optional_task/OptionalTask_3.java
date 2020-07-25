package collection_task.optional_task;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OptionalTask_3 {
    public static void addFileToListIfItRegularFile(File fileSource, List<File> list) {
        File[] filesFromDirectory = fileSource.listFiles();
        for (File file : filesFromDirectory) {
            if (!file.isDirectory()) {
                list.add(file);
            } else {
                addFileToListIfItRegularFile(file, list);
            }
        }
    }

    public static void main(String[] args) {
        File taskDirectory = new File("src/main/resources/optionalTask3Directory");
        List<File> fileList = new ArrayList<>();
        OptionalTask_3.addFileToListIfItRegularFile(taskDirectory, fileList);
        for (File file : fileList) {
            System.out.println(file);
        }
    }
}
