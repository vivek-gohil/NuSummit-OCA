package com.nusummit.main;

public class TwoDimensionalArrayMain {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 10, 20, 30 }, 
				{ 40, 50 }, 
				{ 70, 80, 90 },
				{ 70}
		};
		
		
		//Rows 
		for (int row = 0; row < matrix.length; row++) {
			
			//Columns
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			
			System.out.println();
		}
	}
}
