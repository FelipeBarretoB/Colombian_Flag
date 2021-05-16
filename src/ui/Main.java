package ui;

import thread.Colors;

public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		System.out.print("\u001b[2J");//Clear screen
		Colors yellow= new Colors(1,0,33);
		Colors blue= new Colors(100,4,33);
		Colors red= new Colors(1000,7,33);
		yellow.start();
		blue.start();
		red.start();
	}
}
