package hellow_world;

import java.util.*;

public class Helloworld {  // 클래스 단위로 이루어져 있다

	public static int sum (int a , int b) {
		
		int sum ;
		
		sum = a+b;
		
		return sum;
		
				
		
	}
	
	
	
	// 메인 함수에서 실행 시작
	// 함수를 메소드라고 한다. 메소드는 소문자로 시작해야 한다. ㅠㅎㅎㅎㅎ
	// 특수문자 숫자는 안된다.  
	
	public static void main(String[] args) {
		
	//public  ->  다른 class 에서 접근 가능하게 설정하겠다는 선언 , 반대는 private 
		
    //static  -> 전역 변수 사용  
		
	// 	

		
	//void main(String[] args) {		
		
		// TODO Auto-generated method stub
		
		int i = 10, j= 20;
		int s;
		
		//final int PI = 0;
		
		//PI =1; // final 은 재정의될수 없다 
		
		
	   String str = "korea";  //클래스이기 때문에 대문자로 시작 
		
		
		s= sum(i,j);
		
	   System.out.println(s);  // 자동으로 줄바꿈 
	   System.out.println("s 값은 "  + s +  " 입니다");  // 자동으로 줄바꿈 	   
	   System.out.println("HelloWorld");//
	   System.out.println(str);//
	   
       
	   
	   System.out.println("당신의 이름은 입력하세요.");
	   
	   	   
	   Scanner scanner = new Scanner(System.in);
       
	   String name = scanner.next();   // next() 은 문자열만 입력 받음 
	   
	   System.out.println("당신은 " + name + "을 입력하셨어요.");
		
	   
	   
	   System.out.println("나이를 입력하세요.");
	   int age = scanner.nextInt();
	   System.out.println("당신의 나이는 " + age + " 입니다.");
	
	   
	   
	   System.out.println("당신의 키를 입력하세요.");
	   double height = scanner.nextDouble();
	   System.out.println("당신의 나이는 " + height + " 입니다.");
	   
	   
	   scanner.close();
	//System.out.println("HelloWorld!!");

	}

}
