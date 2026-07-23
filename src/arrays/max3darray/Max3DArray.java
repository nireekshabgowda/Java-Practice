package arrays.max3darray;
import java.util.Scanner;
public class Max3DArray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int depth = scan.nextInt();
	int rows = scan.nextInt();
	int cols = scan.nextInt();
	int [][][]arr3D = new int[depth][rows][cols];
	for (int d = 0; d < depth; d++) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr3D[d][i][j] =scan.nextInt();
			}
		}
	}
	System.out.println("3D Array:");
	for (int d = 0; d  < depth; d++) {
		System.out.println("Layer" + (d + 1) + ":");
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr3D[d][i][j] + " ");
			}
			System.out.println();
		}
	}
	for (int d = 0; d < depth; d++){
	int max = arr3D[d][0][0];
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j< cols; j++) {
			if (arr3D[d][i][j] > max) {
				max = arr3D[d][i][j];
			}
		}
	}
	System.out.println("Maximum value in layer " + (d + 1) + ": " + max);
	}
	scan.close();
	}

}
