package ui;

import thread.Colors;

public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		System.out.print("\u001b[2J");//Clear screen
		Colors yellow= new Colors(1,1,33);
		Colors blue= new Colors(10,2,33);
		Colors red= new Colors(100,3,33);
		yellow.start();
		blue.start();
		red.start();
	}
}
