package model;

public class Ending {
	
	
	
	String name="";
	String story="";
	
	public void real_name(String name) {
		this.name=name;
	}
	
	public void Happy_ED() {
		story = ("[System] 축하합니다 3명의 마왕과의 싸움에서 승리하였습니다!\n"
		+"[용현(자바요정)]\r\n" + "축하해요. 이건 "+name+"씨가 6개월동안 열심히 노력했다는 용사의 수료증이에요!\n"
		+"[System] 축하합니다 용사의 수료증을 받았습니다!\n"
		);
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(50);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// EpilogDAO 16번
	
	public void Epilogue_Happy() {
		story = ("그렇게 "+name+"는 무사히 수료증을 받을 수 있었다.\r\n"
				+name+"는 취업을 위한 첫 발을 내딛기 시작했다.\r\n"
				+ "하지만 그의 고난은 끝나지 않았다.\r\n"
				+ "공부는 죽을 때까지 해야 한다.\r\n"
				+ "더 좋은 환경과 높은 급여를 받을 수 있는 길드 이직을 위해 그의 스펙업!은 계속 된다.\n"
				+ "==== 끝 ====");
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(50);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// EpilogDAO 34번

	public void Bad_ED() {
		story = ("[System] 이수 실패!!!\n"
		+"[System] 마왕에게 졌습니다. \n"
		+"[System] 당신은 하위 6%로 떨어졌습니다.\n"
		+"[System] 당신은 이번달 심사에서 떨어져 이번달 지원급 318,000원이 강제 반납 됩니다.\n"
		+"[System] 당신은 빈털털이가 되었습니다.\n"
		+"[System] 그 어느 길드에서도 당신의 취업 시켜주지 않습니다.");
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(50);
//				mp3.play(typing);  //타이핑 소리 bgm 실행
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Gameover 19번

	public void Epilogue_Bad() {
		story = (name+"는 용사의 수련 이수에 실패 하였다. 그렇다, 그렇다. "+name+"(은)는 하위 6%로 떨어지고 말았다.\r\n"
				+ "덕분에 이번달 심사에서 떨어져 지원금 318,000원을 강제 반납 당하게 된다.\r\n"
				+ "빈털털이가 된 용사는 길드몬과 길드천국을 떠돌지만 그 누구도 스펙 하나 없는 용사를 취업 시켜주지 않았다. \r\n"
				+ name+"(은)는 폐지를 주워가며 살아간다. 오늘은 유독 날이 차다.\r\n"
				+ "잘자요 모두들...\n"
				+ "==== 끝 ====");
				
				try {
					Thread.sleep(1000);
					for(int i = 0; i< story.length(); i ++)
					{
						System.out.print(story.substring(0+i, i+1));
						Thread.sleep(50);
//						mp3.play(typing);  //타이핑 소리 bgm 실행
					}
					System.out.println();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	// Gameover 19번 이어서
}
