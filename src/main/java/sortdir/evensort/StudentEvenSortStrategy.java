package sortdir.evensort;

import classes.Student;

import java.util.Comparator;

public class StudentEvenSortStrategy implements EvenSortStrategy<Student> {
    @Override
    public Comparator<Student> getComparator() {
        return Comparator.comparingInt(Student::getGradeBookNum);
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof Student) {
            return ((Student) obj).getGradeBookNum();
        } else {
            throw new IllegalArgumentException("Объект не является Student");
        }
    }
}
