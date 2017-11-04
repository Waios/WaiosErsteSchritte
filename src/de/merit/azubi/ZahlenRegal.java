package de.merit.azubi;

public class ZahlenRegal {
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

    static void printarray(int[] einArray) {
        for (int y = 0; y < einArray.length; y++) {

            System.out.println(einArray[y]);
        }

    }

    public static void main(String[] args) {

        int[] regal = {5, 1, 3, 2, 27, 43, 22};

        System.out.println(regal[5]);
        System.out.println();
        bubblesort(regal);
        
        printarray(regal);

        int[] wandregal = {12, 23, 75, 34, 31, 2, 16, 87, 65, 24, 4};

        System.out.println(wandregal[4]);
        System.out.println("!!!!!");

        printarray(wandregal);


        bubblesort(wandregal);

        printarray(wandregal);
    }
}






