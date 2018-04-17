/*
 *  There should have totally 3 constraints
 *  1. row constraint (only one of 1-n in each of n rows)     	 [n*n]
 *  2. column constraint (only one of 1-n in each of n columns)	 [n*n]
 *  3. box constraint (only one of 1-9 in each of n blocks)		 [n*n]
 *  Entry = {constraint 1}{constraint 2}{constraint3}
 */

package project;

import java.util.ArrayList;

public class Constraint {
	private final Integer N;	// The grid is N by N
	private final Integer BOX;	// usually BOX = sqrt(N)
	private ArrayList<Entry> entryList;
	
	public Constraint(int n, int box) {
		N = n;
		BOX = box;
		entryList = new ArrayList<>();
	}
	
	public ArrayList<Entry> construct() {
		for (int r = 1; r <= N; r++)
			for (int c = 1; c <= N; c++)
				for (int n = 1; n <= N; n++) {
					Entry e = new Entry(N, BOX);
					e.add(r, c, n);
					entryList.add(e);
				}
		for (Entry e: entryList) {
			System.out.println(e);
		}
		return this.entryList;
	}
}
