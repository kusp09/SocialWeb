package com.training.jee.test;

public class StatefulVsStateless {
	public static void main(String... args)
	{
		Stateful s1 = new Stateful();
		Stateful s2 = new Stateful();
		Stateless ss1 = new Stateless();
		Stateless ss2 = new Stateless();
		//
		s1.statefulInvocation();
		s2.statefulInvocation();
		ss1.statelessInvocation("sudhir1");
		ss2.statelessInvocation("sudhir1");
		s1.statefulInvocation();
	}
}

class Stateful
{
	String name="stateful" + this.toString();
	public void statefulInvocation()
	{
		System.out.println("my stateful name is..." + name);
	}
}

class Stateless
{
	public void statelessInvocation(String name)
	{
		System.out.println("my stateless name is..." + name);
	}
	
}