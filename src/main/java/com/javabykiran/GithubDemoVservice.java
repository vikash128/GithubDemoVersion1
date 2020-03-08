package com.javabykiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GithubDemoVservice {
	
	@Autowired
	private GithubDemoVdao githubdemoDao;
	
	public String getService() {
		return githubdemoDao.getDao();
	}
	
	public String getList() {
		return githubdemoDao.getList();
	}

}
