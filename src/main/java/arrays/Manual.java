package arrays;

import dataclasses.Bus;
import dataclasses.Student;
import dataclasses.User;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Manual {
    public static Bus[] createBus(Bus[] array) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Автобус " + (i + 1) + "\n");
            System.out.println("Введите номер автобуса");
            int num;
            while (true) {
                if (console.hasNextInt()) {
                    num = console.nextInt();
                    break;
                } else {
                    System.out.println("Введите число");
                }
                console.next();
            }
            console.nextLine();

            System.out.println("Введите модель автобуса");
            String model = console.nextLine();

            int mileage;
            while (true) {
                System.out.println("Введите пробег автобуса");
                if (console.hasNextInt()) {
                    mileage = console.nextInt();
                    break;
                } else {
                    System.out.println("Введите число");
                }
                console.next();
            }
            console.nextLine();
            array[i] = new Bus.BusBuilder().setNum(num).setModel(model).setMileage(mileage).build();
        }
        System.out.println(Arrays.toString(array) + "\n");
        return array;
    }

    public static User[] createUser(User[] array) {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Пользователь " + (i + 1) + "\n");
            String name;
            String password;
            String mail;
            System.out.println("Введите имя пользователя");
            while (true) {
                Pattern namepattern = Pattern.compile("[0-9!@#$%^&*()_+|}{',./:]");
                name = console.nextLine();
                if (namepattern.matcher(name).find()) {
                    System.out.println("Имя не должно сожержать цифр и знаков");
                } else break;
            }
            System.out.println("Введите почту пользователя");
            while (true) {
                Pattern mailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,6}$");
                mail = console.nextLine();
                if (!mailPattern.matcher(mail).find()) {
                    System.out.println("Неверный формат почты");
                } else break;

            }
            System.out.println("Введите пароль пользователя");
            while (true) {
                Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()]).{8,}$");
                password = console.nextLine();
                if (!passwordPattern.matcher(password).find()) {
                    System.out.println("Пароль должен содержать 8 символов, одну заглавную, одну строчную букву, цифру, и спецсимвол");
                } else break;
            }
            array[i] = new User.UserBuilder().setName(name).setPassword(password).setMail(mail).createUser();

        }
        System.out.println(Arrays.toString(array) + "\n");
        return array;
    }

    public static Student[] createStudent(Student[] array) {
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Студент " + (i + 1) + "\n");
            System.out.println("Введите номер зачётной книжки студента");
            int gradeBookNum;
            while (true) {
                if (console.hasNextInt()) {
                    gradeBookNum = console.nextInt();
                    if (gradeBookNum > 0) {
                        break;
                    } else System.out.println("Номер зачётной книжки должен быть больше 0");
                } else {
                    System.out.println("Введите число");
                    console.next();
                }
            }
            console.nextLine();

            System.out.println("Введите группу студента");
            String group = console.nextLine();

            double averageGrade;
            while (true) {
                System.out.println("Введите среднюю оценку студента");
                if (console.hasNextDouble()) {
                    averageGrade = console.nextDouble();
                    if (averageGrade > 0) {
                        break;
                    } else System.out.println("Средняя оценка должна быть больше 0");

                } else {
                    System.out.println("Введите число");
                }
                console.next();
            }
            console.nextLine();
            array[i] = new Student.StudentBuilder().setGradeBookNum(gradeBookNum).setGroup(group).setAverageGrade(averageGrade).build();
        }
        System.out.println(Arrays.toString(array) + "\n");
        return array;
    }
}
