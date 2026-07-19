package arrays.reversearray;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scan.nextInt();
		System.out.println("Enter the array elements:");
       int arr[] = new int[size];
       for (int i = 0; i <= arr.length - 1; i++) {
    	   arr[i] = scan.nextInt();
       }
       int revArray[] = new int[size];
       int j = revArray.length - 1;
       for (int i = 0; i <= arr.length - 1; i++) {
    	   revArray[j] = arr[i];
    	   j--;
       }
       System.out.println("Reversed array elements are:");
       for (int i = 0; i <= arr.length - 1; i++) {
    	   System.out.println(revArray[i] + " ");
       }
       
	}

}
