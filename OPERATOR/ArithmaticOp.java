package Operator;
public class ArithmaticOp { //+, -, *, /, %
    public static void main(String[] args){
        int num1=5;
        int num2=12;

        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num2/num1;
        int mod=num1%num2;
        int mod1=num2%num1;

        System.out.println(sum);//17
        System.out.println(sub);//-7
        System.out.println(mul);//60
        System.out.println(div);//2 (integer does not deals with remainder)
        System.out.println(mod); // result=5 - because in mod if first operand is less than second operand then resul will that
        System.out.println(mod1); //result=2 - because in mod deals with remainder and 1st operand is greater 

    }
    
}
