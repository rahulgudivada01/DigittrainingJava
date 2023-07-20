package com.digit.javaTraining.mutlithreading;

public class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q)
	{
		b=q;
	}
	public void run()
	{
		while(true)
		{
			b.get();
		}
	}

}
