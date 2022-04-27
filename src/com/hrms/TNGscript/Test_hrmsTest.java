package com.hrms.TNGscript;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.hrms.lib.General;

public class Test_hrmsTest {
	General g= new General();
	
	
	@BeforeTest 
	public void LaunchUrl() {
  	g.LaunchUrl();
	}
	

	@Test
	public void LoginLogout() throws Exception {	
    g.login();
    g.logOut();
    Thread.sleep(2000);
    
	}
	
	@Test (priority=1)
	public void AddEmployee() {
		g.login();
		g.enterFrame();
		g.addEmployee("Amarendra","Bahubali");
		g.exitFrame();
		g.logOut();
		Reporter.log("AddEmployee test is successfull");
	}
	
	@Test (priority=2)
	public void deleteEmployee() {
		int a=42;
		g.login();
		g.enterFrame();
		for (int i=40;i<=a;i++) {
		String s= "00"+i;
		g.deleteEmployee(s);
		Reporter.log("deleteEmployee test is successfull ");
	}
	}
		
	@AfterTest
	public void TearDown() {
	g.CloseBroser();	
	}}
