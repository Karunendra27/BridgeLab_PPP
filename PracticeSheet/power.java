import java.util.*;
import math;

class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number:");
        int base = sc.nextInt();
        System.out.print("Enter the exponent number:");
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        sc.close();
    }
}