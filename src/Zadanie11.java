import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj ilosc pomairow");
        int ilosc = scanner.nextInt();

//        System.out.println("podaj temperature w C");
//        int C = scanner.nextInt();
        double sumka;



        for (int i = 0; i <=ilosc; i++){
            System.out.println("podaj temperature w C");
            int C = scanner.nextInt();
            if (C >= 20 || C <=1)
            {
                System.out.println("erreur");
                System.exit(0);
            }
            System.out.println("___temperatura"+(i+1)+"___");
            sumka = (double) C * 9.5;
            sumka = sumka + 32;
            System.out.println("|"+sumka+"|");
        }


    }
}
