import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Zadanie6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File mojPlik = new File ("text6.txt");
        scanner.nextLine();
        Scanner fileScanner = new Scanner (mojPlik);
        String linia;
        String litera;

        linia = fileScanner.nextLine();

        int x=0;

        System.out.println("podaj znak: ");
        litera = scanner.nextLine();
        int dlugosc = linia.length();

        char inicjal;
        char litera1 = litera.charAt(0);
        for(int i = 0; i < dlugosc; i++)
        {
            inicjal = linia.charAt(i);
            if(inicjal==litera1)
            {
                x++;
            }

        }
        System.out.println(litera+" wystepuje " + x + " razy");

        fileScanner.close();
    }
}