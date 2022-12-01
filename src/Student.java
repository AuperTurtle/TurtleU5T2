public class Student {
    private String name;
    private int gradeLevel;
    private String school;

    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.school = "high school";
        }   else if
        (gradeLevel >= 6 && gradeLevel <= 8) {
            this.school = "middle school";
        }   else    {
            this.school = "elementary school";
        }
    }
    public String studentInfo() {
        String studentInfo = name + " is in grade " + gradeLevel + " and goes to " + school;
        return studentInfo;
    }
}

