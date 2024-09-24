import java.util.Objects;
import java.util.Scanner;
import esercizio1.stringaPariDispari;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio #1 ------------------------");
        boolean ris1 = stringaPariDispari("Luca");
        if (ris1) {
            System.out.println("Il numero di lettere è PARI");
        } else {
            System.out.println("Il numero di lettere è DISPARI");
        }

        System.out.println("Esercizio #1 bis ------------------------");
        boolean ris2 = annoBisestile(2024);
        if (ris2) {
            System.out.println("E' bisestile !!");
        } else {
            System.out.println("NON è bisestile");
        }

        System.out.println("Esercizio #2 ------------------------");
        System.out.println("Il numero da lei inserito è: " + switchers());

        System.out.println("Esercizio #3 ------------------------");
        separator();

        System.out.println("Esercizio #4 ------------------------");
        counter();
    }



    }


    static boolean annoBisestile(int y) {
        if (y > 2000 && y % 4 == 0) {
            return true;
        } else if (y % 100 == 0 && y % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static String switchers() {

        Scanner rufus = new Scanner(System.in);
        System.out.println("Inserisci un numero qui di seguito");
        int x = rufus.nextInt();

        switch(x) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return String.valueOf(x);
        }

    }

    static void separator() {
        while(true) {
            Scanner rufus = new Scanner(System.in);
            System.out.println("Inserisci qui una stringa");
            String txt = rufus.nextLine();

            String[] caratteri = txt.split(",");

            for(String a : caratteri)
                System.out.println(a);

            if(txt.equals(":q")) break;
        }
    }

    static void counter() {
        Scanner rufus = new Scanner(System.in);
        System.out.println("Inserisci il numero");
        int start = rufus.nextInt();

        for(int i = 0; i <= start; i++){
            System.out.println(start - i);
        }
    }


}