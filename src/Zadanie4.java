import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int  x = 1;
        int n;
        int zadzien = 1;
        int wynagrodzenie = 0;



        System.out.println("podaj ile dni pracuje");
        n = scanner.nextInt();
        //n = n-1;
        if(n <= 1)
        {
            System.out.println("wartosc nie powinna byc mniejsza lub rowna 1");
        }

        for (int i = 1; i <= n; i++)
        {

            wynagrodzenie += zadzien;
            zadzien *= 2;

            if(wynagrodzenie <= 100) {
                System.out.println(wynagrodzenie + "groszy");
            }
            else {
                wynagrodzenie = wynagrodzenie/100;
                System.out.println(wynagrodzenie + "zloty");
            }

        }



    }
}
