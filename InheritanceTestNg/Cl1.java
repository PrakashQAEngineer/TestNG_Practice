package InheritanceTestNg;

import org.testng.annotations.BeforeTest;

public class Cl1 
{
	@BeforeTest
	 public void first()
	 {
		System.out.println("This needs to be executed first");
	 }
	
	public void inherit()
	{
		System.out.println("This is the inherit part of the system whihc will be called by another parent");
	}
	

}
