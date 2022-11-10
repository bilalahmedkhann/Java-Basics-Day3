public class Main {
    public static void main(String[] args) {
        Main mObj = new Main();
        mObj.element();
        mObj.even();
        mObj.largest();

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
        int arr[] = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + " is even position of index");
            }
        }
    }

    //    Java Program to print the largest element in an array
    public void largest() {
        int large = 0;
        int arr[] = {101, 4, 23, 21, 11, 34, 76, 43, 22, 43, 76};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(largest + " is largest number of given array");
    }


}