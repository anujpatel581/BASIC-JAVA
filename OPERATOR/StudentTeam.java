import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your code
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int t = sc.nextInt();
  int team = n/t;
  int rem = n%t;
  System.out.println("The number of students in each team is "+ team + " and left out is "+ rem);
}
}
