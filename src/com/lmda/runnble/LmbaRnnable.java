package com.lmda.runnble;

public class LmbaRnnable {

	public static void main(String[] args) {
	
		Runnable r1=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread-1");
			}
		};
		Runnable r2=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread-2");
			}
		};
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        
//      Thread t3= new Thread (()->{
//    	  for(int i=0;i<10;i++)
//    	  {
//    		  System.out.println("Thread-3");
//    	  }
//      });
//    		
//    		
//    	t3.start();	  
// 		  
	}

}
