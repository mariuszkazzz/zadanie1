import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double suma;
        int a;
        int populacja;

        System.out.println("Podaj liczbę populacji: ");
        populacja = klawiatura.nextInt();
        klawiatura.nextLine();
        int przyrost;
        System.out.println("Średni przyrost populacji w procentach: ");
        przyrost = klawiatura.nextInt();
        klawiatura.nextLine();
        int dni;
        System.out.println("liczba dni : ");
        dni = klawiatura.nextInt();
        klawiatura.nextLine();
        for(int i = 0; i <dni; i++)
        {
            a=(przyrost*populacja/100)+populacja;
            System.out.println("Po "+ i +" dniu " + a + " ma osobników");
            populacja = a;
        }

    }
}