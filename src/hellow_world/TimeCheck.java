package hellow_world;

import java.util.Scanner;


public class TimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				System.out.println("시간을 입력하세요.");
				Scanner scann = new Scanner(System.in);
				
					int time  = scann.nextInt();
					int second =  time % 60 ; // 60으로 나눈 나머니는 초에 저장
					int minute = (time/60) % 60; // 입력된 초를 60초로 나눈 몫을 60으로 나눈 시산 
					int hour =  (time/60)/60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간 
				
					System.out.println(time+ "을 입력하셨어요");
					System.out.println(hour+" 시간");
					System.out.println(minute +"분");
					System.out.println(second + "초 입니다.");
				
				scann.close();
		
		
	}

}
