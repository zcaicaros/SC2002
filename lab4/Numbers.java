package sce.cz2002.cz.first;

import java.util.Scanner;

public class Numbers{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args){
	/*
	 * int is a primitive data type. It is not a class, and it doesn't implement
	 * Comparable You should use Integer instead, which does implement Comparable.
	 * int[] intList; ---> Integer[] intList;
	 */
	Integer[] intList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	// intList = new int[size]; ---> intList = new Integer[size];
	intList = new Integer[size];
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++)
		intList[i] = scan.nextInt();
	Sorting.selectionSort(intList);
	System.out.println ("\nYour numbers in sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	System.out.println ();
	
	Sorting.insertionSortReversed(intList);
	System.out.println ("\nYour numbers in reversed sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(intList[i] + " ");
	System.out.println ();
	}
}
