package org.sandeep.mainap;



import org.sandeep.Threadrunners.ThreadRunner;

public class Marathonapp {
	
	
	
	public static void main(String args[]){
		
		//setting up the values for tortoise anf hare
		Thread t1= new Thread(new ThreadRunner(10, 25));
		
		Thread t2 = new Thread(new ThreadRunner(100, 90));
		t1.setName("Tortoise");
		t2.setName("Hare");
		t1.start();t2.start();
		
		
		
	try {
		//waiting for them to finish the race.
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
}
