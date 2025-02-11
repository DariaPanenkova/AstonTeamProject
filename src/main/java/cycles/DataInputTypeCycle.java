package cycles;

import arrays.ArrayFill;
import java.io.IOException;
import java.util.Scanner;

public class DataInputTypeCycle {
    public static void inputData(Object[] array) throws IOException {
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
                    ArrayFill.fromFile(path, array);
                    break;
                }
                case "2": {
                    ArrayFill.randomFill(array);
                    break;
                }
                case "3": {
                    ArrayFill.manualFill(array);
                    break;
                }
                default: {
                    System.out.println("Неверный ввод \n");
                    break;
                }
            }
            break;
        }

    }
}
