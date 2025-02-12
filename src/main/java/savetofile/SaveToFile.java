package savetofile;

import java.io.*;
import java.util.Scanner;

public final class SaveToFile {
    private SaveToFile() {
    }

    public static <T> void getPathAndSave(T o) {
        Scanner scanner = new Scanner(System.in);
        String path;
        System.out.println("Введите путь файла, в который будет произведено сохранение:");
        try {
            path = scanner.nextLine();
            File file = new File(path);
            if ((file.getParentFile().exists()) && (file.isFile())) {
                if (o instanceof Object[]) {
                    saveToFile((T[]) o, path);
                } else
                    saveToFile(o, path);
            } else {
                System.out.println("Такой директории нет");
                getPathAndSave(o);
            }
        } catch (Exception e) {
            System.out.println("Такой директории нет");
            getPathAndSave(o);
        }
    }

    public static <T> void saveToFile(T[] array, String path) {
        try (FileWriter file = new FileWriter(path, true)) {
            for (int i = 0; i < array.length; i++) {
                file.write("\n");
                file.write(array[i].toString());
            }
            file.write("\n\n");
            System.out.println("Сохранение выполнено");
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        }
    }

    public static <T> void saveToFile(T element, String path) {
        if (element == null)
            System.out.println("Нечего сохранять");
        else {
            try (FileWriter file = new FileWriter(path, true)) {
                file.write(element.toString() + "\n");
                System.out.println("Сохранение выполнено");
            } catch (IOException e) {
                System.out.println("Произошла ошибка");
            }
        }
    }

}
