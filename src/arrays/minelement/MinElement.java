package arrays.minelement;
import java.util.Scanner;
public class MinElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:");
         for (int i = 0; i < arr.length; i++) {
        	 arr[i] = scan.nextInt();
         }
         int min = arr[0];
         for (int i = 0; i < arr.length; i++) {
        	 if (arr[i] < min) {
        		 min = arr[i];
        	 }
         }
         System.out.println("Minimum Element is: " + min);
	}

}