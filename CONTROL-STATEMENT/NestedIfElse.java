package ControlStatement;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age:");
        int age = sc.nextInt();

        System.out.println("enter HEIGHT:");
        int h = sc.nextInt();

        if(age>=18){

            if(h>=6){
                System.out.println("you are eligible for ARMY");
            }
        }
        else{
            System.out.println("you are not mature");
        }
    }

    
}
