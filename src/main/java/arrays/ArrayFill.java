package arrays;

import classes.Bus;
import classes.Student;
import classes.User;
import randomizer.Randomizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class ArrayFill {
    public static void fromFile(String filepath, Object[] array) throws IOException {
        try (FileReader fr = new FileReader(filepath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            String[] tokens;
            int count = 0;
            while ((line = br.readLine()) != null) {
                tokens = line.split(" ");
                try {
                    if (ArrayCheck.isBusArray(array)) {
                        int num = Integer.parseInt(tokens[0]);
                        String model = tokens[1];
                        int mileage = Integer.parseInt(tokens[2]);
                        if (FormatChecker.checkBus(num, mileage)) {
                            array[count] = new Bus.BusBuilder().setNum(num).setModel(model).setMileage(mileage).build();
                        } else
                            System.out.println("Массив не создан. Номер должен быть положительным, пробег не должен быть отрицательным");
                    }
                    if (ArrayCheck.isUsersArray(array)) {
                        if (!FormatChecker.checkUser(tokens[1])) {
                            array[count] = new User.UserBuilder().setName(tokens[0]).setPassword(tokens[1]).setMail(tokens[2]).createUser();
                        } else
                            System.out.println("Неверный формат имени пользователя. Имя не должно содержать цифры и знаки");
                    }
                    if (ArrayCheck.isStudentsArray(array)) {
                        if (FormatChecker.checkStudent(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[2]))) {
                            array[count] = new Student.StudentBuilder().setGradeBookNum(Integer.parseInt(tokens[0])).setGroup(tokens[1]).setAverageGrade(Double.parseDouble(tokens[2])).build();
                        } else
                            System.out.println("Массив не создан. Номер зачётной книжки и средней оценки должен быть больше 0");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Недостаточно места в массиве, для записи всех данных, увеличьте размер массива");
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат ввода, проверьте поля в файле");
                }
                count++;
            }
            System.out.println(Arrays.toString(array) + "\n");
        }

    }

    public static void randomFill(Object[] array) {
        Random random = Random.from(RandomGenerator.getDefault());
        if (ArrayCheck.isBusArray(array)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Bus.BusBuilder().setNum(random.nextInt(1, 999)).setMileage(random.nextInt(0, 1000000)).setModel(Randomizer.modelRandomizer()).build();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
        if (ArrayCheck.isStudentsArray(array)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Student.StudentBuilder().setGradeBookNum(random.nextInt(1, 1000)).setAverageGrade(random.nextDouble(0, 5.0)).setGroup(Randomizer.groupRandomizer()).build();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
        if (ArrayCheck.isUsersArray(array)) {

            for (int i = 0; i < array.length; i++) {
                array[i] = new User.UserBuilder().setName(Randomizer.nameRandomizer()).setMail(Randomizer.mailRandomizer()).setPassword(Randomizer.passwordRandomizer()).createUser();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
    }

    public static void manualFill(Object[] array) {
        Scanner console = new Scanner(System.in);
        try {
            if (ArrayCheck.isBusArray(array)) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Автобус " + (i + 1) + "\n");
                    System.out.println("Введите номер автобуса");
                    int num = Integer.parseInt(console.nextLine());
                    System.out.println("Введите модель автобуса");
                    String model = console.nextLine();
                    System.out.println("Введите пробег автобуса");
                    int mileage = Integer.parseInt(console.nextLine());
                    if (FormatChecker.checkBus(num, mileage)) {
                        array[i] = new Bus.BusBuilder().setNum(num).setModel(model).setMileage(mileage).build();
                    } else
                        System.out.println("Массив не создан. Номер должен быть положительным, пробег не должен быть отрицательным");
                }

                System.out.println(Arrays.toString(array) + "\n");
            }
            if (ArrayCheck.isUsersArray(array)) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Пользователь " + (i + 1) + "\n");
                    System.out.println("Введите имя пользователя");
                    String name = console.nextLine();
                    System.out.println("Введите пароль пользователя");
                    String password = console.nextLine();
                    System.out.println("Введите электронную почту пользователя");
                    String mail = console.nextLine();
                    if (!FormatChecker.checkUser(name)) {
                        array[i] = new User.UserBuilder().setName(name).setPassword(password).setMail(mail).createUser();
                    } else
                        System.out.println("Неверный формат имени пользователя. Имя не должно содержать цифры и знаки");
                }
                System.out.println(Arrays.toString(array) + "\n");
            }
            if (ArrayCheck.isStudentsArray(array)) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Студент " + (i + 1) + "\n");
                    System.out.println("Введите номер зачётной книжки студента");
                    int gradeBookNum = Integer.parseInt(console.nextLine());
                    System.out.println("Введите группу студента");
                    String group = console.nextLine();
                    System.out.println("Введите среднюю оценку студента");
                    double averageGrade = Double.parseDouble(console.nextLine());
                    if (FormatChecker.checkStudent(gradeBookNum, averageGrade)) {
                        array[i] = new Student.StudentBuilder().setGradeBookNum(gradeBookNum).setGroup(group).setAverageGrade(averageGrade).build();
                    } else
                        System.out.println("Массив не создан. Номер зачётной книжки и средней оценки должен быть больше 0");
                }
                System.out.println(Arrays.toString(array) + "\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода");
        }
    }
}