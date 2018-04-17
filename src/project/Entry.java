package project;

import java.util.ArrayList;
import java.util.Collection;

public class Entry {
	private ArrayList<Integer> entryArray;
	private final Integer N;
	private final Integer BOX;
	
	public Entry(int n, int box) {
		entryArray = new ArrayList<>();
		N = n;
		BOX = box;
	}
	
	public boolean addAll(Collection<Integer> input) {
		return this.entryArray.addAll(input);
		// Return true if entryArray is changed / modified
		// due to the call of addAll(input).
	}
	
	public boolean add(Integer n) {
		return this.entryArray.add(n);
	}
	
	public boolean add(int row, int col, int n) {
		ArrayList<Integer> e = new ArrayList<>();
		int box = ((row-1)/BOX)*BOX + ((col-1)/BOX) + 1;	// TO BE CHECKED
		
		e.add( (row-1)*N + (n-1) );				// Constraint 1
		e.add( N*N + (col-1)*N + (n-1) );		// Constraint 2
		e.add( 2*N*N + (box-1)*N + (n-1) );		// Constraint 3
		
		return addAll(e);
	}
	
	public ArrayList<Integer> getList() {
		return this.entryArray;
	}
	
	/**
	 *  Return true if entryArray contains the element
	 *  @param n The element to be checked
	 *  @return True if the element does contain in the list
	 */
	public boolean include(int n) {
		return entryArray.contains(n);
	}
	
	@Override
	public String toString() {
		return entryArray.toString();
	}
}
