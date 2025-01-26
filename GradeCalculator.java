import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

    public static ArrayList<Double> getGrades() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 1; i <= numStudents; i++) {
            double grade = -1;
            while (grade < 0 || grade > 100) {
                System.out.print("Enter grade for student " + i + ": ");
                grade = scanner.nextDouble();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
                }
            }
            grades.add(grade);
        }

        return grades;
    }

    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        ArrayList<Double> grades = getGrades();

        double average = calculateAverage(grades);
        double highest = findHighest(grades);
        double lowest = findLowest(grades);
        System.out.println("\n--- Grade Report ---");
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
