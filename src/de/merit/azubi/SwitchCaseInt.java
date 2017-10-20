package de.merit.azubi;

public class SwitchCaseInt {

    public static void main(String[] args){
        int gewuerfelt;
        double zufallszahl;


        zufallszahl = (Math.random());



        gewuerfelt = (int) (zufallszahl * 6) + 1;

        System.out.println(gewuerfelt);

        switch(gewuerfelt){
            case 1:
                System.out.println("Muss selber trinken!");
                break;
            case 2:
                System.out.println("Such dir jemanden aus der trinken muss!");
                break;
            case 3:
                System.out.println("Richtungswechsel");
                break;
            case 4:
                System.out.println("Alle Frauen müssen trinken!");
                break;
            case 5:
                System.out.println("Alle Männer müssen trinken!");
                break;
            case 6:
                System.out.println("Alle müssen trinken!");
                break;

            default:
                System.out.println("Gewuerfelt liegt nicht zwischen eins und sechs");
        }
    }
}
