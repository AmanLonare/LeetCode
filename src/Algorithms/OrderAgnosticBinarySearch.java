package Algorithms;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int[] ascArray = {1, 3, 4, 5, 6, 7, 12, 18, 19, 20, 25, 29, 33, 39, 45, 49, 58, 64, 78, 81, 85, 89, 95, 99};
        int[] descArray = {99, 95, 86, 75, 66, 54, 45, 34, 23, 11, 9, 6, 4, 2, 1};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value to be searched: ");
        int num = inp.nextInt();
        int pos = orderAgnosticBS(num, descArray);
        System.out.println("Found in: "+pos);
    }

    static int orderAgnosticBS(int num, int[] arr) {



        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == num){
                return mid;
            }
            if(isAsc){
                if (arr[mid] > num) {
                    end = mid - 1;
                } else if (arr[mid] < num) {
                    start = mid + 1;
                }
            }
            else{
                if (arr[mid] < num) {
                    end = mid - 1;
                } else if (arr[mid] > num) {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
