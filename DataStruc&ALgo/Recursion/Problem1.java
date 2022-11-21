import java.util.Scanner;

public class Problem1 {

    public static void NaturalNumber(int i, int n) {

        if (n < i) {
            return;
        }
        System.out.println((i));
        NaturalNumber(i + 1, n);
    }

    public static void NaturalNumber1(int n, int i) {

        if (n < i) {
            return;
        }
        System.out.println((n));
        NaturalNumber1(n - 1, i);
    }

    public static void NaturalNumber2(int i, int n) {

        if (n < i) {
            return;
        }
        NaturalNumber2(i, n - 1);
        System.out.println(n);
    }

    public static void NaturalNumber3(int i, int n) {

        if (n < i) {
            return;
        }
        NaturalNumber3(i + 1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        // ..............print 1 to n natural number using recursion............
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // NaturalNumber(1, n);

        // ...............print n to 1 natural number...........

        // int n1 = sc.nextInt();
        // NaturalNumber1(n1, 1);

        // ...................print 1 to n using backtracking...............

        // int n2 = sc.nextInt();
        // NaturalNumber2(1, n2);

        // ...................print n to 1 using backtracking...............

        int n3 = sc.nextInt();
        NaturalNumber3(1, n3);

    }
}