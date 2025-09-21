import java.util.*;
import math;

class VolCyl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float volume = (float)(Math.PI * Math.pow(radius, 2) * height);
        System.out.println("Volume of the cylinder: " + volume);
        sc.close();
    }
}