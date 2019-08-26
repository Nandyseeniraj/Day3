package com.vowels;

import java.util.Scanner;

public class taskGIT {

	public static void main(String[] args) {
		String s;
		char ch;
		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING");
		s= sc.nextLine();
		System.out.println("VOWELS IN A STRING ARE");
		for(int j=0;j<s.length();j++)
		{
			ch=s.charAt(j);
			
		     switch(ch)
		     {
		     case 'a':
		     case 'e':
		     case 'i':
		     case 'o':
		     case 'u':
		     case 'A':
		     case 'E':
		     case 'I':
		     case 'O':
		     case 'U': i=1;
		     System.out.println(ch);
		     }
		     
		     }
			if(i==0)
				System.out.println("no vowels in string");
				
	}
}
