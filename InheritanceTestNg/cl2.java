package InheritanceTestNg;

import org.testng.annotations.Test;

public class cl2 extends Cl1 
{
   @Test
    public void doThis()
    {
	   System.out.println("This needs to be done");
	   inherit();
    }
}
