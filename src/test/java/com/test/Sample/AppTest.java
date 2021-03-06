package com.test.Sample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testLogin(){
		System.out.println("Testing Login test case");
	}
	
	@Test
	public void testUserregisteration(){
		
		System.out.println("Testing User registeration");
			}
	
	@BeforeMethod
	public void Openbrowser(){
		
		System.out.println("Open broswser");
		System.out.println("well done  broswser");
		System.out.println("Jenkins update");
	}
	
	@BeforeTest
	public void openDb(){
		
		System.out.println("Open db connection");
	}
	
	@AfterMethod
	public void Closebrowser(){
		
		System.out.println("Close browsers");
		
	}
	
	@AfterTest
	public void closeDB(){
		
		System.out.println("Close db connection");
	}
	
	
	@BeforeSuite
	public void runSeleniumserver(){
		
		System.out.println("Testing running of selenium server");
	}
	
	@AfterSuite
	public void stopSeleniumserver(){
		
		System.out.println("Close selenium server");
	}
	
}
