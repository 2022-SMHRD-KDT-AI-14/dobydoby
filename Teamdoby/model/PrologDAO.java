package model;

import javazoom.jl.player.MP3Player;

public class PrologDAO {
	
	String name=null;
	public void real_name(String name){
		this.name=name;
	}
	
	public void prolog() {
		
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = ""; // BGM ��� ���� ��
		String typing = ""; // BGM Ÿ���� �Ҹ� ���� ��
		
//		mp3.play(bgm); BGM ����(�·��̰� ã���� ���� �� )
		
		String story
		= ("���� ���� ����ϱ� ���� 6���� ���� ���� ������ ������ ��� "+name+".\n"
				+ "�״� ������ 6������ �Ǵ� �� ���۽����� ��� ������ ��ǥ�� �������� ���� �� ���ٴ� �ҽ��� ��� �Ǵµ�...\n\n"
				+"[???]\n"
				+ "�ȳ��ϼ���?\n\n"
				+"["+name+"]\n"
				+ "��������?\n\n"
				+"[����(�ڹٿ���)]\n"
				+ "���� �ڹ� ���� �����̶�� �ؿ�.\n"
				+ "��Ÿ���Ե� �г��� ���� ����� ������ �������� ���� �� ���� �Ǿ����.\n\n"
				+"["+name+"]\n"
				+ "����?? ���� �󸶳� 6���� ���� ����� �ؿԴµ�!\n\n"
				+"[����(�ڹٿ���)]\n"
				+ "��� ����� ������ ��� ���ؼ��� ������ ������ ���� �־��.\n"
				+ "�ٷ� 3�� ������ �����ľ� �ؿ�.\n\n"
				+ "["+name+"]\n"
				+ "�����̶�� 6�������� QR�� ������ ������ �Ǵ� �� �ƴϾ�����??\n\n"
				+"[����(�ڹٿ���)]\n"
				+ "�Ȣִ����! ������ ���� ���� �� �־������� ����� �׳� �Ǵ� �� �ƴϿ���!\n\n"
				+"["+name+"]\n"
				+ "�ճ�...!! ��ī��...!!");
			
				
		
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(50);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
