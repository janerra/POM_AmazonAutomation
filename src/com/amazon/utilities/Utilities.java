package com.amazon.utilities;

public class Utilities {
	public static String extractNumbers(String str) {
		String numbers = "";
		for(int i= 0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				numbers+=ch;
			}
		}
		return numbers;
	}
	
	
	public static void main(String[] args) {

String str = "45df5r5t4r5ere545tyrt";
String numbers = extractNumbers(str);
System.out.println(numbers);

int m = 9;
int n = 1; 
int x = 0;
while(m>n) {
	m--;
	n += 2;
	x += m+n;
}
System.out.println(x);
	}
	
}
