import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc pieter");
        int iloscpieter;
        int iloscpokoiwszystkich = 0;
        int iloscpokoizajetch = 0;
        iloscpieter = scanner.nextInt();
        iloscpieter = iloscpieter-1;

        if (iloscpieter >= 10 || iloscpieter <=1)
        {
            System.out.println("erreur");
            System.exit(0);
        }

        int zajete = 0;
        int puste = 0;
        double oblezeniebizancjum = 0;

        for (int i = 0; i <= iloscpieter; i++)
        {
            System.out.println("pietro_" +(i+1) + "_");
            System.out.println("podaj ilosc wszystkich pokoi");
            iloscpokoiwszystkich = scanner.nextInt();
            System.out.println("podaj ilosc zajetych pokoi");
            iloscpokoizajetch = scanner.nextInt();
            zajete = zajete + iloscpokoizajetch;
            puste = puste + (iloscpokoiwszystkich-iloscpokoizajetch);

            oblezeniebizancjum = (double)zajete/puste;
        }
        System.out.println("wolne"+ puste);
        System.out.println("zajete" + zajete);
        System.out.println("wszystkie" +(puste+zajete));
        System.out.println("oblezenie" + oblezeniebizancjum);

    }
}