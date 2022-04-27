package com.hrms.testscript;

import com.hrms.lib.General;

public class TC_001_LoginLogout {

	public static void main(String[] args) throws Exception {
		try{General g = new General();
		g.LaunchUrl();
		g.login();
		g.logOut();
		g.CloseBroser();
		System.out.println("hello git");
	}
		catch(Exception e){
			System.out.println(e);
		}
	}
}