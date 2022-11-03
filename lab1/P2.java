package sce.cz2002.cz.first;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter the salary:\n");
		int salary = scan.nextInt();
		
		System.out.printf("Please enter the merit:\n");
		int merit = scan.nextInt();
		
		// close the scanner
		scan.close();
		
		// if-else statement version
		char grade;
		
		if ((600 <= salary && salary <= 649))
			if (merit < 10)
				grade = 'C';
			else
				grade = 'B';
		
		else if ((650 <= salary && salary <= 699))
			grade = 'B';
		
		else if ((700 <= salary && salary <= 799))
			if (merit < 20)
				grade = 'B';
			else
				grade = 'A';
		
		else if (800 <= salary)
			grade = 'A';
		else
			grade = 'C';
		
		System.out.printf("Grade: " + grade + "\n");
		
	}

}
