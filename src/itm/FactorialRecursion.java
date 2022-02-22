package itm;

public class FactorialRecursion {
    private static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(8)); // 40320 = 1*2*3*4*5*6*7*8
    }
}
