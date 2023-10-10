import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int  x;
    int n = 0;

        System.out.println("podaj l cal < 0");
        x = scanner.nextInt();
    for (int j = 1; j <= x; j++)
    {
        n +=j;
    }
    System.out.println("suma:" + n);
}
}