package arrray;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc  = new Scanner(System.in);
	        System.out.print(" Enter number of rows : ");
	        int x = sc.nextInt();
	        System.out.print(" Enter number of coloums : ");
	        int y = sc.nextInt();

	        int matrix [][]= new int [x][y];
	        int n = matrix.length;
	        int m = matrix[0].length;
	        //input
	        System.out.print(" Enter the elements");
	        
	        for (int i =0 ; i < n ; i++){
	            for (int j =0 ; j<m; j++){
	                matrix[i][j]=sc.nextInt();

	            }
	        }
	        //output
	        for (int i =0 ; i < n ; i++){
	            for (int j =0 ; j<m; j++){
	               System.out.print(matrix[i][j] + " ");
	                
	            }
	            System.out.println();
	        }
	        sc.close();

	}

}
