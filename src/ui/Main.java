package ui;

import thread.Colors;

public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		System.out.print("\u001b[2J");//Clear screen
		Colors yellow= new Colors(0,0,33);
		Colors blue= new Colors(500,2,34);
		Colors red= new Colors(100,3,31);
		yellow.start();
		blue.start();
		red.start();
	}
}
