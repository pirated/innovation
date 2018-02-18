package com.algo.matrix;

public class NegativeNumbersInMatrix 
{
	
	  public int findNegativeNumber(int[][] matrix){
		  
		  int count = 0;
		  boolean done = false;
		  int row = 0;
		  int col = 0;
		  while(!done){
			  System.out.println("Negative Number : "+matrix[row][col]);
			  System.out.println("row : "+row + " , col : "+col);
			  if(matrix[row][col]<0)
			  {
				count++;
				col++;
			  }else{
				  row++;
				  col--;
			  }
			  System.out.println("######row : "+row + " , col : "+col);
			  if(row == matrix.length+1 || col == matrix.length+1)
				  done = true;
		  }
		  return count;
	  }
	  
	 public static void main(String[] args) {
		
		 int[][] matrix = new int[][]{{-3, -2, -1,  1},
									  {-2,  2,  3,  4},
									  {4,   5,  7,  8}};
			 
		int count = new NegativeNumbersInMatrix().findNegativeNumber(matrix);
		 System.out.println("count = "+count);
	}
}
