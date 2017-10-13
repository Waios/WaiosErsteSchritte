package de.merit.azubi;

public class Bubble {

    static void bubblesort(int[] arr) {

        int a = 0;

        for (int b = 0; b < arr.length; b++)
            for (int s = 1; s < (arr.length - b); s++) {

                if (arr[s] < arr[s - 1]) {


                    a = arr[s - 1];
                    arr[s - 1] = arr[s];
                    arr[s] = a;
                }
            }

    }

    public static void main(String[] args) {

        int arr[] = {33, 12, 54, 38, 77, 2, 10, 43, 8, 19, 47, 32, 99, 1, 7};

        for (int s = 0; s < arr.length; s++) {
            System.out.print(arr[s] + " , ");

        }
        System.out.println("\n");
        bubblesort(arr);

        for (int s = 0; s < arr.length; s++) {
            System.out.print(arr[s] + " , ");


        }


    }
}
