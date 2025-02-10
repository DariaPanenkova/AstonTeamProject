package arrays;

public class ArrayCheck {
    public static boolean isBusArray(Object[] array) {
        return CreateArray.buses != null && array.getClass().getSimpleName().equals(CreateArray.buses.getClass().getSimpleName());
    }

    public static boolean isUsersArray(Object[] array) {
        return CreateArray.users != null && array.getClass().getSimpleName().equals(CreateArray.users.getClass().getSimpleName());
    }

    public static boolean isStudentsArray(Object[] array) {
        return CreateArray.students != null && array.getClass().getSimpleName().equals(CreateArray.students.getClass().getSimpleName());
    }
}
