import java.util.ArrayList;

public class Problem5 {

    public static void printSubsequence(int ind, ArrayList<Integer> al, int arr[], int l) {
        if (ind == l) {
            for (int a : al) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        // take or pick the particular index into the subsequence
        al.add(arr[ind]);
        printSubsequence(ind + 1, al, arr, l);
        // not take or pick the condition, element will not added to in subsequence
        al.remove(al.size() - 1);
        printSubsequence(ind + 1, al, arr, l);

    }

    public static void findSum(int ind, ArrayList<Integer> al, int arr[], int s, int sum) {
        if (ind == arr.length) {
            if (s == sum) {
                for (int a : al) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }

            return;
        }
        // take or pick the particular index into the subsequence
        al.add(arr[ind]);
        s += arr[ind];
        findSum(ind + 1, al, arr, s, sum);
        // not take or pick the condition, element will not added to in subsequence
        s -= arr[ind];
        al.remove(al.size() - 1);
        findSum(ind + 1, al, arr, s, sum);

    }

    public static boolean findSum1(int ind, ArrayList<Integer> al, int arr[], int s, int sum) {
        if (ind == arr.length) {
            if (s == sum) {
                for (int a : al) {
                    System.out.print(a + " ");
                }
                return true;

            }

            return false;
        }
        // take or pick the particular index into the subsequence
        al.add(arr[ind]);
        s += arr[ind];
        if (findSum1(ind + 1, al, arr, s, sum) == true) {
            return true;
        }
        // not take or pick the condition, element will not added to in subsequence
        s -= arr[ind];
        al.remove(al.size() - 1);
        if (findSum1(ind + 1, al, arr, s, sum) == true) {
            return true;
        }
        return false;

    }

    public static int findSum2(int ind, int arr[], int s, int sum) {
        if (ind == arr.length) {
            if (s == sum) {

                return 1;

            }

            return 0;
        }
        // take or pick the particular index into the subsequence
        s += arr[ind];
        int l = findSum2(ind + 1, arr, s, sum);

        // not take or pick the condition, element will not added to in subsequence
        s -= arr[ind];
        int r = findSum2(ind + 1, arr, s, sum);
        return l + r;

    }

    public static void main(String[] args) {

        // ..........print all subsequence of given array...........

        // ArrayList<Integer> al = new ArrayList<Integer>();

        // int arr[] = { 4, 2, 7, 1 };
        // int n = 4;
        // printSubsequence(0, al, arr, n);

        // ..........print all subsequence of k sum given array...........

        // ArrayList<Integer> al1 = new ArrayList<Integer>();

        // int arr1[] = { 4, 6, 2 };
        // int sum = 6;
        // findSum(0, al1, arr1, 0, sum);

        // // ..........print one subsequence of k sum given array...........

        // ArrayList<Integer> al2 = new ArrayList<Integer>();

        // int arr2[] = { 4, 6, 2 };
        // int sum1 = 6;
        // findSum1(0, al2, arr2, 0, sum1);

        // // ..........print count of subsequence of k sum given array...........

        int arr3[] = { 4, 6, 2, 4 };
        int sum2 = 6;
        int x = findSum2(0, arr3, 0, sum2);
        System.out.println(x);

    }

}
