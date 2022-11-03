package sce.cz2002.cz.first;


// import scanner to read from command line
import java.util.Scanner;

// import Math class
//import java.math.*;


public class Lab2p1 {

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		// continue or not
		char cont = 'Y';
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: /* add mulTest() call */
				System.out.println();
				while((cont == 'Y') || (cont == 'y')){
					// call method
					mulTest(sc);
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 2: /* add divide() call */
				while((cont == 'Y') || (cont == 'y')){
					// read m
					System.out.printf("m = ");
					int m = sc.nextInt();
					// read n
					System.out.printf("n = ");
					int n = sc.nextInt();
					// call method
					int quot = divide(m, n);
					System.out.println("quotient of " + m + " divided by " + n + " is " + quot);
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 3: /* add modulus() call */
				System.out.println();
				while((cont == 'Y') || (cont == 'y')){
					// read m
					System.out.printf("m = ");
					int m = sc.nextInt();
					// read n
					System.out.printf("n = ");
					int n = sc.nextInt();
					// call method
					int mod = modulus(m, n);
					System.out.println("modulus of " + m + " divided by " + n + " is " + mod);
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 4: /* add countDigits() call */
				System.out.println();
				while((cont == 'Y') || (cont == 'y')){
					// read n
					System.out.printf("n = ");
					int n = sc.nextInt();
					// call method
					if (n > 0) {
						int count = countDigits(n);
						System.out.println("digit count of " + n + " is: " + count);
					} else {
						System.out.println("Error input!!");
					}
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 5: /* add position() call */
				System.out.println();
				while((cont == 'Y') || (cont == 'y')){
					// read n
					System.out.printf("n = ");
					int n = sc.nextInt();
					// read digit
					System.out.printf("digit = ");
					int digit = sc.nextInt();
					// call method
					int pos = position(n, digit);
					System.out.println("1st position of " + digit + " in " + n + " is: " + pos);
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 6: /* add extractOddDigits() call */
				System.out.println();
				while((cont == 'Y') || (cont == 'y')){
					// read n
					System.out.printf("n = ");
					long n = sc.nextLong();
					if (n > 0) {
						// call method
						long pos = extractOddDigits(n);
						System.out.println("new number of odd digits is: " + pos);
					} else {
						System.out.println("Error input!!");
					}
					// prompt for continue
					System.out.println("Do you want to continue? (Y/N)");
					cont = sc.next().charAt(0);
				};
				System.out.println();
				cont = 'Y';
				break;
			case 7: System.out.println("Program terminating ….");
			}
		} while ((1 <= choice) && (choice < 7));
		
		// close the scanner
		sc.close();
	}
	
	
	/* add method code here */
	public static void mulTest(Scanner scanner) {
		
		int num_question = 5;
		int correct_count = 0;
		int user_answer;
		double first_digit;
		double second_digit;
		double correct_answer;
		
		// test num_question questions
		for(int i=0; i<num_question; i++) {
			// generating questions
			first_digit = (int)(Math.random() * 10);
			second_digit = (int)(Math.random() * 10);
			correct_answer = (int)first_digit * (int)second_digit;
			
			// prompt for answer input
			System.out.printf("How much is %.0f times %.0f: ", first_digit, second_digit);
			
			// read answer
			user_answer = scanner.nextInt();
			
			// check answer
			if (correct_answer == user_answer){
				correct_count+=1;
			}
		}
		
		// print correct answers count
		System.out.println(correct_count + " answers out of " + num_question + " are correct.");
		
	}

	
	public static int divide(int m, int n) {
			int quot = 0;
			while(m>=n) {
				m = m-n;
				quot += 1;
			}
			return quot;
		}

	
	public static int modulus(int m, int n) {
		int mod = m;		
		while(mod>=n) {
			mod = mod-n;
		}		
		return mod;
	}
	
	
	public static int countDigits(int n) {		
		int count = 0;		
		while (n != 0) {n = n/10; ++count;}
		return count;
	}
	
	
	public static int position(int n, int digit) {
		// convert number to string
		String n_str = String.valueOf(n);
		// convert digit to char
		char digit_char = (char)(digit+'0');
		// find the position
		int pos = n_str.indexOf(digit_char);
		if (pos > 0) {pos+=1;}
		return pos;
	}
	
	
	public static long extractOddDigits(long n) {
		String output = "";
		while(n > 0) { 
			// calling our method for calculating modulus
			int left = (int) (modulus((int)n, 10)); 
			if (left % 2 != 0) {output = left + output;}
			n /= 10;
			}
		if (output == "") {return -1;}
		else {return Long.parseLong(output);}
	}
	
	
}
