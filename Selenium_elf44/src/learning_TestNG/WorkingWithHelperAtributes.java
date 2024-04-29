package learning_TestNG;

import org.testng.annotations.Test;

public class WorkingWithHelperAtributes {
	@Test(priority=1,invocationCount=3,threadPoolSize=2,enabled=false)
	public void method1() {
		System.out.println("it is a method-1");
	}
	
	@Test(priority=-1,threadPoolSize=4)
	public void print() {
		System.out.println("it is a print");
	}
	
	@Test(invocationCount=-1)
	public void display() {
		System.out.println("it is a display");
	}

}
