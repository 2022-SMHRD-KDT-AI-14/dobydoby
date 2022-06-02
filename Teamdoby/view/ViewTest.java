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
			System.out.print("정답을 입력하세요 >> ");
			String input = sc.next();
			if(ans.equals(input)) {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				String story = ("호오, 이 문제를 맞추다니 대단하군요!\n"
				+"보너스점수는 랜덤으로 획득됩니다.(최소1~최대5)\n"
				+"보너스점수를 얻으려면 Enter를 누르세요!");
								
				
				try {
					Thread.sleep(500);
					for(int i = 0; i< story.length(); i ++)
					{
						System.out.print(story.substring(0+i, i+1));
						Thread.sleep(10);
//						mp3.play(typing);  //타이핑 소리 bgm 실행
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
				System.out.println("보너스 점수를 획득하셨습니다.");
				Score++;}
				
				
								
			}
			else {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("아쉽게 틀렸군요, 센스를 좀더 기르는 노력을 하세요!");
			}
			System.out.println("현재 점수는 "+Score+"입니다");				
		}
		
		
				

	}

}
