package com.puneet.twodarray;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter row=");
		        int r = s.nextInt();
		        System.out.println("Enter col=");
		        int c = s.nextInt();
		        int arr[][] = new int[r][c];
		        int max=arr[0][0]; 
		        
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[0].length; j++) {
		                arr[i][j] = s.nextInt();
		            }
		        }

		        // Print matrix row by row
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[0].length; j++) {
		                System.out.print(arr[i][j] + " ");
		                if(arr[i][j]>max)
		                {
		                	max=arr[i][j];
		                }
		            }
		            System.out.println();
		        }
		        System.out.println(max);
		    }
		}
	
	

