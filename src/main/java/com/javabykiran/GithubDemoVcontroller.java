package com.javabykiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github")
public class GithubDemoVcontroller {
	
	@Autowired
	private GithubDemoVservice githubdemoService;
	
	@GetMapping("/getvalue")
	public String getValue() {
		return githubdemoService.getService();
	}

}
