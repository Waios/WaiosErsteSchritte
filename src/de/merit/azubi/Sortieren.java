package de.merit.azubi;
import java.util.Arrays;
public class Sortieren {

    static void bubbleSort(int[] arr) {

        int zwischenspeicher;


        for (int durchlauf = 0; durchlauf < arr.length; durchlauf++) {
            for (int stelle = 1; stelle < (arr.length - durchlauf); stelle++) {
                if (arr[stelle] < arr[stelle - 1]) {


                    //Die Elemente tauschen
                    zwischenspeicher = arr[stelle - 1];
                    arr[stelle - 1] = arr[stelle];
                    arr[stelle] = zwischenspeicher;

                }
            }
        }
    }


    public static void main(String[] args) {


        //Stellen im Array:0   1   2   3   4  5  6
        int arr[] = {20, 6, 64, 18, 27, 2, 50};

        for (int stelle = 0; stelle < arr.length; stelle++) {
            System.out.println(arr[stelle] + " , ");

        }
        System.out.println();
        System.out.println();

        // Methodenaufruf: Der BubbleSort-Algorithmus wird angewendet.
        bubbleSort(arr);

        for (int stelle = 0; stelle < arr.length; stelle++) {
            System.out.println(arr[stelle] + " , ");
        }
    }
}