package Day3_Assignment;
import java.util.*;
public class Rotate_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the matrix size in N*N form:");
    int n = sc.nextInt();
    int[][] arr= new int[n][n];
    System.out.println("Enter the number in matrix:");
    for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
    		arr[i][j]= sc.nextInt();
    	}
    }
    for(int i=0; i<n; i++) {
    	for(int j=i; j<n; j++) {
    		int temp = arr[i][j];
    		arr[i][j]= arr[j][i];
    		arr[j][i] =temp;
    	}
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            int temp =arr[i][j];
            arr[i][j] =arr[i][n - 1 - j];
            arr[i][n - 1 - j] = temp;
 }

}
    System.out.println("Rotated Matrix:");
    for (int[] row : arr ) {
        for (int val : row) System.out.print(val + " ");
        System.out.println();
    }
	}
}
