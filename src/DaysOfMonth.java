import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int måned = sc.nextInt();
        int årstal = -1;
        System.out.println("Skriv måned fra 1 til 12");

        switch (måned) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("har 31 dage");
                break;
            case 4, 6, 9, 11:
                System.out.println("har 30 dage");
                break;
            case 2:
                System.out.println("indtast årstal");
                årstal = sc.nextInt();
                System.out.println((årstal%4 == 0 ? " der er 29 dage" : " der er 28 dage"));

        }
    }
}