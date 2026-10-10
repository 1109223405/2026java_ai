package lianxi.text.text1;

public class benke extends Student{
    //空参构造

    public benke() {

    }

    public benke(String name, int age, String grade) {
        super(name, age, grade);
    }

    //get set

    //重写
    @Override
    public void study() {
        System.out.println("benke is studying");
    }
}
