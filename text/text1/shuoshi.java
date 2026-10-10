package lianxi.text.text1;

public class shuoshi extends Student {
    //空参构造

    public shuoshi() {
    }

    public shuoshi(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("shuoshi is studying");
    }

    @Override
    public void sleep() {
        System.out.println("shuoshi is sleeping");
    }
}
