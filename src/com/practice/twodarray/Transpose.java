package com.practice.twodarray;

import java.util.Random;
import java.util.Scanner;

public class Transpose {
	static int[][] generateRandomMatrix(){
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println("enter the number of rows ");
		int rows=scanner.nextInt();
		System.out.println("enter the number of column ");
		int columns=scanner.nextInt();
		int[][] rs=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				rs[i][j]=random.nextInt(20);
			}
		}
		
		return rs;
		
	}
	public static void main(String[] args) {
		
		int[][] rs=generateRandomMatrix();
		for(int i=0;i<rs.length;i++) {
			for(int j=0;j<rs[0].length;j++) {
				System.out.print(rs[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after transpose! ");
		int[][] transpose=transposeMatrix(rs);
		for(int i=0;i<rs.length;i++) {
			for(int j=0;j<rs[0].length;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	private static int[][] transposeMatrix(int[][] rs) {
		int rows=rs.length;
		int colomns=rs[0].length;
		int[][] transpose=new int[colomns][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colomns;j++) {
				transpose[j][i]=rs[i][j];
			}
		}
		return transpose;
	}
//	hello oooo
//	world 

}
