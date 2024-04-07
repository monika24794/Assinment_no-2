package assignment;

public class Sorting {

	public static void main(String[] args) {
  
	       int [] arr = new int [] {1,90,34,89,7,9}; 
	       int temp = 0; 

	       for (int i = 0; i < arr.length; i++) { 
	           for (int j = i+1; j < arr.length; j++) { 
	        	   if(arr[i] > arr[j]) { 
	                 temp = arr[i]; 
	                 arr[i] = arr[j]; 
	                 arr[j] = temp; 
	              } 
	           } 
	       } 

	    for (int i = 0; i < arr.length/2; i++) { 
	     System.out.print(arr[i] + " "); 
	   } 
	    for (int i = arr.length-1 ; i >= arr.length/2; i--) { 
		     System.out.print(arr[i] + " "); 
		   } 
	  } 
	}