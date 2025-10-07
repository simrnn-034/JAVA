package DSOOPS_L52;

public class Ques5 {
    public static void main(String[] args) {
        Student s1 = new Student("Simran", "A");
        School school = new School();
        school.printStudentInfo(s1);
    }
}

class Student {
    private String name;
    private String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

class School {
    public void printStudentInfo(Student s) {
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Grade: " + s.getGrade());
    }
}
