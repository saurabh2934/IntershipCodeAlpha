import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        // array for storing the grade
        double[] studentScores = new double[5];

        Scanner s=new Scanner(System.in);
        // input for student grade
        System.out.println("Enter the Students Grade");
        for(int i=0;i< studentScores.length;i++ ){
            studentScores[i]=s.nextDouble();
        }
            // Print student result
            System.out.println("Highest score = " + max(studentScores));
            System.out.println("Lowest score = " + min(studentScores));
            System.out.println("Mean = " + mean(studentScores) + " Grade:" + gradeLetter(mean(studentScores)));
            System.out.println("Mean (lowest dropped) = " + meanLowDrop(studentScores));
            System.out.println("-------------------------------------");
    }


    //get the largest number from the arraye
    public static double max(double[] numbers) {
        double result = numbers[0];
        for (double number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    //get the smallest Number from the array
    public static double min(double[] numbers) {
        double result = numbers[0];
        for (double number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }

    //get the min of all the numbers in array
    public static double mean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double meanLowDrop(double[] numbers) {
        double lowestGrade = min(numbers);
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return (sum - lowestGrade) / (numbers.length - 1);
    }

    //return a grade letter based on the student's mean grade.
    public static char gradeLetter(double mean) {
        char result;
        if (mean >= 90) {
            result = 'A';
        } else if (mean >= 80) {
            result = 'B';
        } else if (mean >= 70) {
            result = 'C';
        } else if (mean >= 65) {
            result = 'D';
        } else {
            result = 'F';
        }
        return result;
    }

}
