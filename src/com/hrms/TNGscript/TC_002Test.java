package com.hrms.TNGscript;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002Test extends General {

	@Test
	public void addEmployee() throws Exception {		
		
		LaunchUrl();
		login();
		enterFrame();
		addEmployee("Dimag ka ", "Bhosda Ho gaya");
		exitFrame();
		logOut();
		
		Thread.sleep(2000);
		CloseBroser();
	}
}

