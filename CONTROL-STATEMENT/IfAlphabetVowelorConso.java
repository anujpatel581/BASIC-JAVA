/*Checking alphabets
Write a program to check whether the given character is vowel or consonant
Input format:

The input consist of a character



Output format:

The output consists of a below-given string 

“Vowel” / “Consonant” / “Not an alphabet”



Sample Input:

e



Sample Output:

Vowel

Case 1
Case 2
Input (stdin)
$

Output (stdout)
Not an alphabet*/


import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(Character.isAlphabetic(ch)){
              if(ch=='a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'){
              System.out.println("Vowel");
              }
              else{
               System.out.println("Consonant");
              }
      }
       else{
       System.out.println("Not an alphabet");
       }
    }
}
