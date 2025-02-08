package main.java.DataClases;

public class Student {
    private Integer gradeBookNum;
    private String group;
    private Double averageGrade;

    public Student(StudentBuilder studentBuilder) {
        this.gradeBookNum = studentBuilder.gradeBookNum;
        this.group = studentBuilder.group;
        this.averageGrade = studentBuilder.averageGrade;
    }

    public int getGradeBookNum() {
        return gradeBookNum;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public String getGroup() {
        return group;
    }

    public static class StudentBuilder {
        private Integer    gradeBookNum;
        private String group;
        private Double averageGrade;

        public StudentBuilder setGradeBookNum(Integer gradeBookNum) {
            this.gradeBookNum = gradeBookNum;
            return this;
        }

        public StudentBuilder setGroup(String group) {
            this.group = group;
            return this;
        }

        public StudentBuilder setAverageGrade(Double averageGrade) {
            this.averageGrade = averageGrade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
