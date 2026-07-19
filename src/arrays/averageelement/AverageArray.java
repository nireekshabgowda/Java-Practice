package arrays.averageelement;
import java.util.Scanner;
import java.util.Arrays;
public class AverageArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter array size: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Eneter tje array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / size;
		System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Average: " + avg);
	}

}

