package hellow_world;

import java.util.Scanner;


public class TimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				System.out.println("�ð��� �Է��ϼ���.");
				Scanner scann = new Scanner(System.in);
				
					int time  = scann.nextInt();
					int second =  time % 60 ; // 60���� ���� ���Ӵϴ� �ʿ� ����
					int minute = (time/60) % 60; // �Էµ� �ʸ� 60�ʷ� ���� ���� 60���� ���� �û� 
					int hour =  (time/60)/60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð� 
				
					System.out.println(time+ "�� �Է��ϼ̾��");
					System.out.println(hour+" �ð�");
					System.out.println(minute +"��");
					System.out.println(second + "�� �Դϴ�.");
				
				scann.close();
		
		
	}

}
