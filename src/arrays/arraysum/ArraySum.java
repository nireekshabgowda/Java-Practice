package arrays.arraysum;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int size = scan.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the array elements: ");
	for (int i = 0; i < arr.length - 1; i++) {
		arr[i] = scan.nextInt();
	}
	int sum = 0;
	for (int i = 0; i < arr.length - 1; i++) {
	  sum = sum + arr[i];	
	}
	System.out.print("Array: ");
	System.out.print("[");
	for (int i = 0; i < arr.length - 1; i++) {
		if (i < size - 1) {
			System.out.print(arr[i] + ",");
		}
		else {
			System.out.print(arr[i]);
		}
	}
	System.out.print("]");
	System.out.println("sum: " + sum);
}

}
