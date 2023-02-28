/*Sample Input:

50

20



Sample Output:

140m

1000sqm*/


import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println((n*2)+(m*2) +"m");
    System.out.println((n*m )+"sqm");
  }
}
