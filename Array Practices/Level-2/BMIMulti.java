import java.util.Scanner;

public class BMIMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight(kg) for person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            System.out.println("Enter height(m) for person " + (i + 1) + ": ");
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid, try again!");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + personData[i][1] + " m, Weight: " +
                    personData[i][0] + " kg, BMI: " + personData[i][2] +
                    ", Status: " + weightStatus[i]);
        }
    }
}
