import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int noOfSubjects = sc.nextInt();

        double[] marks = new double[noOfSubjects];
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        sc.close();

        double totalMarks = calTMarks(marks);
        double averagePercentage = calAvgPercentage(totalMarks, noOfSubjects);
        String grade = determineGrade(averagePercentage);

        displayResults(totalMarks, averagePercentage, grade, noOfSubjects);
    }

    public static double calTMarks(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calAvgPercentage(double totalMarks, int numberOfSubjects) {
        return (totalMarks / numberOfSubjects);
    }

    public static String determineGrade(double avgPercentage) {
        if (avgPercentage >= 90) {
            return "A+";
        } else if (avgPercentage >= 80) {
            return "A";
        } else if (avgPercentage >= 70) {
            return "B+";
        } else if (avgPercentage >= 60) {
            return "B";
        } else if (avgPercentage >= 50) {
            return "C+";
        } else if (avgPercentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void displayResults(double totalMarks, double avgPercentage, String grade, int noOfSubjects) {
        double maxMarks = noOfSubjects * 100.0;
        System.out.println("Total Marks: " + totalMarks + "/" + maxMarks);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentage);
        System.out.println("Grade: " + grade);
    }
}
