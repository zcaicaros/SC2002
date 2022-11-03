package sce.cz2002.cz.first;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nEnter the string...");
		String str= scan.nextLine();
		Character[] chars = new Character[str.length()];
		for (int i = 0; i < str.length(); i++)
			chars[i] = str.toCharArray()[i];
		Sorting.selectionSort(chars);
		System.out.println ("\nYour numbers in sorted order...");
		for (int i = 0; i < str.length(); i++)
			System.out.print(chars[i] + " ");
		System.out.println ();
		Sorting.insertionSortReversed(chars);
		System.out.println ("\nYour numbers in reversed sorted order...");
		for (int i = 0; i < str.length(); i++)
			System.out.print(chars[i] + " ");
		System.out.println ();
		
	}
}
