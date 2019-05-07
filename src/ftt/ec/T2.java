package ftt.ec;

public class T2 extends Thread {	

	private long count; 
	
	public void setCount(int count){
		this.count = count;
	}
	
	public void run() {
		
		for(int i=0; i<this.count; i++)
			System.out.println("T2 - " + i);

	}

}
