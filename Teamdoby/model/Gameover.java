package model;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Gameover {
	
	public void gameover() {
		
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		
		String bgm = ""; // BGM ��� ���� ��
		String typing = ""; // BGM Ÿ���� �Ҹ� ���� ��
		
//		mp3.play(bgm); BGM ����(�·��̰� ã���� ���� �� )
		
		String gameover	// ���� ���丮
		=("Game Over\n")
		+ ("���� �Ǵ��� ����ġ�� ���ϰ� �̰��� �������ϴ�."); // ���ǿ��� ���丮 ���� ��(����)
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< gameover.length(); i ++)
			{
				System.out.print(gameover.substring(0+i, i+1));
				Thread.sleep(100);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
