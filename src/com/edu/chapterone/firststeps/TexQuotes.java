package com.edu.chapterone.firststeps;

import java.io.*;
import java.util.*;
public class TexQuotes{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //leer la primera
	    
	    String dato;
	    String dataOut;
	    StringBuilder dataBuild = new StringBuilder();
	    boolean isLeft = true;
	    while( ( dato =  br.readLine()) != null) {
	    	char[] chars = dato.toCharArray();
	    	for(char ch: chars) {
	    		
	    		if(ch != '\"') {
	    			dataBuild.append(ch);
	    		}
	    		else { 
	    			if(isLeft) {
	    			dataBuild.append('`').append('`');
	    			isLeft = false;
	    		}else {
	    			dataBuild.append("'").append("'");
	    		}
	    			}
	    		
	    		
	    		/*
	    		(ch == '\"') ? 
	    				dataBuild.append(dato) :
	    				isLeft ? ( dataBuild.append('``') :*/ 
	    				
	    	}
	    	dato = dataBuild.toString();
	    	
	    	System.out.println(dato);
	    }
	  
	}
}
