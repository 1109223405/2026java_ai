package lianxi.text.text1;

public class Student extends Person{
    private String grade;

    //空参构造

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    //get set

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //act
    public void study(){
        System.out.println("studying");
    }
}
