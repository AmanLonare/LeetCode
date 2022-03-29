package Algorithms;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,3,4,5,6,7,12,18,19,20,25,29,33,39,45,49,58,64,78,81,85,89,95,99};
        System.out.printf("Enter the number to be search: ");
        int num = sc.nextInt();
        int pos = binarySearch(num, array);
        if(pos == -1){
            System.out.println("Not found mate");
        }
        else {
            System.out.println("Found in : "+pos+" position");
        }

    }
    static int binarySearch(int num, int[] arr){
        int start = 0;
        int end = arr.length - 1;


        while(start<=end){

            int mid = start + (end - start)/2;

            if(arr[mid]>num) {
                end = mid - 1;
            }
            else if(arr[mid] < num){
                start = mid + 1;
            }

            else {
                return mid;
            }

        }
        return -1;
    }
}
