package com.executors.threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

  class Task implements Runnable
 {
	 @Override
	public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println("Thread-1");
	}
		
	}
	 
 }
public class ExecutrsScheduler {

	public static void main(String[] args) {
	
		//ScheduledExecutorService ex=Executors.newScheduledThreadPool(5);
		
//		ScheduledExecutorService ex = Executors.newScheduledThreadPool(5);
//		System.out.println(new Date());
//		ex.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		
		ScheduledExecutorService ex1=Executors.newScheduledThreadPool(5);
		ex1.scheduleAtFixedRate(new Task1(), 10, 5, TimeUnit.SECONDS);
		
		
		ScheduledExecutorService ex2=Executors.newScheduledThreadPool(5);
		ex2.scheduleWithFixedDelay(new Task1(), 10, 15, TimeUnit.SECONDS);
		

	}

}
