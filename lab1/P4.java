package sce.cz2002.cz.first;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter the height:\n");
		int h = scan.nextInt();
		
		// close the scanner
		scan.close();
		
		System.out.printf("\n");
		
		// check height
		if (h <= 0) {
			System.out.printf("Error input!!");
		}
		else {
			for(int i=0; i<h; i++) { // for each row
				for(int j=0; j<=i; j++) { // for each letter block; mind that the stopping criteria is j<=i not j<i
					System.out.printf( // print letter block 'AA' or 'BB'
						String.valueOf((char)((i+j)%2+65)) // first letter 'A' or 'B'
						+
						String.valueOf((char)((i+j)%2+65)) // second letter 'A' or 'B'
					);
				}
				System.out.printf("\n");
			}
		}
	}
}
