/*Anna University Grading System
The newly appointed Vice-Chancellor of Anna University wanted to create an automated grading system for the students to check their grade. When a student enters a mark, the grading system displays the corresponding grade. Write a program to solve the given problem. The grades for marks 100 - S, 90-99 is A, 80-89 is B, 70-79 is C, 60-69 is D, 50-59 is E and less than 50 is F.
Input format:

The input consists of one integer which corresponds to the marks scored by the student



Output format:

If a student marks greater than 100, print "Invalid Input". Otherwise, print the grade.



Sample Input:

78



Sample Output:

C

Case 1
Case 2
Case 3
Input (stdin)
100

Output (stdout)
S*/



import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n==100){System.out.println("S");}
      else if(n>=90 && n<=99){
      System.out.println("A");}
      else if(n>=80 && n<=89){
      System.out.println("B");}
      else if(n>=70 && n<=79){
      System.out.println("c");}
      else if(n>=60 && n<=69){
      System.out.println("D");}
      else if(n>=50 && n<=59){
      System.out.println("E");}
      else if(n<50){System.out.println("F");}
      else{System.out.println("Invalid Input");}
    }
}
