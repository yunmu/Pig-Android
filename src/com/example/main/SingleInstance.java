package com.example.main;

public class SingleInstance {
	
	private static SingleInstance instance;
	
	public static SingleInstance getInstance()
	{
		if(instance==null)
		{
			instance = new SingleInstance();
		}
		return instance;
	}

}
