import java.util.*;

class SI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();
        System.out.print("Enter time: ");
        float t = sc.nextFloat();
        System.out.println((p*r*t) / 100);
        sc.close();
    }
}