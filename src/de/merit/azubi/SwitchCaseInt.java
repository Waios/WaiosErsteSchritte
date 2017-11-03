package de.merit.azubi;

public class SwitchCaseInt {

    public static void main(String[] args){


        double zufallszahl_1 = (Math.random());
        int zahl_1 = (int) (zufallszahl_1 * 6) + 1;
        double zufallszahl_2 = (Math.random());
        int zahl_2 = (int) (zufallszahl_2 * 6) + 1;

        int zahl = zahl_1 + zahl_2;


        switch(zahl){
            case 2:
                System.out.println("Muss selber trinken!");
                break;
            case 3:
                System.out.println("Such dir jemanden aus der trinken muss!");
                break;
            case 4:
                System.out.println("Richtungswechsel");
                break;
            case 5:
                System.out.println("Alle Frauen müssen trinken!");
                break;
            case 6:
                System.out.println("Alle Männer müssen trinken!");
                break;
            case 7:
                System.out.println("Alle müssen trinken!");
                break;
            case 8:
                System.out.println("Alle müssen trinken!");
                break;
            case 9:
                System.out.println("Alle müssen trinken!");
                break;
            case 10:
                System.out.println("Alle müssen trinken!");
                break;
            case 11:
                System.out.println("Alle müssen trinken!");
                break;
            case 12:
                System.out.println("Alle müssen trinken!");
                break;

            default:
                System.out.println("Gewuerfelt liegt nicht zwischen eins und sechs");
        }
    }
}
