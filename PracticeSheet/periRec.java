import java.util.*;

class RecPeri{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();
        
        int perimeter = calculatePerimeter(length, breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        sc.close();
    }

    static int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
}