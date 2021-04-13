package Beginner;

public class MultTable {

    public static void main (String[] args){
        for (int b = 1; b < 11; b++){
            for (int a = 1; a < 11; a++) {
              String c;
               if (a * b >= 10){
                   if (b >= 10 || a >= 10){
                       if (a * b >= 100){
                           c = "  ";
                       }
                       else {
                           c = "   ";
                       }
                   }
                    else{
                        c = "    ";
                   }
               }
               else{
                    c = "     ";
               }
               if (a >= 10 & b >= 10){
                   c = " ";
               }
                System.out.print(a + "*" + b + "="+ a*b + c);
            }
            System.out.println("");
        }
    }
}
