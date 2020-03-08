package com.javabykiran;

import org.springframework.stereotype.Repository;

@Repository
public class GithubDemoVdao {
	
	public String getDao() {
		
		String str = "hungry";
		
		if(str == "hungry") {
			System.out.println("Eat something.");
		}
		else {
			System.out.println("Do some work.");
		}
		
		return "Github implementation executed";
	}
	
	public String getList() {
		
		String str = "Welcome in new changes !";
		if(str == "Welcome in new changes !") {
			return success;
		}
		else {
			return failure;
		}
		
	}

}
