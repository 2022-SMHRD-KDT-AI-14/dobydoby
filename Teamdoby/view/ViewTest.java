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
			System.out.print("������ �Է��ϼ��� >> ");
			String input = sc.next();
			System.out.println(ans);
			if(ans.equals(input)) {
				System.out.println("������ ȹ���ϼ̽��ϴ�.");
				Score++;
								
			}
			System.out.println(Score);						
		}
		
		
				

	}

}
