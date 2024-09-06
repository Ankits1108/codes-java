import java.util.Scanner;

public class Aoc {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close();
    }
}