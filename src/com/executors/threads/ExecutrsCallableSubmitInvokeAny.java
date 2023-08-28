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

class Process4 implements Callable<String>
{
	int i; Process4(int i){this.i=i;}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "From Thread "+i;
	}
}
public class ExecutrsCallableSubmitInvokeAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService es=Executors.newFixedThreadPool(5);
		
		List<Callable<String>> futureList=new ArrayList<>();
		
		futureList.add( new Process4(1));
		futureList.add(new Process4(2));
		futureList.add( new Process4(3));
		futureList.add( new Process4(4));
		futureList.add( new Process4(5));
//		for(int i=0;i<25;i++)
//		{
//		    es.submit(new Process4(i));
//		}
       // es.shutdown();
		String str=es.invokeAny(futureList);// Only Invoke one thread it can be any but it runs all threads
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("----------");
        System.out.println(str);
        System.out.println(new Date());
	}

}
