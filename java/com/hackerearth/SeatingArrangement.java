package com.hackerearth;

import java.util.Scanner;

/**
 * You will be given a seat number, find out the seat number facing 
 * you and the seat type, i.e. WS, MS or AS.
 * @author Hugo Vargas
 */
public class SeatingArrangement {

	private static Scanner scan;

	public static void main(String[] args) {
		String[] arr = new String[109];
		
		arr[0] = null;
		for (int i = 6, j = 1; i < arr.length; i += 6, j += 6) {
			arr[i] = "WS";
			arr[j] = "WS";
		}
		for (int i = 2; i < arr.length; i += 3) {
			arr[i] = "MS";	
		}
		for (int i = 3; i < arr.length; i += 5) {
			arr[i] = "AS";
			i += 1;
			arr[i] = "AS";
		}
		
		int[] face = new int[109];

		for (int i = 1, j = i + 11; i < face.length; i++, j--) {
			face[i] = j;
			face[j] = i;
			
			if (i + 1 == j && j != face.length - 1) {
				i += 6;
				j = i + 13;
			}
		}
		
		scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		
		while (c > 0) {
			int s = scan.nextInt();
			System.out.println(face[s] + " " + arr[face[s]]);
			c--;
		}
	}

}
