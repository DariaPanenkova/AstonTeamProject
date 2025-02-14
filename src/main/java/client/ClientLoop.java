package client;

import arrays.CreateArray;
import sortdir.evensort.EvenSortData;
import sortdir.quicksorts.DataQuickSort;

import java.io.IOException;
import java.util.Arrays;
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
                // Создание + заполнение массива
                Object[] array = DataInputLoop.inputData(CreateArray.createArray(type, size));
                if (array == null) {
                    continue;
                }

                //Варианты действий с массивом
                int action = actionArrayMenu(array);

                if (action == 0) {
                    break;
                }

            } catch (NullPointerException | IOException e) {
                System.out.println("Exception");
            }
        }
    }

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
                scanner.next();
            }
        }
    }

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
                scanner.next();
            }
        }
    }

    private static int actionArrayMenu(Object[] array) {
        Scanner scanner = new Scanner(System.in);
        Object[] sortArray = DataQuickSort.sort(array);

        while (true) {
            System.out.print("Выберите действие (1 - Кастомная сортировка, 2 - Бинарный поиск, 3 - Создать новый массив, 0 - выход): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        customSort(array);
                        break;
                    case 2:
                        binarySearch(sortArray);
                        break;
                    case 3:
                        return 1;
                    case 0:
                        System.out.println("Выход из программы.");
                        return 0;
                    default:
                        System.out.println("Недопустимый ввод. Пожалуйста, выберите 0, 1, 2 или 3.");
                }
            } else {
                System.out.println("Недопустимый ввод. Пожалуйста, введите число.");
                scanner.nextLine();
            }
        }
    }

    private static void customSort(Object[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст. Сначала создайте массив.");
            return;
        }

        Object[] evenArr = EvenSortData.sort(array);

        System.out.println("Отсортированный массив методом чётной сортировки:\n" + Arrays.toString(evenArr));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Сохранить отсортированный массив в файл? (1 - Да, 2 - Нет): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        SaveToFile.getPathAndSave(evenArr);
                        return;
                    case 2:
                        return;
                    default:
                        System.out.println("Недопустимый ввод. Пожалуйста, выберите 1, 2");
                }
            } else {
                System.out.println("Недопустимый ввод. Пожалуйста, введите число.");
                scanner.nextLine();
            }
        }
    }

    private static void binarySearch(Object[] sortArray) {
        if (sortArray.length == 0) {
            System.out.println("Массив пуст. Сначала создайте массив.");
            return;
        }

        BinarySearchLoop<Object> search = new BinarySearchLoop<>();

        int index = search.search(sortArray);
        Scanner scanner = new Scanner(System.in);
        if (index != -1) {
            while (true) {
                System.out.print("Сохранить найденный элемент в файл? (1 - Да, 2 - Нет): ");
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            SaveToFile.getPathAndSave(sortArray[index]);
                            return;
                        case 2:
                            return;
                        default:
                            System.out.println("Недопустимый ввод. Пожалуйста, выберите 1, 2");
                    }
                } else {
                    System.out.println("Недопустимый ввод. Пожалуйста, введите число.");
                    scanner.nextLine();
                }
            }
        }
    }
}
