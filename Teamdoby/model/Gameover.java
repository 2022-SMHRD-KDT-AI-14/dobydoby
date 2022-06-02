package model;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Gameover {
	
	public void gameover() {
		
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		
		String bgm = ""; // BGM 경로 넣을 것
		String typing = ""; // BGM 타이핑 소리 넣을 것
		
//		mp3.play(bgm); BGM 실행(승록이가 찾으면 넣을 것 )
		
		String gameover	// 엔딩 스토리
		=("Game Over\n")
		+ ("용사는 악당을 물리치지 못하고 이곳에 잠들었습니다."); // 해피엔딩 스토리 넣을 것(윤주)
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< gameover.length(); i ++)
			{
				System.out.print(gameover.substring(0+i, i+1));
				Thread.sleep(100);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
