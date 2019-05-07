package ftt.ec;

public class T1 implements Runnable {
	
	private String name;
	private int count=0;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCount(int count){
		this.count = count;
	}
	
	public void run() {
		/*
		for(int i=0; i<this.count; i++)
			System.out.println(this.name + " " + i);
		*/
		long acumulador=0;
		
		for(long i=0; i<this.count; i++)
			acumulador += i;
			
	    System.out.println(this.name + " " + acumulador);

		
		
	}
	
}
