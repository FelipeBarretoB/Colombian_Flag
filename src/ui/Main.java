package ui;

import thread.Colors;

public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		System.out.print("\u001b[2J");//Clear screen
		Colors yellow= new Colors(10,0,31);
		Colors blue= new Colors(500,2,31);
		Colors red= new Colors(1000,3,31);
		yellow.start();
		blue.start();
		red.start();
	}
}
