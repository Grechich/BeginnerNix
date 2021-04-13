package Beginner;

public class Calc {

    public static void main (String[] args){

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                sum (a, b);
                break;
            case "-":
                minusAB (a, b);
                break;
            case "/":
                devAB (a, b);
                break;
            case "*":
                mult (a, b);
                break;
            case "x":
                minusAB (a, b);
                break;
            case ":":
                devAB (a, b);
                break;
            default:
                System.out.println("Wrong enter");
                break;
        }



    }

    private static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b) + "\n");
    }

    private static void minusAB(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b) + "\n");
    }

    private static void minusBA(int a, int b) {
        minusAB(b, a);
    }

    private static void devAB(int a, int b) {
        float c = (float)a/(float)b;
        System.out.println(a + "/" + b + " = " + c + "\n");
    }

    private static void devBA(int a, int b) {
        devAB(b, a);
    }

    private static void mult(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b) + "\n");
    }


}
