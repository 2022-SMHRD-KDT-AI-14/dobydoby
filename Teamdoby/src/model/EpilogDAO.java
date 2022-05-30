package model;

import javazoom.jl.player.MP3Player;

public class EpilogDAO {
	
	public void epilog() {
	
	MP3Player mp3 = new MP3Player();
	
	String bgm = ""; // BGM 경로 넣을 것
	String typing = ""; // BGM 타이핑 소리 넣을 것
	
//	mp3.play(bgm); BGM 실행(승록이가 찾으면 넣을 것 )
	
	String happyending	// 엔딩 스토리
	=("용사는 악당들을 물리쳤다.\n")
	+ ("그 이름은 명예의 전당에 새겨져 영원히 남으리라"); // 해피엔딩 스토리 넣을 것(윤주)
	
	try {
		Thread.sleep(1000);
		for(int i = 0; i< happyending.length(); i ++)
		{
			System.out.print(happyending.substring(0+i, i+1));
			Thread.sleep(200);
//			mp3.play(typing);  //타이핑 소리 bgm 실행
		}
		System.out.println();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}System.out.println("**의 점수는 **점입니다!"); // 점수 표시
}
}
