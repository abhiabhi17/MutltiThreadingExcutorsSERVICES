package com.treads.runnable;

class X implements Runnable
{
  @Override
	public void run() {
  try {Thread.sleep(200);}catch (InterruptedException e) {e.printStackTrace();}
 for(int i=0;i<10;i++){System.out.println("Thread-1");}// TODO Auto-generated method stub
		
	}
	
}
class Y implements Runnable
{
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	for(int i=0;i<10;i++) {System.out.println("Thread-2");}
		
	}
	
}
public class Runnble {

	public static void main(String[] args) {
	  X x=new X();
	  Y y=new Y();
	  Thread t1=new Thread(x);
	  Thread t2=new Thread(y);
	  t1.setPriority(Thread.MAX_PRIORITY);
	  t1.start();
	  t2.start();

	}

}
