package com.hrms.TNGscript;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_001Test {
    
	
	private static Logger log=(Logger) LogManager.getLogger(TC_001Test.class.getName());
	
	@Test
	public void LoginLogout() {
		
		try{General g = new General();
		g.LaunchUrl();
		g.login();
		g.logOut();
		g.CloseBroser();
		
		log.info("login logout test is completed");
	}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
