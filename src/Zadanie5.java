import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wyraz");
        String wyraz;
        wyraz = scanner.nextLine();
        System.out.println("podaj znak");
        String znajdz;
        znajdz = scanner.nextLine();
        char x;
        int ilosc = 0;

        char inicjal;
        char pierwsza = wyraz.charAt(0);
        for (int j = 1; j <= wyraz.length(); j++)
        {
            inicjal = wyraz.charAt(j);
            if(inicjal==pierwsza)
            {
                ilosc =+ 1;
            }
        }

        System.out.println(znajdz + " wystepuje: ");
        System.out.println(ilosc);




    }
}