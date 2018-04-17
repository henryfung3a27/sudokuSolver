package project;

import java.util.ArrayList;

public class Test {
	private Integer N = 4;
	private Integer BOX = 2;
	
	public void print(ArrayList<Entry> list) {
		int i = 0;
		for (Entry e: list) {
			ArrayList<Integer> l = e.getList();
			for (i = 0; i < l.get(0); i++)
				display(".");
			display("o");
			++i;
			for (; i < N*N + 1; i++)
				display(".");
			display("|");
			++i;
			
			for (; i < l.get(1) + 2; i++)
				display(".");
			display("o");
			++i;
			for (; i < 2*N*N + 3; i++)
				display(".");
			display("|");
			++i;
			
			for (; i < l.get(2) + 4; i++)
				display(".");
			display("o");
			++i;
			for (; i < 3*N*N + 5; i++)
				display(".");
			display("|");
			++i;
			
			System.out.println();
		}
	}
	
	public void run() {
		Constraint c = new Constraint(4, 2);
		ArrayList<Entry> list = c.construct();
		print(list);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.run();
	}

	public void display(String s) {
		System.out.print(s);
	}
	
	public void displayLine(String s) {
		System.out.println(s);
	}
}