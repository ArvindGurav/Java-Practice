package java8;

public class LambdaExpression {

    public static void main(String[] args) {
        new LambdaExpression().test1(String::toUpperCase);
    }

    public void test1(Foo foo) {
        System.out.println(foo.method("asd"));
    }
}


