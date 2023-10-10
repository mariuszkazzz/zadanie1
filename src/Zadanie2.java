import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  kmh;
        int h;
        System.out.println("podaj szybkosc pojazdu (km/h), nastepnie ilosc godzin");
        kmh = scanner.nextInt();
        h = scanner.nextInt();
        //int odleglosc = kmh * h;
        h = h -1;

        System.out.println("Godzina Przebyta odległość");
        System.out.println("___________________");
        for (int i = 0; i <= h; i++)
        {
            int odleglosc = kmh * (i+1);
            System.out.println(i+1 );
            System.out.println(odleglosc);
        }


    }
}