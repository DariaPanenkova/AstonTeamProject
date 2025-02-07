package org.astondreamteam.classes;

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
        private int gradeBookNum;
        private String group;
        private double averageGrade;

        StudentBuilder(int gradeBookNum) {
            this.gradeBookNum = gradeBookNum;
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

//    public static void main(String[] args) {
//        Student student = new StudentBuilder(558)
//                .setAverageGrade(4.8).build();
//    }
}
