package Viacheslav;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        System.out.print("Input first integer number: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Input second integer number: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();
        System.out.println("Sum = " + add(a, b));
        System.out.println("Difference = " + sub(a, b));
        System.out.println("Product = " + mult(a, b));
        System.out.println("Quotient = " + div(a, b));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int  sub(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int  div(int a, int b) {
        return a / b;
    }
}
