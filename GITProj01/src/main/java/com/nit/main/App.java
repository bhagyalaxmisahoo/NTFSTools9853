package com.nit.main;

public class App {

	public int sum(int x,int y)
	{
		return x+y;
	}
    public static void main(String[] args) {
        App app=new App();
        System.out.println("Sum amount11 is::"+app.sum(10, 20));
    }
}
