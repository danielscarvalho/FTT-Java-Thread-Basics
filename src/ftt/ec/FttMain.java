package ftt.ec;

public class FttMain {

	public static void main(String[] args){
		
		System.out.println(new java.util.Date());
		
		try {
			
			Thread.sleep(500);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Milesegundos...
		
		System.out.println(new java.util.Date());
		
		//Usando Runable
		
		T1 t1 = new T1();
		T1 t2 = new T1();
		T1 t3 = new T1();
		
		t1.setName("Thread 1");
		t1.setCount(300000);
		t2.setName("Thread 2");
		t2.setCount(200000);
		t3.setName("Thread 3");
		t3.setCount(10000);
		
		Thread tr1 = new Thread(t1);
		Thread tr2 = new Thread(t2);
		Thread tr3 = new Thread(t3);
		
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		//Usando Thread
		
		T2 th2 = new T2();
		th2.setCount(100);

		th2.start();
	}

}
