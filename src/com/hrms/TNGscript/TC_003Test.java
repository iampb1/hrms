package com.hrms.TNGscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_003Test extends General {

	@Test
	public void EditEmployee() throws Exception{
		General g= new General();
		g.LaunchUrl();
		g.login();
		g.enterFrame();
		g.editEmployee("0003", "kaali", "gaand");
		g.exitFrame();
		g.logOut();
		
		Thread.sleep(2000);
		g.CloseBroser();
		
	}

}
