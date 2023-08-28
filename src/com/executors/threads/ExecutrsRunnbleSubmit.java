package com.executors.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Process1 implements Runnable{
	int i;public Process1(int i) { this.i=i;}
@Override
	public void run() {
	System.out.println(i+" ");
	
	}
           


	
}
public class ExecutrsRunnbleSubmit {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es=Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		
		List<Future<String>> futureList=new ArrayList<>();
		for(int i=0;i<25;i++)
		{
		futureList.add((Future<String>) es.submit(new Service(i)));
		//es.execute(new Process1(i));	
		}
		es.shutdown();
		es.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println("=============");
		for(Future<String> fut:futureList)
		{
			System.out.println(fut.get());// Future list will return null as process return type is void 
		}
		System.out.println(new Date());
	}

}
