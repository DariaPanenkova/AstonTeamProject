package sortdir.comparators;

import classes.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGradeBookNum() - o2.getGradeBookNum() != 0)
            return o1.getGradeBookNum() - o2.getGradeBookNum();
        else if (o1.getGroup() != null && o2.getGroup() != null)
            if ((o1.getGroup().compareTo(o2.getGroup()) != 0))
                return o1.getGroup().compareTo(o2.getGroup());
            else return (int) (o1.getAverageGrade() - o2.getAverageGrade());
        else return (int) (o1.getAverageGrade() - o2.getAverageGrade());
    }
}
