package view;

import java.util.Random;
import java.util.Scanner;

import model.BonusGame;
import model.RankDAO;

public class ViewTest {

	public static void main(String[] args) {
		
		int Score = 0;
		RankDAO r = new RankDAO();
		Scanner sc = new Scanner(System.in);
		Random r2 = new Random();
		
		BonusGame bg = new BonusGame();
		
	
		if(bg.bonusevent()==1) {
			String ans = bg.bonusQuiz();
			System.out.print("������ �Է��ϼ��� >> ");
			String input = sc.next();
			if(ans.equals(input)) {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				String story = ("ȣ��, �� ������ ���ߴٴ� ����ϱ���!\n"
				+"���ʽ������� �������� ȹ��˴ϴ�.(�ּ�1~�ִ�5)\n"
				+"���ʽ������� �������� Enter�� ��������!");
								
				
				try {
					Thread.sleep(500);
					for(int i = 0; i< story.length(); i ++)
					{
						System.out.print(story.substring(0+i, i+1));
						Thread.sleep(10);
//						mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
					}
					System.out.println();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sc.nextLine();
				sc.nextLine();
												
				int bonusscore = r2.nextInt(5)+1;
				
				for(int i = 0; i < bonusscore; i++) {
				System.out.println("���ʽ� ������ ȹ���ϼ̽��ϴ�.");
				Score++;}
				
				
								
			}
			else {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("�ƽ��� Ʋ�ȱ���, ������ ���� �⸣�� ����� �ϼ���!");
			}
			System.out.println("���� ������ "+Score+"�Դϴ�");				
		}
		
		
				

	}

}
