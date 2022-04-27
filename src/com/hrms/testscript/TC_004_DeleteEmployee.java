package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_004_DeleteEmployee extends General {
	public static void main (String[]args) throws Exception
	{
		General g = new General();
		g.LaunchUrl();
		g.login();
		g.enterFrame();
		g.deleteEmployee("0001");
		g.exitFrame();
		g.logOut();
		
		Thread.sleep(0);
		g.CloseBroser();
    
}
}
