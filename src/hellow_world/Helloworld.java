package hellow_world;

import java.util.*;

public class Helloworld {  // Ŭ���� ������ �̷���� �ִ�

	public static int sum (int a , int b) {
		
		int sum ;
		
		sum = a+b;
		
		return sum;
		
				
		
	}
	
	
	
	// ���� �Լ����� ���� ����
	// �Լ��� �޼ҵ��� �Ѵ�. �޼ҵ�� �ҹ��ڷ� �����ؾ� �Ѵ�. �Ф�������
	// Ư������ ���ڴ� �ȵȴ�.  
	
	public static void main(String[] args) {
		
	//public  ->  �ٸ� class ���� ���� �����ϰ� �����ϰڴٴ� ���� , �ݴ�� private 
		
    //static  -> ���� ���� ���  
		
	// 	

		
	//void main(String[] args) {		
		
		// TODO Auto-generated method stub
		
		int i = 10, j= 20;
		int s;
		
		//final int PI = 0;
		
		//PI =1; // final �� �����ǵɼ� ���� 
		
		
	   String str = "korea";  //Ŭ�����̱� ������ �빮�ڷ� ���� 
		
		
		s= sum(i,j);
		
	   System.out.println(s);  // �ڵ����� �ٹٲ� 
	   System.out.println("s ���� "  + s +  " �Դϴ�");  // �ڵ����� �ٹٲ� 	   
	   System.out.println("HelloWorld");//
	   System.out.println(str);//
	   
       
	   
	   System.out.println("����� �̸��� �Է��ϼ���.");
	   
	   	   
	   Scanner scanner = new Scanner(System.in);
       
	   String name = scanner.next();   // next() �� ���ڿ��� �Է� ���� 
	   
	   System.out.println("����� " + name + "�� �Է��ϼ̾��.");
		
	   
	   
	   System.out.println("���̸� �Է��ϼ���.");
	   int age = scanner.nextInt();
	   System.out.println("����� ���̴� " + age + " �Դϴ�.");
	
	   
	   
	   System.out.println("����� Ű�� �Է��ϼ���.");
	   double height = scanner.nextDouble();
	   System.out.println("����� ���̴� " + height + " �Դϴ�.");
	   
	   
	   scanner.close();
	//System.out.println("HelloWorld!!");

	}

}
