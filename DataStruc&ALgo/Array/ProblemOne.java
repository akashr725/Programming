class ProblemOne {

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

    public static void FindPairs(int arr[], int k) {

        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] > k) {
                j -= 1;
            } else {
                i += 1;
            }
            if (arr[i] + arr[j] == k) {
                System.out.print("(" + arr[i] + ",");
                System.out.print(+arr[j] + ")");
            }
        }

    }

    public static void main(String[] args) {

        // Q1- Given ana array find a pairs (a,b) such that a+b=k, k will be given

        // approach 1, time complexcity(n2),space complexcity(n)

        /*
         * int arr[] = { 5, 3, 7, 12, 16, 20 };
         * int k = 19;
         * 
         * for (int i = 0; i < arr.length - 1; i++) {
         * for (int j = i + 1; j < arr.length - 1; j++) {
         * if (arr[i] + arr[j] == k) {
         * System.out.print("(" + arr[i] + ",");
         * System.out.print(+arr[j] + ")");
         * }
         * 
         * }
         * }
         */

        // Approch 2

        int arr[] = { 5, 3, 7, 12, 16, 20 };
        int k = 19;
        Sort(arr);
        FindPairs(arr, k);

    }
}