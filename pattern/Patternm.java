package pattern;


public class Patternm {
    public static void printPattern(int n)
    {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || i == j && i < 3 || j == 4 || i +j == 4 && i < 3) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  
    public static void main(String args[])
    {
        int n = 5;
        printPattern(n);
    }
  }