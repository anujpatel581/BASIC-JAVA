/*Profit or loss
A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y. Write a program to determine the profit or loss in Rs. for the fruitseller.
Input format:

Input consists of 2 floating point numbers

The first input corresponds to the total cost(X)

The second input corresponds to the sold cost(Y)



Output format:

Print "Profit or Loss" with Rupees.



Sample Input:

60

4



Sample Output:

Loss : Rs.12.00

Case 1
Case 2
Input (stdin)
60.0
5

Output (stdout)
No profit nor loss*/


import java.util.Scanner;
class BananaDozenProLos
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      float n = sc.nextFloat();
      float m = sc.nextFloat();
      if(n==m*12){
      System.out.println("No profit nor loss");
      }
      else if(n>m*12){
      System.out.printf("Loss : Rs.%.2f" ,(n-m*12)).println();
      }
      else {
      System.out.printf("Profit : Rs.%.2f" ,(m*12-n)).println();
      }
    }
}
