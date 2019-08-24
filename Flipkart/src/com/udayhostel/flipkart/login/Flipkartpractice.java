package com.udayhostel.flipkart.login;

public class Flipkartpractice implements Setup {

	@Override
	public void login() {
		System.out.println("This is flipkart login method");
		
	}

	@Override
	public void logout() {
		System.out.println("this is flipkart logout method");
		
	}
	public static void main(String[] args) {
		Flipkartpractice fp=new Flipkartpractice();
		fp.login();
		fp.logout();
	}

}
