package arrays.maxelement;
import java.util.Scanner;
public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
         arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        }
        System.out.println("Maximum elelement are: " + max);
	}

}
