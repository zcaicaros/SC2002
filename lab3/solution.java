package sce.cz2002.cz.first;
import java.util.Arrays;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlaneSeat plSeat = new PlaneSeat(5);
		System.out.println(plSeat.getSeatID());
		
		Plane plane = new Plane(12);
		System.out.println(plane.seats[1].getSeatID());
		
		plane.showArrangement(plane.sortSeats());
		
		System.out.println("total empty seats: " + plane.showNumEmptySeats());
		
		plane.showEmptySeats();
		
		plane.showAssignedSeats(false);

	}

}


class PlaneSeat {

	private int seatId;
	private boolean assigned = false;
	private int customerId = -1;
	
	public PlaneSeat(int seat_id) {seatId = seat_id;}
	
	public int getSeatID() {return seatId;}
	
	public int getCustomerID() {return customerId;}
	
	public boolean isOccupied()  {return assigned;}
	
	public void assign(int cust_id)  {
		customerId = cust_id;
		assigned = true;
	}
	
	public void unAssign()  {
		customerId = -1;
		assigned = false;
	}

}


class Plane {

	public PlaneSeat [] seats;
	public int numEmptySeat;
	
	public Plane(int num_seat) {
		
		seats = new PlaneSeat[num_seat];
		numEmptySeat = num_seat;
		
		for(int i=0; i<num_seat; i++) {
			seats[i] = new PlaneSeat(i);
		}
	}
	
	public PlaneSeat [] sortSeats() {
		
		PlaneSeat [] sorted_seat = new PlaneSeat[seats.length];
		
		int [] cust_ids = new int[seats.length];
		for(int i=0; i<seats.length; i++) {
			cust_ids[i] = seats[i].getCustomerID();
		}
		
		Arrays.sort(cust_ids);
		
		for(int i=0; i<seats.length; i++) {
			for(int j=0; j<seats.length; j++) {
				if ((cust_ids[i] == seats[j].getCustomerID()) && (cust_ids[i] != -1)) {
					sorted_seat[i] = new PlaneSeat(j);
					sorted_seat[i].assign(cust_ids[i]);
				}
				else {
					sorted_seat[i] = new PlaneSeat(i);
				}
					
			}
		}
		
		return sorted_seat;
	}
	
	public void showArrangement(PlaneSeat ps []) {
		int [] seats = new int[ps.length];
		int [] custs = new int[ps.length];
		
		for(int i=0; i<ps.length; i++) {
			seats[i] = ps[i].getSeatID();
			custs[i] = ps[i].getCustomerID();
		}
		
		System.out.println("seats: " + Arrays.toString(seats));
		System.out.println("custs: " + Arrays.toString(custs));
	}
	
	public int showNumEmptySeats() {
		
		int count = 0;
		
		for(int i=0; i<seats.length; i++) {
			if (seats[i].isOccupied() == false) {
				count += 1;
			}
		}
		
		return count;
	}
	
	
	public void showEmptySeats() {
			
		int [] lst = new int[showNumEmptySeats()];
		
		int helper_itr = 0;
		for(int i=0; i<seats.length; i++) {
			if (seats[i].isOccupied() == false) {
				lst[helper_itr] = seats[i].getSeatID();
				helper_itr += 1;
			}
		}
		
		System.out.println("empty seats list: " + Arrays.toString(lst));
	}
	
	
	public void showAssignedSeats(boolean bySeatId) {
		
		int [] lst = new int[seats.length - showNumEmptySeats()];
		
		int helper_itr = 0;
		if (bySeatId == true) {
			for(int i=0; i<seats.length; i++) {
				if (seats[i].isOccupied() == false) {
					lst[helper_itr] = seats[i].getSeatID();
					helper_itr += 1;
				}
			}
		} else {
			PlaneSeat [] sorted = sortSeats();
			
			showArrangement(sorted);
			for(int i=0; i<sorted.length; i++) {
				if (sorted[i].isOccupied() == true) {
					lst[helper_itr] = sorted[i].getSeatID();
					helper_itr += 1;
				}
			}
		}
		
		System.out.println("empty seats list: " + Arrays.toString(lst));
	}
	
	
	public void assignSeat (int seatId, int cust_id) {
		seats[seatId].assign(cust_id);
	}
	
	public void unAssignSeat (int seatId) {
		seats[seatId].unAssign();
	}
}


