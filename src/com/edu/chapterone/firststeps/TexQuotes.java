package com.edu.chapterone.firststeps;

import java.io.*;
import java.util.*;
public class TexQuotes{
	public static void main(String[] args) {

		System.out.print("What is your address? ");

		// Get the user input		
		Scanner s = new Scanner(System.in);

		// declare the BufferedReader Class
    	//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		BufferedReader reader = new BufferedReader(new StringReader(s.nextLine()));

		boolean flag = false;
		// catch the possible IOException by the readLine() method
		try {

			// check if stream is ready to be read			
			while(flag = reader.ready() && reader.readLine() != null){
				System.out.println(flag);
				System.out.println(reader.readLine());

				/*
				if( reader.readLine() == null ) reader.close(); 
				// print the text read by the BufferedReader
				System.out.println("String read from console input:" + reader.readLine());	
				flag = reader.ready();*/
				
			}

			// close the BufferedReader object
			s.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
