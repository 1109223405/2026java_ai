package lianxi.text.text1;

public class tongshi extends Teacher{
    //空参构造

    public tongshi() {
    }

    public tongshi(String name, int age, String subject) {

        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("tongshi is teaching");
    }
}
