import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("even no");
        } else {
            System.out.println("odd no");
            sc.close();
        }
    }

}