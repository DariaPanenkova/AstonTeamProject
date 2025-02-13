package arrays;

import dataclasses.Bus;
import dataclasses.Randomizer;
import dataclasses.Student;
import dataclasses.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ArrayFill {
    public static Object[] fromFile(String filepath, Object[] array) throws IOException {
        try (FileReader fr = new FileReader(filepath); BufferedReader br = new BufferedReader(fr)) {
            String line;
            String[] tokens;
            int count = 0;
            while ((line = br.readLine()) != null) {
                tokens = line.split(" ");
                try {
                    if (ArrayCheckType.isBusArray(array)) {
                        int num = Integer.parseInt(tokens[0]);
                        String model = tokens[1];
                        int mileage = Integer.parseInt(tokens[2]);
                        if (FormatChecker.checkBus(num, mileage)) {
                            array[count] = new Bus.BusBuilder().setNum(num).setModel(model).setMileage(mileage).build();
                        } else
                            System.out.println("Автобус не создан. Номер должен быть положительным, пробег не должен быть отрицательным");
                    }
                    if (ArrayCheckType.isUsersArray(array)) {
                        if (!FormatChecker.checkUser(tokens[1])) {
                            array[count] = new User.UserBuilder().setName(tokens[0]).setPassword(tokens[1]).setMail(tokens[2]).createUser();
                        } else
                            System.out.println("Пользователь не создан. Имя не должно содержать цифры и знаки");
                    }
                    if (ArrayCheckType.isStudentsArray(array)) {
                        BigDecimal bd = BigDecimal.valueOf(Double.parseDouble(tokens[2]));
                        if (FormatChecker.checkStudent(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[2]))) {
                            array[count] = new Student.StudentBuilder().setGradeBookNum(Integer.parseInt(tokens[0])).setGroup(tokens[1]).setAverageGrade(Double.parseDouble(String.valueOf(bd.setScale(2, RoundingMode.HALF_EVEN)))).build();
                        } else
                            System.out.println("Студент не создан. Номер зачётной книжки и средней оценки должен быть больше 0");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Недостаточно места в массиве, для записи всех данных, увеличьте размер массива");
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат ввода, проверьте поля в файле");
                }
                count++;
            }
            System.out.println(Arrays.toString(array) + "\n");
            return array;
        }

    }

    public static Object[] randomFill(Object[] array) {
        Random random = Random.from(RandomGenerator.getDefault());
        if (ArrayCheckType.isBusArray(array)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Bus.BusBuilder().setNum(random.nextInt(1, 999)).setMileage(random.nextInt(0, 1000000)).setModel(Randomizer.modelRandomizer()).build();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
        if (ArrayCheckType.isStudentsArray(array)) {
            for (int i = 0; i < array.length; i++) {
                BigDecimal bd = BigDecimal.valueOf(random.nextDouble(0, 5));
                array[i] = new Student.StudentBuilder().setGradeBookNum(random.nextInt(1, 1000)).setAverageGrade(Double.parseDouble(String.valueOf(bd.setScale(2, RoundingMode.HALF_EVEN)))).setGroup(Randomizer.groupRandomizer()).build();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
        if (ArrayCheckType.isUsersArray(array)) {

            for (int i = 0; i < array.length; i++) {
                array[i] = new User.UserBuilder().setName(Randomizer.nameRandomizer()).setMail(Randomizer.mailRandomizer()).setPassword(Randomizer.passwordRandomizer()).createUser();
            }
            System.out.println(Arrays.toString(array) + "\n");
        }
        return array;
    }

    public static Object[] manualFill(Object[] array) {
            if (ArrayCheckType.isBusArray(array)) {
                Manual.createBus((Bus[]) array);
            }
            if (ArrayCheckType.isUsersArray(array)) {
                Manual.createUser((User[]) array);
            }
            if (ArrayCheckType.isStudentsArray(array)) {
                Manual.createStudent((Student[]) array);
        }
        return array;
    }
}