package model;

public class Round {
	String name = "";
	String story = "";
	public void Round1(String name) {
		story=
		("[System]\r\n" + "(bgm�� �ٲ��) �̶� �� �տ��� ��ġ�� �� �������� ��Ÿ���µ�\n"
		+"[???]\r\n" + "�������� �ް� ������ �켱 ���� ���� ���� �̰ܾ� �ؿ�.\n"
		+"["+name+"]\r\n" + "ĳġ���ε� �ؿ�!!\n"
		+"[System] (�ʱ�)�ڹ� ���� �ڼ���(��)�� ��Ÿ����!!\r\n" + "[System] (�ʱ�)�ڹٸ��� �ڼ���(��)�� ���� ������ ���߼���.\r\n"
				+ "����� 3���̸� ����� ���� ���� �� �������� ���� �� �����ϴ�.");
		
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

	public void Round1_O(int k) {
		if (k == 0) {
			 story = ("[��������]\r\n" + "�׷��ݱ׷���(��������)");
		}
		if (k == 1) {
			story = ("[��������]\r\n" + "���ƿ����ƿ�(��������)");
		}
		if (k == 2) {
			story = ("[��������]\r\n" + "�������� ���� �ϳ� �˷� �帱�Կ�.");
		}
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
		
	public void Round1_X(int k) {
		if(k==0) {
		story = ("[��������]\r\n" + "�ҹ�� ���� ���ϴ�.");}
		if(k==1) {
		story = ("[��������]\r\n" + "�� ��ġ ������.");}
		if(k==2) {
		story = ("[��������]\r\n" + "��¥ ��ġ ��� ���ϴ�.");}
		
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
	
	public void Clear1() {
		story = ("[System] ����1 Ŭ����!!"
		+"[��������]\r\n" + "������ �����ϼ̾��.\r\n"
				+ "���� ���ְ� �弼��~");
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
	public void Round2(String name) {
		story = ("[???]\r\n"
				+ "�� ���� ���� �մϴ�. ��� ������ �÷��ּ���.\n"
		+"["+name+"]\r\n"
				+ "�� ���̽�ũ�� ���ּ���!!\n"
		+"[???]\r\n"
				+ "\"......!(����)\n"
		+"[System] (�߱�)DB���� �赿��(��)�� ��Ÿ����!!\r\n"
				+ "[System] (�߱�)DB���� �赿��(��)�� ���� ������ ���߼���.\r\n"
				+ "[System] ����� 3(life)���̸� ����� ���� ���� �� �������� ���� �� �����ϴ�.");
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
	public void Round2_O(int k) {
		if(k==0) {story = ("[��������]\r\n" + "�� �� ����� ������ �������?");}
		if(k==1) {story = ("[��������]\r\n" + "�̹� ������ ��¥ ������. �� ���� �ƴմϴ�.");}
		if(k==2) {story = ("[��������]\r\n" + "�� �˾Ƽ� ���θ� ������ �ؿԴٰ� �ϰ� ���� ������...");}
		if(k==3) {story = ("[��������]\r\n" + "���� ������ ������ ���ܳ����.");}
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
	public void Round2_X(int k) {
		if(k==0) {story = ("[��������]\r\n" + "�ָ��� ���θ� �ϳ��� �� �߰�...!!");}
		if(k==1) {story = ("[��������]\r\n" + "���� ��ź�� ����߰ڱ���.");}
		if(k==2) {story = ("[��������]\r\n" + "6���� ���� insert�� �ϰ� �;��?");}
		if(k==3) {story = ("[��������]\r\n" + "���� ��ź�� ����߰ڱ���.");}
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
	public void Clear2() {
		story = ("[System] ����2 Ŭ����!!"
		+"[��������]\r\n" + "�� ���� ����� ������ �������ϴ�.\r\n"
				+ "���� ���� �� �����ϴ�.\r\n"
				+ "�� ���� �� ���� �Ͼ����.");
		
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
	
	public void Round3(String name) {
		story = ("[???]\r\n"
				+ "�ڹٿ��� ������ �߰� �ϸ�...\r\n"
				+ "���� �� �� ���� �� Ʋ������ �ϸ鼭 �α� �ŷ���.\n"
				+"["+name+"]\r\n"
				+ "�������� �ƴϾ�...!!\n"
				+"[System] (���)�ڹٸ��� ����ȣ(��)�� ��Ÿ����!!\r\n"
				+ "[System] (���)�ڹٸ��� ����ȣ(��)�� ���� ������ ���߼���.\r\n"
				+ "����� 3(life)���̸� ����� ���� ���� �� �������� ���� �� �����ϴ�.");
				try {
					Thread.sleep(1000);
					for(int i = 0; i< story.length(); i ++)
					{
						System.out.print(story.substring(0+i, i+1));
						Thread.sleep(50);
//						mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
					}
					System.out.println();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public void Round3_O(int k) {
		if(k==0) {story = ("[��ȣ����]\r\n" + "���� �ڹ� ��մ�.");}
		if(k==1) {story =("[��ȣ����]\r\n" + "¥���ڡ��ܢ�");}
		if(k==2) {story = ("[��ȣ����]\r\n" + "���� �ڹ� ����.");}
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
	public void Round3_X(int k) {
		if(k==0) {story = ("[��ȣ����]\r\n" + "�� Ʋ������ �α� �Ÿ�����?");}
		if(k==1) {story = ("[��ȣ����]\r\n" + "��! �׸��� ���� 20�� �Դϴ�.");}
		if(k==2) {story = ("[��ȣ����]\r\n" + "���� �ڹ� ����.");}
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
	
	public void Clear3() {
		story = ("[System] ����3 Ŭ����!!"
				+ "[��ȣ����]\r\n"
				+ "���� �ڹ� ��մ�~\r\n"
				+ "���� JDBC ��մ�~\r\n"
				+ "(��ȣ������ �ٲ��� �ʾҴ�. �ڹ� ��մ� �߾� �Ÿ��� ������ �������.)");
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
