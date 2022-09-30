import java.util.*;

public class Main {

	public static int TrappingWater(int[] arr) {
		int capacity = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int maxLeft = arr[i];
			for (int j = 0; j < i; j++) {
				maxLeft = Math.max(maxLeft, arr[j]);
			}

			int maxRight = arr[i];
			for (int k = 0; k < arr.length; k++) {
				maxRight = Math.max(maxRight, arr[k]);
			}

			capacity += Math.min(maxLeft, maxRight) - arr[i];
		}

		return capacity;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 2, 4, 0, 2, 1, 2, 6, 0, 6 };
		
		System.out.println(TrappingWater(arr));
	}

}
