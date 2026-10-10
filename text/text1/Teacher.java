package lianxi.text.text1;

public class Teacher extends Person{
    private String subject;

    //空参构造

    public Teacher() {

    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //get set

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //act
    public void teach(){
        System.out.println("teaching");
    }
}
