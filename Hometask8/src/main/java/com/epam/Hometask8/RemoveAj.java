package com.epam.Hometask8;

public class RemoveAj {
	public String removeA(String string) {
		String ans ="";
		int n = string.length();
		
		if(n >= 1 && string.charAt(0) != 'a' && string.charAt(0) != 'A') {
			ans += string.charAt(0);
		}
		
		if(n >= 2 && string.charAt(1) != 'a' && string.charAt(1) != 'A') {
			ans += string.charAt(1);
		}
		
		if(n > 2) {
			ans += string.substring(2);
		}
		return ans;
		
	}		

}
