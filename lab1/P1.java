package sce.cz2002.cz.first;

import java.util.*;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter your character:\n");
		char choice = scan.next().charAt(0);
		
		// close the scanner
		scan.close();
		
		// switch statement
		switch(choice) {
			case 'A': case 'a':
				System.out.println("Action movie fan\n");
				break;
			case 'C': case 'c':
				System.out.println("Comedy movie fan\n");
				break;
			case 'D': case 'd':
				System.out.println("Drama movie fan\n");
				break;
			default:
				System.out.println("Invalid choice\n");
		}	
		
	}
	
}
