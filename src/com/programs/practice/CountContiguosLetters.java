package com.programs.practice;

public class CountContiguosLetters {
	public static void main(String[] args) {
		String str="aabbbaac";
		String rs="";
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
			}
			
			rs=(str.charAt(i-1)+""+count)+rs;
		}
		System.out.println(rs);
	}

}
