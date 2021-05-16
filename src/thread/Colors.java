package thread;


public class Colors extends Thread {
	private int sleep;
	private int color;
	private int start;
	private int current;

	public Colors( int sleep, int start,int color) {	
		this.color=color;
		this.sleep=sleep;
		this.start=start;
		current=1;
	}



	@Override
	public void run() {	
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(sleep);
				System.out.print("\u001b["+current+";"+start+"H"+"\u001b["+color+"m*"+"\u001b[1B"+"\u001b[1D");
				current++;
				if(color==33) {
					color=34;
				}else if(color== 34) {
					color=31;
				}else{
					color=33;
				}
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
