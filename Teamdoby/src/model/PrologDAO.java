package model;

import javazoom.jl.player.MP3Player;

public class PrologDAO {
	
	public void prolog() {
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = ""; // BGM ��� ���� ��
		String typing = ""; // BGM Ÿ���� �Ҹ� ���� ��
		
//		mp3.play(bgm); BGM ����(�·��̰� ã���� ���� �� )
		
		String story
		=("���� ���� Java�� ����� �������� �Ǵ���� �־���.\n")
		+ ("�Ǵ���� �������� �ߵ��� ���� �鼺���� �Ǵ���� ����ĥ ��縦 ��ٸ��� �־��µ�..."); // ��µ� ���丮 ���� ��(����)
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(200);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
