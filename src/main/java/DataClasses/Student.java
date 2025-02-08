package DataClasses;

import java.util.Objects;

public class Student {
    private int gradeBookNum;
    private String group;
    private double averageGrade;

    public Student(StudentBuilder studentBuilder) {
        this.gradeBookNum = studentBuilder.gradeBookNum;
        this.group = studentBuilder.group;
        this.averageGrade = studentBuilder.averageGrade;
    }

    public int getGradeBookNum() {
        return gradeBookNum;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(!(obj instanceof Bus)) {
            return false;
        }
        Student student = (Student) obj;
        return  gradeBookNum == student.gradeBookNum
                &&  Objects.equals(group, student.group)
                &&  averageGrade == student.averageGrade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeBookNum, group, averageGrade);
    }

    @Override
    public String toString() {
        return "Номер зачетной книжки: " + gradeBookNum + "Номер группы: " + group + " Средний балл: "  + averageGrade;
    }

    public static class StudentBuilder {
        private int    gradeBookNum;
        private String group;
        private double averageGrade;

        public StudentBuilder setGradeBookNum(int gradeBookNum) {
            this.gradeBookNum = gradeBookNum;
            return this;
        }

        public StudentBuilder setGroup(String group) {
            this.group = group;
            return this;
        }

        public StudentBuilder setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
