package model;

import javazoom.jl.player.MP3Player;

public class PrologDAO {
	
	String name=null;
	public void real_name(String name){
		this.name=name;
	}
	
	public void prolog() {
		
		
		MP3Player mp3 = new MP3Player();
		
		String bgm = ""; // BGM 경로 넣을 것
		String typing = ""; // BGM 타이핑 소리 넣을 것
		
//		mp3.play(bgm); BGM 실행(승록이가 찾으면 넣을 것 )
		
		String story
		= ("옛날 용사로 취업하기 위해 6개월 동안 갖은 고통을 감내한 용사 "+name+".\r\n"
				+ "그는 마지막 6개월이 되는 날 급작스럽게 용사 수련의 증표인 수료증을 받을 수 없다는 소식을 듣게 되는데...\r\n\n"
				+ "\"[???]\\r\\n\""
				+ "				안녕하세요?\n"
				+ "["+name+"]\r\n"
				+ "누구세요?\n"
				+"[용현(자바요정)]\r\n"
				+ "저는 자바 요정 용현이라고 해요.\r\n"
				+ "안타깝게도 닉네임 씨는 용사의 증명인 수료증을 받을 수 없게 되었어요.\n"
				+"["+name+"]\r\n"
				+ "왜죠?? 제가 얼마나 6개월 동안 고생을 해왔는데!\n"
				+"[용현(자바요정)]\r\n"
				+ "사실 용사의 증명을 얻기 위해서는 마지막 관문이 남아 있어요.\r\n"
				+ "바로 3대 마왕을 물리쳐야 해요."
				+"\r\n"
				+ "["+name+"]\r\n"
				+ "마왕이라니 6개월동안 QR만 꾸준히 찍으면 되는 게 아니었나요??\n"
				+"[용현(자바요정)]\r\n"
				+ "안!대요! 진실의 방은 피할 수 있었겠지만 취업은 그냥 되는 게 아니예요!\n"
				+"["+name+"]\r\n"
						+ "손나...!! 바카나...!!");
			
				
		
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(10);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
