package lianxi.text.text1;

public class Test {
    static void main() {
        benke bs = new benke("张三", 18, "大一");
        System.out.println(bs.getName() + " " + bs.getAge() + " " + bs.getGrade());
        bs.study();
        bs.eat();
        bs.sleep();
    }
}
