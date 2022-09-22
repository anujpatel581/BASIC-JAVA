package Operator;

public class LogicalOp { //&&, || , !
    public static void main(String[] args){
        int a = 10;
        int b  = 5;
        System.out.println(a>b && a<b);
        /*                true && false = false (And operator-if one cond false then result false
         if both true then res true)*/

         System.out.println(a>b || a<b);
         /*                 true || false = true( Or op -if one cond true then result true
         if both false then false)*/

         System.out.println(a>b != a<b);
    }
    
}
