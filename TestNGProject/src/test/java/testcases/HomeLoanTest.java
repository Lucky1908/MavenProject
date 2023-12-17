package testcases;


import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	
	
	@Test (groups={"sanity","regression"})           //(dependsOnMethods="test2") //(priority=1)//(enabled=false)
	public void test1() {
		System.out.println("Inside home loan test1");
	}
	@Test (priority=2)
	public void test2() {
		System.out.println("Inside HL test2");
		
	}
	
	
	

}
