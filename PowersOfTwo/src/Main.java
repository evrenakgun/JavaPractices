import java.util.Scanner;

public class Main {
	
	public static boolean PowersOfTwo(int num) {
		boolean result = true;
		double count;
		
		for (int i = 0; Math.pow(2, i) <= num; i++) {
			count = Math.pow(2, i);
			if (count == num) {
				result = true;
				break;
			}
			else {
				result = false;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(PowersOfTwo(scanner.nextInt()));
	}

}
