package hellow_world;

import java.util.Scanner;


// 110 페이지 2번 실습
// 1. 두자리의 정수를 입력받고 10의 자리와 1의 자리가 같으면 Yes, 다르면 No


public class IfTest {
	
	
	public static void main(String[] args) {
		
		
	      System.out.println("두자리수 정수를 입력해주세요.");
		  
	      Scanner scann = new Scanner(System.in);
	      
	      int num = scann.nextInt();
	      
	 
	      
	      if (num < 10 || num > 100)
	      {
		    	  System.out.println("입력 범위 밖입니다.");
		    	  
		    	  //break; 
	    	  
	      }else{
	    	  
			    	  int fNum = num/10; // 10의 자리 
			    	  int sNum = num%10; // 1의 자리 
	    	  
	    	  
			           if(sNum == fNum) {
			        	   			        	  
			        	  System.out.println("Yes!");
			        	   
			           }else {
			        	   
			        	   System.out.println("No");
			        	   
			           }    
	    	  
	    	  
	    	  
	      } 

	      
	      	scann.close();
	      
		
	}

}
