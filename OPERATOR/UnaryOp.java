package Operator;

public class UnaryOp {  // +, -, ++, --
    public static void main(String[] args){
        int a=10;
        a+=1;
        a-=1;
        int postInc=a++;
        int preInc=++a;

        int postDec=a--;
        int preDec=--a;

        System.out.println(a);
        System.out.println(postInc);
        System.out.println(preInc);
        System.out.println(postDec);
        System.out.println(preDec);

        System.out.println(postInc + preInc);
        System.out.println(postDec + preDec);

    }
    
}
