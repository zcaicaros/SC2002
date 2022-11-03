package sce.cz2002.cz.first;
// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************
public class WeeklySales
{
	public static void main(String[] args)
	{
		SalePerson[] salesStaff = new SalePerson[10];
		salesStaff[0] = new SalePerson("Jane", "Jones", 3000);
		salesStaff[1] = new SalePerson("Daffy", "Duck", 4935);
		salesStaff[2] = new SalePerson("James", "Jones", 3000);
		salesStaff[3] = new SalePerson("Dick", "Walter", 2800);
		salesStaff[4] = new SalePerson("Don", "Trump", 1570);
		salesStaff[5] = new SalePerson("Jane", "Black", 3000);
		salesStaff[6] = new SalePerson("Harry", "Taylor", 7300);
		salesStaff[7] = new SalePerson("Andy", "Adams", 5000);
		salesStaff[8] = new SalePerson("Jim", "Doe", 2850);
		salesStaff[9] = new SalePerson("Walt", "Smith", 3000);
		
		Sorting.insertionSort(salesStaff);

		System.out.println ("\nRanking of Sales for the Week\n");

		for (SalePerson s : salesStaff)
			System.out.println (s.toString());
	}
}

class SalePerson implements Comparable<SalePerson> {
	private int totalSales;
	private String firstName;
	private String lastName;
	
	public SalePerson(String fName, String lName, int sales) {
		totalSales = sales;
		firstName = fName;
		lastName = lName;
		}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName + ", " + lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public boolean equals(SalePerson p) {
		if ((p.getFirstName() == this.firstName) && (p.getLastName() == this.lastName)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(SalePerson p) {
		if (p.getTotalSales() > this.totalSales) {
			return -1;
		} else if (p.getTotalSales() < this.totalSales) {
			return 1;
		} else {
			// break the tie
			if (p.lastName.equalsIgnoreCase(this.lastName)) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}