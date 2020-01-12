package com.naseeha.filereading;


public class Triangle {

	public static void main(String args[]) // driver function
	{
		int n, i, j, space = 1;
		
		n =10;
		space = n - 1;
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= n - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
