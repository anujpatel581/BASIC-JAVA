package ControlStatement;
import java.util.Scanner;

public class if_else { // ladder if_else
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int a =sc.nextInt();

        if(a==10){
            System.out.println("ten");

        }
        else if(a>10){
            System.out.println("abey 10 se jayada dala tu");
        }
        else{
            System.out.println("ye to 10 se kam ho gya be");
        }

        
    }
    
}
