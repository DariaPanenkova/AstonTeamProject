package sortdir.evensort;

import classes.Student;

import java.util.Comparator;

public class StudentEvenSortStrategy implements EvenSortStrategy{
    @Override
    public Comparator getComparator() {
        Comparator<Student> comparator = Comparator.comparingInt(Student::getGradeBookNum);
        return comparator;
    }

    @Override
    public int getNumberField(Object obj) {
        if (obj instanceof Student) {
            return ((Student) obj).getGradeBookNum();
        }
        else {
            throw new IllegalArgumentException("Объект не является Student");
        }
    }
}
