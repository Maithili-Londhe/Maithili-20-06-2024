package com.JavaDeamonThreads;

public class Example1 implements Runnable
{
//Daemon thread in Java is a service provider thread that provides services to the user thread.
	//when all the user threads dies, JVM terminates this thread automatically.ex gc,finalizer
	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Yes "+Thread.currentThread());;
		}
		else
		{
			System.out.println("No "+Thread.currentThread());
		}
	}
}
