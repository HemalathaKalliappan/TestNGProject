package Selenium.Testngframework;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngFearture {

	@BeforeGroups(groups={"Test1"})
	public void login()
	{
		System.out.println("Login Sucessfully");
	}
	@AfterGroups
	public void logout()
	{
		System.out.println("Logout Sucessfully");
	}
	@Test(groups={"Test1"})
	public void FundTransfer()
	{
		System.out.println("Fund Transfer");
	}
	@Test(groups={})
	public void search()
	{
		System.out.println("Search Sucessfully");
	}
	@Test(groups={"Test2"})
	public void bill()
	{
		System.out.println("Bill Generated");
	}
	/*@Test
	public void loginurl() {
		System.out.println("logintest");
		//int i =9/0;
	}
	
	@Test(dependsOnMethods="loginurl")
	public void homepage() {
		System.out.println("homepage");		
	}*/
	
	
}
