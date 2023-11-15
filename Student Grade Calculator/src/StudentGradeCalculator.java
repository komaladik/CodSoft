 import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		float totalMarks = 0.0f;
		float averagePercentage = 0.0f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Marks You Scored out of 100:");
		
		System.out.println("Data Structures & Algorithms ");
		float dsa = scanner.nextFloat();
		
		System.out.println("Object Oriented Programing ");
		float oop = scanner.nextFloat();
		
		System.out.println("Data Base Management System ");
		float dbms = scanner.nextFloat();
		
		System.out.println("Operating System ");
		float os = scanner.nextFloat();
		
		System.out.println("Software Engineering ");
		float sen = scanner.nextFloat();
		
		totalMarks = dsa + oop + dbms + os + sen;
		
		System.out.println("Your Total Marks:"+totalMarks);
		
		averagePercentage = totalMarks/5;
		
		System.out.println("Your Percentage:"+averagePercentage);
		
		if(averagePercentage>80) {
			System.out.println("Grade A");
		}
		else if(averagePercentage>60) {
			System.out.println("Grade B");
		}
		else if(averagePercentage>50) {
			System.out.println("Grade C");
		}
		else if(averagePercentage>40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}

	}

}
