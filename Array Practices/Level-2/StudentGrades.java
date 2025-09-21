import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Physics, Chemistry, Maths marks of student " + (i + 1) + ": ");
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();

            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                System.out.println("Invalid input, re-enter!");
                i--;
                continue;
            }

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = 'A';
            else if (percent[i] >= 75)
                grade[i] = 'B';
            else if (percent[i] >= 60)
                grade[i] = 'C';
            else if (percent[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " => Physics: " + phy[i] +
                    ", Chemistry: " + chem[i] + ", Maths: " + math[i] +
                    ", %: " + percent[i] + ", Grade: " + grade[i]);
        }
    }
}
