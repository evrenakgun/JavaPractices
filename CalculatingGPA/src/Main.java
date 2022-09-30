import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double midterm1 = -1;
		double midterm2 = -1;
		double finalExam = -1;
		double gpa; // gpa : grade point average
		double wgpa = -1; // wgpa: weighted grade point average

		while (midterm1 < 0 || midterm1 > 100) {
			System.out.print("Please enter your first mid-term exam score: ");
			midterm1 = scanner.nextDouble();
			if (midterm1 < 0 || midterm1 > 100) {
				System.out.println("Invalid value.");
			}

		}

		while (midterm2 < 0 || midterm2 > 100) {
			System.out.print("Please enter your second mid-term exam score: ");
			midterm2 = scanner.nextDouble();
			if (midterm2 < 0 || midterm2 > 100) {
				System.out.println("Invalid value.");
			}

		}

		while (finalExam < 0 || finalExam > 100) {
			System.out.print("Please enter your final exam score: ");
			finalExam = scanner.nextDouble();
			if (finalExam < 0 || finalExam > 100) {
				System.out.println("Invalid value.");
			}

		}

		gpa = (midterm1 * 0.3) + (midterm2 * 0.3) + (finalExam * 0.4);

		if (gpa <= 100 && gpa >= 90) {
			System.out.println("Your gpa is " + gpa + "(AA). Great job!");

		} else if (gpa < 90 && gpa >= 85) {
			System.out.println("Your gpa is " + gpa + "(BA). Well done!");

		} else if (gpa < 85 && gpa >= 80) {
			System.out.println("Your gpa is " + gpa + "(BB). Not bad!");

		} else if (gpa < 80 && gpa >= 75) {
			System.out.println("Your gpa is " + gpa + "(CB). You can do better!");

		} else if (gpa < 75 && gpa >= 70) {
			System.out.println("Your gpa is " + gpa + "(CC). Work harder!");

		} else if (gpa < 70 && gpa >= 65) {
			System.out.println("Your gpa is " + gpa + "(DC). Come on!!!");

		} else if (gpa < 65 && gpa >= 60) {
			System.out.println("Your gpa is " + gpa + "(DD). Don't give up!");

		} else if (gpa < 60 && gpa >= 55) {
			System.out.println("Your gpa is " + gpa + "(FD). Too bad!");

		} else if (gpa < 55 && gpa >= 0) {
			System.out.println("Your gpa is " + gpa + "(FF). Hopeless case!");

		}

		while (wgpa < 0 || wgpa > 4) {
			System.out.print("Please enter your weighted grade point average: ");
			wgpa = scanner.nextDouble();

			if (wgpa < 0 || wgpa > 4) {
				System.out.println("Invalid value.");
			}
		}

		if (wgpa >= 2.50 && wgpa <= 4.00) {
			System.out.println(
					"You did great job! And don't forget that you should always work harder. See you next year!");

		}

		else if (wgpa >= 2 && wgpa < 2.50) {
			System.out.println(
					"Your weighted grade point average is under the 2.50 point. You know what to do. Stop hanging out and go for your school!");

		}

		else if (wgpa >= 0 && wgpa < 2) {
			System.out.println("Your weighted grade point average is under the 2.00 point. You failed...");

		}
	}

}
