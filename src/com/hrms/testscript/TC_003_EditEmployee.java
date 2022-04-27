package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_003_EditEmployee extends General {

	public static void main(String[] args) throws Exception {
		General g= new General();
		g.LaunchUrl();
		g.login();
		g.enterFrame();
		g.editEmployee("0003", "Maha", "Kaandi");
		g.exitFrame();
		g.logOut();
		
		Thread.sleep(2000);
		g.CloseBroser();
		
	}

}
