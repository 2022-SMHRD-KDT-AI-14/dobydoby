package model;

import javazoom.jl.player.MP3Player;

public class PrologDAO {
	
	public void prolog() {
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = ""; // BGM 경로 넣을 것
		String typing = ""; // BGM 타이핑 소리 넣을 것
		
//		mp3.play(bgm); BGM 실행(승록이가 찾으면 넣을 것 )
		
		String story
		=("옛날 옛적 Java로 사람을 괴롭히는 악당들이 있었다.\n")
		+ ("악당들의 괴롭힘을 견디지 못한 백성들은 악당들을 물리칠 용사를 기다리고 있었는데..."); // 출력될 스토리 넣을 것(윤주)
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(200);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
