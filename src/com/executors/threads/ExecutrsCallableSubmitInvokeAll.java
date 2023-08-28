package com.executors.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
class Process5 implements Callable<String>
{
	private int i;public Process5(int i) {this.i=i;}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "From Thread "+i ;
	}
}

public class ExecutrsCallableSubmitInvokeAll {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService es=Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		
		List<Callable<String>> callableList=new ArrayList<>();
		          callableList.add(new Process5(1));
		          callableList.add( new Process5(2));
		          callableList.add( new Process5(3));
		          callableList.add(new Process5(4));
		          callableList.add( new Process5(5));
		          List<Future<String>> futureList=es.invokeAll(callableList);
		          for(Future<String> fut:futureList)
		          {
		        	  System.out.println(fut.get());
		          }
		          System.out.println(new Date());
	}

}
