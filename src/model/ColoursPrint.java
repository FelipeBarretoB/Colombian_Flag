package model;

public class ColoursPrint {

	public void print(int current,int length,int sleep, int start,int color) {
		for(int c=0; c<100;c++) {
			int tempCurrent=current;
			for (int i = 0; i < length; i++) {
				try {
					Thread.sleep(sleep);
					System.out.print("\u001b["+tempCurrent+";"+start+"H"+"\u001b["+color+"m*"+"\u001b[1B"+"\u001b[1D");
					tempCurrent++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			start++;
		}
	}
	
}
