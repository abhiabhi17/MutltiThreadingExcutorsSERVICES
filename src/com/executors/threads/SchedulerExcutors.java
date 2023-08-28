package com.executors.threads;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class Task1 implements Runnable
{
	@Override
	public void run() {
		System.out.println("Thread-1");

	}
}
class Task2 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread-2");
		
	}
	
}
	

public class SchedulerExcutors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService es=Executors.newScheduledThreadPool(5);
		System.out.println(new Date());
		es.schedule(new Task1(), 10, TimeUnit.SECONDS);// Schedule trigggers with Initial Delay as 10 seconds 
		System.out.println(new Date());
		
		
		ScheduledExecutorService es1=Executors.newScheduledThreadPool(5);
		  // Schedule Triggers with initial delay as 10 seconds
		 // For Every 20 seconds this method will trigger even task is completed or not
	            es1.scheduleAtFixedRate(new Task2(), 10, 20, TimeUnit.SECONDS);
	            
	            ScheduledExecutorService es2=Executors.newScheduledThreadPool(5);
	}

}
