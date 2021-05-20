package thread;

import model.ColoursPrint;

public class Colours extends Thread {
	private int sleep;
	private int color;
	private int start;
	private int current;
	private int length;

	public Colours( int sleep,int length, int start,int current,int color) {	
		this.length=length;
		this.color=color;
		this.sleep=sleep;
		this.start=start;
		this.current=current;
	}



	@Override
	public void run() {	
		ColoursPrint print=new ColoursPrint();
		print.print(current, length, sleep, start, color);
	}
}
