package client;

import binarysearch.DataBinarySearch;
import classes.Bus;
import classes.Student;
import classes.User;

import java.util.Scanner;

public class BinarySearchLoop<T> {

    public int search(T[] array) {
        Scanner console = new Scanner(System.in);
            if (array instanceof Bus[]) {
                System.out.println("Введите номер искомого автобуса");
                int num = Integer.parseInt(console.nextLine());
                System.out.println("Введите модель искомого автобуса");
                String model = console.nextLine();
                System.out.println("Введите пробег искомого автобуса");
                int mileage = Integer.parseInt(console.nextLine());
                Bus key = new Bus.BusBuilder().setNum(num).setModel(model).setMileage(mileage).build();
                return DataBinarySearch.binarySearch(array, key);
            }
            if (array instanceof Student[]) {
                System.out.println("Введите номер зачётной книжки искомого студента");
                int gradeBookNum = Integer.parseInt(console.nextLine());
                System.out.println("Введите группу искомого студента");
                String group = console.nextLine();
                System.out.println("Введите средний балл искомого студента");
                double averageGrade = Double.parseDouble(console.nextLine());
                Student key = new Student.StudentBuilder().setGradeBookNum(gradeBookNum).setGroup(group).setAverageGrade(averageGrade).build();
                return DataBinarySearch.binarySearch(array, key);
            }
            if (array instanceof User[]) {
                System.out.println("Введите имя искомого пользователя");
                String name = console.nextLine();
                System.out.println("Введите пароль искомого пользователя");
                String password = console.nextLine();
                System.out.println("Введите почту искомого пользователя");
                String mail = console.nextLine();
                User key = new User.UserBuilder().setName(name).setPassword(password).setMail(mail).createUser();
                return DataBinarySearch.binarySearch(array, key);
            }
        return -10;
    }
}
