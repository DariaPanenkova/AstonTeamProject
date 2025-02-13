package client;

import arrays.CreateArray;
import cycles.DataInputTypeCycle;

import java.io.IOException;
import java.util.Scanner;

public class ClientLoop {
    public static void main(String[] args) {
        while (true) {
            // Выбор типа массива
            int type = getArrayType();
            if (type == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            // Выбор длины массива
            int size = getArrayLength();
            if (size == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                Object[] array = DataInputTypeCycle.inputData(CreateArray.createArray(type, size));
            } catch (NullPointerException | IOException e) {
                System.out.println();
            }
        }
    }

    // Метод для получения типа массива
    private static int getArrayType() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите тип массива (1 - Автобусы, 2 - Студенты, 3 - Пользователи, 0 - выход): ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 0 && input <= 3) {
                    return input;
                } else {
                    System.out.println("Недопустимый ввод. Пожалуйста, введите 0, 1, 2 или 3.");
                }
            } else {
                System.out.println("Недопустимый ввод. Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }
    }

    // Метод для получения длины массива
    private static int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите длину массива (0 - выход): ");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("Недопустимый ввод. Длина массива должна быть неотрицательной.");
                }
            } else {
                System.out.println("Недопустимый ввод. Пожалуйста, введите число.");
                scanner.next(); // Очистка некорректного ввода
            }
        }
    }
}
