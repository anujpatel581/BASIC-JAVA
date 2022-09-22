public class Widening{
    public static void main(String[] args){
        int mynum = 3; // widening automatically typecasting large data type to small data type size
        float myfloat = (float) mynum;

        System.out.println(mynum);
        System.out.println(myfloat);
    }
}
