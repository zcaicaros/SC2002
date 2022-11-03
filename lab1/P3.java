package sce.cz2002.cz.first;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter the starting amount:\n");
		int starting = scan.nextInt();
		
		System.out.printf("Please enter the ending amount:\n");
		int ending = scan.nextInt();
		
		System.out.printf("Please enter the increment amount:\n");
		int increment = scan.nextInt();
		
		// close the scanner
		scan.close();
		
		System.out.printf("\n");
		
		// check starting < ending
		if (starting >= ending) {
			System.out.printf("Error input!!");
		}
		else {
			
			// first table
			System.out.printf("US$         S$\n");
			System.out.printf("--------------\n");
			for(int i=starting; i<=ending; i+=increment) {
				System.out.printf("%-11s %.1f%n",  i, i*1.82);
			}
			
			System.out.printf("\n");
			
			// second table
			System.out.printf("US$         S$\n");
			System.out.printf("--------------\n");
			int i = starting;
			while(i<=ending) {
				System.out.printf("%-11s %.1f%n",  i, i*1.82);
				i+=increment;
			}
			
			System.out.printf("\n");
			
			// third table
			System.out.printf("US$         S$\n");
			System.out.printf("--------------\n");
			int j = starting;
			do {
				System.out.printf("%-11s %.1f%n",  j, j*1.82);
				j+=increment;
			} while (j<=ending);
		}
	}
}
