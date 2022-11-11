public class Main {
    public static void main(String[] args) {
        Main mObj = new Main();
        mObj.element();
        mObj.even();
        mObj.largest();
        mObj.occur();
        mObj.odd();
        mObj.reverse();
        mObj.smallest();
        mObj.ascending();

    }

    //    Java Program to print the elements of an array
    public void element() {
        int[] arr = {1, 3, 5, 6, 3, 54, 63, 21, 65};
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //    Java Program to print the elements of an array present on an even position
    public void even() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + " is even position of index");
            }
        }
    }

    //    Java Program to print the largest element in an array
    public void largest() {
        int[] arr = {101, 4, 23, 21, 11, 34, 76, 43, 22, 43, 76};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest + " is largest number of given array");
    }

    //    Java Program to find the frequency of each element in the array
    public void occur() {
        int[] arr = {1, 2, 3, 4, 7, 3, 4, 6, 4, 6, 3, 35, 5, 5, 35, 322, 3, 5, 6, 6};
        int n = arr.length;
        //countFreq(arr, n);
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " => " + count + " times");
        }

    }

    //    Java Program to print the elements of an array present on odd position
    public void odd() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(i + " is odd position of index");
            }
        }

    }

    //    Java Program to print the elements of an array in reverse order
    public void reverse() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    //    Java Program to print the smallest element in an array
    public void smallest() {

        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest + " is smallest number of given array");
    }

    //Java Program to sort the elements of an array in ascending order
    public void ascending() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}