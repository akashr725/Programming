public class ProblemTwo {
    /*
     * public static boolean findNumber(int arr[], int n) {
     * 
     * for (int a : arr) {
     * if (a == n) {
     * return true;
     * }
     * }
     * return false;
     * 
     * }
     */

    public static void Sort(int arr[]) {

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void findSequence(int arr[]) {
        int s = 1, c = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                s++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                s = 1;
            }
            if (s > c) {
                c = s;
            }

        }
        System.out.println(c);

    }

    public static void main(String[] args) {

        // Q- given an array and find the maximum consequtive sequence number length

        // approch 1
        /*
         * int arr[] = { 3, 5, 9, 7, 10, 6, 11, 4 };
         * 
         * int ans = 0;
         * for (int i = 0; i < arr.length; i++) {
         * int s = arr[i];
         * int c = 0;
         * while (findNumber(arr, s)) {
         * 
         * s++;
         * c += 1;
         * 
         * }
         * if (c > ans) {
         * ans = c;
         * }
         * }
         * System.out.println(ans);
         */

        // approch 2

        int arr[] = { 3, 13, 5, 9, 10, 6, 11, 4, 8, 12, };

        Sort(arr);
        findSequence(arr);

    }
}
