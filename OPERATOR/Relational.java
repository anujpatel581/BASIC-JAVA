package Operator;

public class Relational { //<, <=, >, >=, ==, !=,
    public static void main(String[] args){
        int a=5;
        int b=10;

        System.out.println(a<b); //true
        System.out.println(a<=b); //true

        System.out.println(a>b); //false
        System.out.println(a>=b); //false
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
    }
    
}
