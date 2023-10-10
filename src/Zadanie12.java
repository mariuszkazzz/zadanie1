import java.util.Scanner;

public class Zadanie12 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wartosc sprzedazy w sklepie 1");
        int s1 = scanner.nextInt();
        System.out.println("podaj wartosc sprzedazy w sklepie 2");
        int s2 = scanner.nextInt();
        System.out.println("podaj wartosc sprzedazy w sklepie 3");
        int s3 = scanner.nextInt();
        System.out.println("podaj wartosc sprzedazy w sklepie 4");
        int s4 = scanner.nextInt();
        System.out.println("podaj wartosc sprzedazy w sklepie 5");
        int s5 = scanner.nextInt();

        for (int i = 0; i <=4; i++)
        {
            System.out.println("wartosc sprzedazy_");
            s1 = s1/100;
            System.out.println("sklep1_ " + (s1*'*'));
        }

    }
}
