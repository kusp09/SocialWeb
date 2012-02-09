package com.training.jee.test;

public class TestSynchronousVsAsync {
	
	public static void main(String... args) throws InterruptedException
	{
		TestSynchronousVsAsync synasyn = new TestSynchronousVsAsync();
		//
		Thread t = new Thread( new Runnable() {			
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				System.out.println("in the thread...");
			}
		});
		//t.run();
		t.start();
		//
		synasyn.test("sudhir", "manidhar", "madhu");
		System.out.println("done");
		t.join();
	}
	
	public void test(String... str)
	{
		System.out.println(str);
		System.out.println(str[0]);
	}
	
	
}
