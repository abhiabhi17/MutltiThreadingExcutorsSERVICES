package com.executors.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Process2 implements Callable<String>
{ 
	int i;public Process2(int i){this.i=i;}
	
	public String call() throws Exception {

		return "From Thread "+i;
	}
	
}
public class ExecutrsCallableSubmit {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService es= Executors.newFixedThreadPool(5);
		List<Future<String>> futureList=new ArrayList<>();
		for(int i=0;i<25;i++)
		{
			futureList.add(es.submit(new Process2(i)));
			//es.submit(new Process2());
		}
		//es.shutdown();
		es.awaitTermination(10, TimeUnit.SECONDS);
		for(Future<String> fut:futureList)
		{
			System.out.println(fut.get());// Future will return from callable object
		}

		System.out.println(new Date());
	}

}
