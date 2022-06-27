package recussion;

public class Fibonacci {

    public static void main(String[] args) {
        //fibonacci(0, 1, 5);
        System.out.println(findfibo(4));
    }

    static void fibonacci(int n, int next, int count) {
        if(count < 1) {
            return;
        }
        System.out.println(n);
        fibonacci(next, n+next, --count);
    }

    static int findfibo(int n) {
        if(n <=1) {
            return n;
        }
        return  findfibo(n-1) + findfibo(n-2);
    }
}
