package com.hrms.TNGscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_004Test extends General {
	@Test
	public void DeleteEmployee() throws Exception
	
	{
		General g = new General();
		
		g.LaunchUrl();
		g.login();
		g.enterFrame();
		g.deleteEmployee("0010");
		g.exitFrame();
		g.logOut();
		
		Thread.sleep(0);
		g.CloseBroser();
    
}
}
