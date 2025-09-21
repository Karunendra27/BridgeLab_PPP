import java.util.*;

class CelToFahr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temp = sc.nextInt();
        float ans = (temp * 9/5) + 32;
        System.out.printf("%.2f degree Fahrenheit", ans);
        sc.close();
    }
}