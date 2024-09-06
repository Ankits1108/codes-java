import java.util.Scanner;
public class Inprod {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println(prod);
        sc.close();
    }
}
