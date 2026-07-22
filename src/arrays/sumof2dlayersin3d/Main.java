package arrays.sumof2dlayersin3d;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int depth = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int [][][]array3D = new int[depth][rows][cols];
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array3D[d][i][j] = scanner.nextInt();
                }
            }
        }  
        System.out.println("3D Array:") ;     
        for (int d = 0; d < depth; d++) {
            int sum = 0;
          System.out.println("Layer " + (d + 1) + ":");
          for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array3D[d][i][j]);
                if (j < cols - 1) System.out.print(" ");
                sum += array3D[d][i][j];
            }
            System.out.println();
          }
        }
        for (int d = 0; d < depth; d++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j ++) {
                    sum += array3D[d][i][j];
                }
            }
            System.out.println("Sum of layer " + (d + 1) + ": " + sum);
        }
        scanner.close();
    }
}

