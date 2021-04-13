package Beginner;

public class Fibo {
    public static void main (String[] args){


        int arg=10000;

        int a = 0;
        int b = 1;
        while (a+b<=arg){
            System.out.println(a);
           b=a+b;
           a=b-a;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
