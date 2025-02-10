package arrays;

import classes.Bus;
import classes.Student;
import classes.User;
import cycles.DataInputTypeCycle;
import java.io.IOException;
import java.util.Scanner;

public class CreateArray {
    public static Bus[] buses;
    public static User[] users;
    public static Student[] students;

    public static int createBusesArray() {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите размер массива, или \"0\" для отмены");
            String sizeInput = console.nextLine();
            if (sizeInput.equalsIgnoreCase("0")) {
                return 0;
            }
            int size = Integer.parseInt(sizeInput);
            buses = new Bus[size];
            System.out.println("Пустой массив автобусов успешно создан\n");
            DataInputTypeCycle.inputData(buses);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    public static int createStudentsArray() {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите размер массива, или \"0\" для отмены");
            String sizeInput = console.nextLine();
            if (sizeInput.equalsIgnoreCase("0")) {
                return 0;
            }
            int size = Integer.parseInt(sizeInput);
            students = new Student[size];
            System.out.println("Пустой массив студентов успешно создан\n");
            DataInputTypeCycle.inputData(CreateArray.students);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }

    public static int createUsersArray() {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите размер массива, или \"0\" для отмены");
            String sizeInput = console.nextLine();
            if (sizeInput.equalsIgnoreCase("0")) {
                return 0;
            }
            int size = Integer.parseInt(sizeInput);
            users = new User[size];
            System.out.println("Пустой массив студентов успешно создан\n");
            DataInputTypeCycle.inputData(CreateArray.users);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 1;
    }
}

