package main.java.DataClasses;

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
