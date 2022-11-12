import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main mObj = new Main();
        /*mObj.element();
        mObj.even();
        mObj.largest();
        mObj.occur();
        mObj.odd();
        mObj.reverse();
        mObj.smallest();
        mObj.ascending();
        mObj.second_largest();
        mObj.duplicate();*/
        System.out.print("Enter question number to get its code:\n" +
                "1) Java Program to print the elements of an array\n" +
                "2) Java Program to print the elements of an array present on an even position\n" +
                "3) Java Program to print the largest element in an array\n" +
                "4) Java Program to find the frequency of each element in the array\n" +
                "5) Java Program to print the elements of an array present on odd position\n" +
                "6) Java Program to print the elements of an array in reverse order\n" +
                "7) Java Program to print the smallest element in an array\n" +
                "8) Java Program to sort the elements of an array in ascending order\n" +
                "9) Find 2nd Largest Number in an Array\n" +
                "10) Java Program to print the duplicate elements of an array\n" +
                "Enter your choice ::: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            mObj.element();
        } else if (choice == 2) {
            mObj.even();
        } else if (choice == 3) {
            mObj.largest();
        } else if (choice == 4) {
            mObj.occur();
        } else if (choice == 5) {
            mObj.odd();
        } else if (choice == 6) {
            mObj.reverse();
        } else if (choice == 7) {
            mObj.smallest();
        } else if (choice == 8) {
            mObj.ascending();
        } else if (choice == 9) {
            mObj.second_largest();
        } else if (choice == 10) {
            mObj.duplicate();
        } else {
            System.out.println("Invalid Input");
        }

    }

    //    Java Program to print the elements of an array
    public void element() {
        int[] arr = {1, 3, 5, 6, 3, 54, 63, 21, 65};
        System.out.println("Given array is {1, 3, 5, 6, 3, 54, 63, 21, 65} and ans is : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //    Java Program to print the elements of an array present on an even position
    public void even() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        System.out.println("Given array is {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95} and ans is :  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + " is even position of index");
            }
        }
    }

    //    Java Program to print the largest element in an array
    public void largest() {
        int[] arr = {101, 4, 23, 21, 11, 34, 76, 43, 22, 43, 76};
        System.out.println("Given array is {101, 4, 23, 21, 11, 34, 76, 43, 22, 43, 76} and ans is : ");
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
        System.out.println("Given array is {1, 2, 3, 4, 7, 3, 4, 6, 4, 6, 3, 35, 5, 5, 35, 322, 3, 5, 6, 6} and ans is : ");
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
        System.out.println("Given array is {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95} and ans: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(i + " is odd position of index");
            }
        }

    }

    //    Java Program to print the elements of an array in reverse order
    public void reverse() {
        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        System.out.println("Given array is {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95} and ans: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    //    Java Program to print the smallest element in an array
    public void smallest() {

        int[] arr = {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95};
        System.out.println("Given array is {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95} and ans: ");
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
        System.out.println("Given array is {101, 4, 1, 23, 21, 11, 34, 76, 43, 22, 43, 76, 95} and ans: ");
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
        System.out.println(" ");
    }

    //    Find 2nd Largest Number in an Array
    public void second_largest() {
        int temp, n;
        int array[] = {10, 20, 25, 63, 96, 57};
        n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Given array is {10, 20, 25, 63, 96, 57} and \n" +
                "second largest number is:: " + array[n - 2]);
    }

//    Java Program to print the duplicate elements of an array

    public void duplicate() {

        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3, 5, 8, 6, 4, 2};


        System.out.println("Given array is {1, 2, 3, 4, 2, 7, 8, 8, 3,5,8,6,4,2} & Duplicate elements are: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[j] + " ");
            }
        }
    }
}

