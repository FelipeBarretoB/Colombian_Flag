package thread;


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
		
		for(int c=0; c<100;c++) {
			int current=this.current;
			for (int i = 0; i < length; i++) {
				try {
					Thread.sleep(sleep);
					System.out.print("\u001b["+current+";"+start+"H"+"\u001b["+color+"m*"+"\u001b[1B"+"\u001b[1D");
					current++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			start++;
		}
	}
}
