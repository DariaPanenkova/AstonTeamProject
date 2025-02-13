package arrays;

import java.util.regex.Pattern;

public class FormatChecker {
    public static boolean checkBus(int num, int mileage) {
        return num > 0 && mileage >= 0;
    }

    public static boolean checkStudent(int gradeBookNum, double averageGrade) {
        return gradeBookNum > 0 && averageGrade > 0;
    }

    public static boolean checkUser(String name) {
        Pattern namepattern = Pattern.compile("[0-9!@#$%^&*()_+|}{',./:]");
        return namepattern.matcher(name).find();
    }
}
