import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczby=0;
        int min =  0 ;
        int max = 0;
        while(liczby!= -99 )
        {
            System.out.println("Podaj liczbe: ");
            liczby = scanner.nextInt();
            if(liczby > max && liczby != -99 )
                max = liczby;

            if(liczby < min && liczby != -99 )
                min = liczby;
        }
        System.out.println("Najmniejsza- " +  min);
        System.out.println("Najweksza- " +  max);
    }
}