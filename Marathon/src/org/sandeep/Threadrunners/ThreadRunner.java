package org.sandeep.Threadrunners;

import java.util.Random;
 
public class ThreadRunner implements Runnable{
	
	String thread_name ;
	int speed;
	int restPercentage;
	int distance_covered =0;
	Random random = new Random();
	public static volatile String winner = null;
	public static volatile boolean win = false;

	public ThreadRunner( int speed, int restPercentage){
		
		this.speed=speed;
		this.restPercentage = restPercentage;
	
	}	
	//finshing
	 private synchronized void finished(String threadName) {
 				 if (win==false) {
 					 winner = Thread.currentThread().getName();
					 System.out.println(winner+" is the winner");
					 win = true;
					 
				 }
		 
		 }
	      
	    
	
	
	  //mocking sleep
	public void thread_run(){
		
		distance_covered = distance_covered + speed;
		System.out.println(Thread.currentThread().getName()+" : "+distance_covered	);

	}
	//mocking rest
	public void thread_rest() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" is resting");
		Thread.sleep(1000);
		
	}
	
	
	@Override
	public void run() {
		
		
			
			while(!win){
				if(distance_covered!=300){
					
					int temp = random.nextInt(99)+1;
					if(temp<= restPercentage){
						
						try {
							this.thread_rest();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else if(temp > restPercentage){
						
						this.thread_run();
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					
					finished(Thread.currentThread().getName());
					
				}
			}
		
			if(!Thread.currentThread().getName().equals(winner))
			System.out.println(Thread.currentThread().getName()+": you won fare and square");
		
		
				
			}
		
	}


