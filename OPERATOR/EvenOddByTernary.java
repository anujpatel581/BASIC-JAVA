import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String res = (n%2==0) ? "Even":"Odd";
      System.out.println(res);
 
      
    }
}
