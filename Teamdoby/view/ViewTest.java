package view;

import java.util.Scanner;

import model.BonusGame;
import model.RankDAO;

public class ViewTest {

	public static void main(String[] args) {
		
		int Score = 0;
		RankDAO r = new RankDAO();
		Scanner sc = new Scanner(System.in);
		
		BonusGame bg = new BonusGame();
		
	
		if(bg.bonusevent()==1) {
			String ans = bg.bonusQuiz();
			System.out.print("정답을 입력하세요 >> ");
			String input = sc.next();
			System.out.println(ans);
			if(ans.equals(input)) {
				System.out.println("점수를 획득하셨습니다.");
				Score++;
								
			}
			System.out.println(Score);						
		}
		
		
				

	}

}
