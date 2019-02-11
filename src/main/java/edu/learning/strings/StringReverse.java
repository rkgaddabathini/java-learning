package edu.learning.strings;

import java.util.Scanner;

public class StringReverse {
	
	
	private static Scanner in;

	private static String reverse(String s){
		
		char[]ch = s.toCharArray();
		int i = 0;
        int j = s.length() - 1;
        while(i<j) {
        	char temp = ch[i];
        	ch[i] = ch[j];
        	ch[j] = temp;
        	i++;
        	j--;
        }
        
        return new String(ch);

    }

	public static void main(String[] args) {
		in = new Scanner(System.in);
        System.out.println("Enter a string"); 
		String name = in.nextLine();
		
		// Using custom written reverse method 
		String revname = reverse(name);	
		System.out.println("Reversed String is "+revname); 
		
		//Using reverse method from StringBuilder Class
		//System.out.println("Reversed String is "+ new StringBuilder(name).reverse().toString() );
		
	}
	
	

}
