import java.util.*;
import Math;

class areaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        float area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.printf("Area of circle: %.2f", area);
        sc.close();
    }
}