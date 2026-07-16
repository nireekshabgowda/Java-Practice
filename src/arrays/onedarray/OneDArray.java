package arrays.onedarray;
import java.util.Scanner;
public class OneDArray {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the elements");
			int a[] = new int[5];
			System.out.println("Array elements are: ");
			for (int i = 0; i <= 4; i++) {
				 a[i] = scan.nextInt();
			}
			for (int i = 0; i <= 4; i++) {
				System.out.println(a[i]);
			}
		}

	}

