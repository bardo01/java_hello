package hellow_world;

import java.util.Scanner;


// 110 ������ 2�� �ǽ�
// 1. ���ڸ��� ������ �Է¹ް� 10�� �ڸ��� 1�� �ڸ��� ������ Yes, �ٸ��� No


public class IfTest {
	
	
	public static void main(String[] args) {
		
		
	      System.out.println("���ڸ��� ������ �Է����ּ���.");
		  
	      Scanner scann = new Scanner(System.in);
	      
	      int num = scann.nextInt();
	      
	 
	      
	      if (num < 10 || num > 100)
	      {
		    	  System.out.println("�Է� ���� ���Դϴ�.");
		    	  
		    	  //break; 
	    	  
	      }else{
	    	  
			    	  int fNum = num/10; // 10�� �ڸ� 
			    	  int sNum = num%10; // 1�� �ڸ� 
	    	  
	    	  
			           if(sNum == fNum) {
			        	   			        	  
			        	  System.out.println("Yes!");
			        	   
			           }else {
			        	   
			        	   System.out.println("No");
			        	   
			           }    
	    	  
	    	  
	    	  
	      } 

	      
	      	scann.close();
	      
		
	}

}
