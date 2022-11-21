import java.util.Scanner;

public class Problem2 {

    public static void FindSum(int i, int n) {

        if (1 > n) {
            System.out.println(i);
            return;
        }
        FindSum(i + n, n - 1);

    }

    public static int FindSum1(int n) {

        if (1 > n) {
            return 0;
        }
        return n + FindSum1(n - 1);

    }

    public static void FindFact(int i, int n) {

        if (1 > n) {

            System.out.println(i);
            return;
        }
        FindFact(i * n, n - 1);

    }

    public static int FindFact1(int n) {

        if (1 > n) {
            return 1;
        }
        return n * FindFact1(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ........ print sum of n natural number..........

        // FindSum(0, n);

        // .........print sum of n natural number using backtracking..........

        // int a = FindSum1(n);
        // System.out.println(a);

        // .............find factorial of n............

        // FindFact(1, n);

        // .............find factorial of n using backtracking............

        int a1 = FindFact1(n);
        System.out.println(a1);
    }
}
