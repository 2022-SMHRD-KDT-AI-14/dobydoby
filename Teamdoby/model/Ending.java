package model;

public class Ending {
	
	
	
	String name="";
	String story="";
	
	public void real_name(String name) {
		this.name=name;
	}
	
	public void Happy_ED() {
		story = ("[System] �����մϴ� 3���� ���հ��� �ο򿡼� �¸��Ͽ����ϴ�!\n"
		+"[����(�ڹٿ���)]\r\n" + "�����ؿ�. �̰� "+name+"���� 6�������� ������ ����ߴٴ� ����� �������̿���!\n"
		+"[System] �����մϴ� ����� �������� �޾ҽ��ϴ�!\n"
		);
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(10);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// EpilogDAO 16��
	
	public void Epilogue_Happy() {
		story = ("�׷��� "+name+"�� ������ �������� ���� �� �־���.\r\n"
				+name+"�� ����� ���� ù ���� ����� �����ߴ�.\r\n"
				+ "������ ���� ���� ������ �ʾҴ�.\r\n"
				+ "���δ� ���� ������ �ؾ� �Ѵ�.\r\n"
				+ "�� ���� ȯ��� ���� �޿��� ���� �� �ִ� ��� ������ ���� ���� �����!�� ��� �ȴ�.\n"
				+ "==== �� ====");
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(10);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// EpilogDAO 34��

	public void Bad_ED() {
		story = ("[System] �̼� ����!!!\n"
		+"[System] ���տ��� �����ϴ�. \n"
		+"[System] ����� ���� 6%�� ���������ϴ�.\n"
		+"[System] ����� �̹��� �ɻ翡�� ������ �̹��� ������ 318,000���� ���� �ݳ� �˴ϴ�.\n"
		+"[System] ����� �������̰� �Ǿ����ϴ�.\n"
		+"[System] �� ��� ��忡���� ����� ��� �������� �ʽ��ϴ�.");
		
		try {
			Thread.sleep(1000);
			for(int i = 0; i< story.length(); i ++)
			{
				System.out.print(story.substring(0+i, i+1));
				Thread.sleep(10);
//				mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
			}
			System.out.println();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Gameover 19��

	public void Epilogue_Bad() {
		story = (name+"�� ����� ���� �̼��� ���� �Ͽ���. �׷���, �׷���. �г���(��)�� ���� 6%�� �������� ���Ҵ�.\r\n"
				+ "���п� �̹��� �ɻ翡�� ������ ������ 318,000���� ���� �ݳ� ���ϰ� �ȴ�.\r\n"
				+ "�������̰� �� ���� ����� ���õ���� �������� �� ������ ���� �ϳ� ���� ��縦 ��� �������� �ʾҴ�. \r\n"
				+ "�г���(��)�� ������ �ֿ����� ��ư���. ������ ���� ���� ����.\r\n"
				+ "���ڿ� ��ε�...\n"
				+ "==== �� ====");
				
				try {
					Thread.sleep(1000);
					for(int i = 0; i< story.length(); i ++)
					{
						System.out.print(story.substring(0+i, i+1));
						Thread.sleep(10);
//						mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
					}
					System.out.println();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	// Gameover 19�� �̾
}
