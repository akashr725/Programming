import java.util.Scanner;

public class Problem3 {

    public static int[] ReverseArray(int i, int arr[], int l) {
        if (i < l) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            ReverseArray(i + 1, arr, l - 1);
        }
        return arr;
    }

    public static boolean checkPlindrome(int i, String s) {
        int l = s.length();
        if (i >= l / 2)
            return true;
        if (s.charAt(i) != s.charAt(l - i - 1)) {
            return false;
        }
        return checkPlindrome(i + 1, s);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ...............reverse array using recursion...........

        // int arr[] = { 2, 5, 7, 1, 4, 9 };

        // int arr1[] = ReverseArray(0, arr, arr.length - 1);
        // for (int a : arr1) {
        // System.out.println(a);
        // }

        // ................check given string is pallindrome or not using
        // recursion...........

        String s = "madam";

        System.out.println((checkPlindrome(0, s)));

    }
}
