package ControlStatement;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1:");
        int n1 = sc.nextInt();
        System.out.println("enter num2: ");
        int n2 = sc.nextInt();

        System.out.println("enter op");
        char op= sc.next().charAt(0);

        switch(op){
            case '+':
            System.out.println(n1+n2);
            break;

            case '-':
            System.out.println(n1-n2);
            break;

        }
        sc.close();
    }
    
}
