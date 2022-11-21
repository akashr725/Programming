import java.util.Scanner;

public class Problem4 {

    public static void printFibonacchi(int n, int a, int b) {
        if (n == 2) {
            return;
        }
        int t = a + b;
        a = b;
        b = t;
        System.out.print(t + " ");
        printFibonacchi(n - 1, a, b);

    }

    public static int findFibonacchi(int a) {
        if (a <= 1) {
            return a;
        }
        int last = findFibonacchi(a - 1);
        int fast = findFibonacchi(a - 2);
        return last + fast;
    }

    public static void main(String[] args) {
        // ...write a program to print fibonacchi series using recursion.....

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        printFibonacchi(n, a, b);
        System.out.println();

        // ....... write program to print nth position fib number using recursion.......

        int n1 = sc.nextInt();

        int x = findFibonacchi(n1);
        System.out.println(x);
    }
}
