package model;

import javazoom.jl.player.MP3Player;

public class EpilogDAO {
	
	public void epilog() {
	
	MP3Player mp3 = new MP3Player();
	
	String bgm = ""; // BGM ��� ���� ��
	String typing = ""; // BGM Ÿ���� �Ҹ� ���� ��
	
//	mp3.play(bgm); BGM ����(�·��̰� ã���� ���� �� )
	
	String happyending	// ���� ���丮
	=("���� �Ǵ���� �����ƴ�.\n")
	+ ("�� �̸��� ���� ���翡 ������ ������ ��������"); // ���ǿ��� ���丮 ���� ��(����)
	
	try {
		Thread.sleep(1000);
		for(int i = 0; i< happyending.length(); i ++)
		{
			System.out.print(happyending.substring(0+i, i+1));
			Thread.sleep(200);
//			mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
		}
		System.out.println();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}System.out.println("**�� ������ **���Դϴ�!"); // ���� ǥ��
}
}
