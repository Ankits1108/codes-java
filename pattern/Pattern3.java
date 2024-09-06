package pattern;


public class Pattern3  {
  public static void printPattern(int n)
  {
      int i, j;
      for (i = 0; i < n; i++) {
          for (j = 0; j < n; j++) {
              if (i == j || j == 0 || j == 4) {
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