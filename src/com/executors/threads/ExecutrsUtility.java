package com.executors.threads;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Service implements Runnable
{
	int i;public Service(int i) {this.i=i;}
	
	@Override
	public void run() { System.out.println(i+ " ");}
 	

}
public class ExecutrsUtility {

	public static void main(String [] args) throws InterruptedException
	{
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		for(int i=0;i<25;i++)
		{
		es.execute(new Service(i));
		}
		//es.shutdown();
		es.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println(new Date());
	
	}
	
}
