import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int x;
        System.out.println("podaj liczbe lat: ");
        x = scanner.nextInt();
        scanner.nextLine();
        int suma = 0;
        int suma_opadow;
        int srednia;
        for(int i = 0; i <x; i++)
        {
            System.out.println("rok_" + (i+1));
            System.out.println("+++++++++++" );
            for(int j = 0; j <=11; j++)
            {
                System.out.println("podaj opady dla miesiaca  "+ (j+1));
                int w = scanner.nextInt();
               suma = w + suma;
            }
            System.out.println("srednia opadow dla roku: "+ (suma/(x*12)));
        }
        System.out.println("ilosc miesecy" + (x*12));
        System.out.println("suma opadow: "+ suma);
        System.out.println("srednia opadow: "+ (suma/(x*12)));


    }
}