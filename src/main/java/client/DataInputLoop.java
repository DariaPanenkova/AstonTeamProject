package client;

import arrays.ArrayFill;

import java.io.IOException;
import java.util.Scanner;

public class DataInputLoop {
    public static Object[] inputData(Object[] array) throws IOException {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Тип заполняемого массива: " + array.getClass().getSimpleName());
            System.out.println("""
                    Выберите способ заполнения массива, или "0" для отмены\s
                    1 - Из файла
                    2 - Случайные значения
                    3 - Вручную""");
            String input = console.nextLine();
            if (input.equalsIgnoreCase("0")) {
                break;
            }
            switch (input) {
                case "1": {
                    System.out.println("Введите путь к файлу, или \"0\" для отмены");
                    String path = console.nextLine();
                    if (path.equalsIgnoreCase("0")) {
                        break;
                    }
                    return ArrayFill.fromFile(path, array);
                }
                case "2": {
                    return ArrayFill.randomFill(array);
                }
                case "3": {
                    return ArrayFill.manualFill(array);
                }
                default: {
                    System.out.println("Неверный ввод \n");
                }
            }
        }
        return null;
    }
}
