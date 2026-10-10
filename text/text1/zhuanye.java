package lianxi.text.text1;

public class zhuanye extends Teacher{
    //空参构造

    public zhuanye() {
    }

    public zhuanye(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("zhuanye is teaching");
    }
}
