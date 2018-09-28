package com.yebelete.service;

public class LoginService {

	public int authenticate(String userID, String pwd ) {
		
		String DBuserID = "abc";
		String DBpwd = "123";
		
		if(userID==DBuserID && pwd==DBpwd){
			return 1;			
		}else {
			return 0;
		}
			
		
	}
}
