package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.BonusGame;
import model.Ending;
import model.Gameover;
import model.MusicVO;
import model.PrologDAO;
import model.RankDAO;
import model.Round;
import model.user_infoDAO;
import model.user_infoDTO;


public class View {

	public static void main(String[] args) {
		RankDAO rank = new RankDAO();
		MP3Player mp3 = new MP3Player();
		Round round = new Round();
		Gameover gameover = new Gameover();
		String name = "";
		Ending ending = new Ending();
		BonusGame bg = new BonusGame();
		int menu = 0;
		
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();

		String path = "C:/Users/smhrd/Desktop/mp3/music/";
		musicList.add(0,new MusicVO(path+"�α���ȭ��.mp3")); //0
		musicList.add(1,new MusicVO(path+"���ѷα�.mp3")); //1
		musicList.add(2,new MusicVO(path+"�ʱ�.mp3")); //2
		musicList.add(3,new MusicVO(path+"�߱�.mp3")); //3
		musicList.add(4,new MusicVO(path+"���.mp3")); //4
		musicList.add(5,new MusicVO(path+"���ǿ���.mp3")); //5
		musicList.add(6,new MusicVO(path+"���忣��.mp3")); //6
		musicList.add(7,new MusicVO(path+"���ӿ���.mp3")); //7
		musicList.add(8,new MusicVO(path+"�Ʊ�õ�������.mp3")); //8
		mp3.play(musicList.get(0).getPath());
		mp3.stop();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int log =0;
		int cnt = 0;
		int over = 0;
		int[]list = new int[3];
		int[]list2 = new int[4];
		int Score=0;
		int life =3;
		int end =0;
		
		String id=null; 
		String name2=null;
		String pw = null;
			
		
		while(true) {
		while(true) {
			mp3.stop();
			mp3.play(musicList.get(0).getPath());
			System.out.println("  ___    _____      _    _                     _              \r\n"
					+ " / _ \\  |_   _|    | |  | |                   (_)             \r\n"
					+ "/ /_\\ \\   | |      | |  | |  __ _  _ __  _ __  _   ___   _ __ \r\n"
					+ "|  _  |   | |      | |/\\| | / _` || '__|| '__|| | / _ \\ | '__|\r\n"
					+ "| | | |  _| |_     \\  /\\  /| (_| || |   | |   | || (_) || |   \r\n"
					+ "\\_| |_/  \\___/      \\/  \\/  \\__,_||_|   |_|   |_| \\___/ |_|   \r\n"
					+ "                                                              ");
			System.out.println(" ~ Team Doby ~\n");
			
			
			System.out.println("[1] �α���");
			System.out.println();
			System.out.println("[2] ȸ������");
			System.out.println();
			System.out.println("[3] ��ŷ");
			System.out.println();
			System.out.println("[4] ����");
			System.out.println();
			System.out.print(">> ");
			menu = sc.nextInt();
			
			if (menu==1) {	// �α���
				while (true) {
					
					System.out.print("ID >> ");
					id = sc.next();
					System.out.print("PW >> ");
					pw = sc.next();
					user_infoDTO dto = new user_infoDTO(id, pw);
					user_infoDAO dao = new user_infoDAO();
					dao.login(dto);
					name2 = dao.name_select(dto);
					
					
					if (dao.login(dto) == 1) {
						System.out.println("�α��� ����");
						break;
					}

					if (dao.login(dto) == 2) {
						System.out.println("�α��� ����");
						System.out.println("ID�� PW�� �ٽ� Ȯ�����ּ���");
					
					}
					}
				}
				
				// �α��� ���� ���� ����(���ѷα� ����)
				// ���ѷα�
				
				
			if(menu==2) {	// ȸ������
				System.out.println("==== ȸ������ ====");
				System.out.print("ID�� �Է����ּ��� >> ");
				id = sc.next();
				System.out.print("PW�� �Է����ּ��� >> ");
				pw = sc.next();
				System.out.print("NickName�� �Է����ּ��� >>");
				name = sc.next();
				
				user_infoDTO dto = new user_infoDTO(id, pw, name);
				user_infoDAO dao = new user_infoDAO();
				cnt = dao.insert(dto);
				if(cnt>0) {
					System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�.");
					System.out.println("Enter�� �����ּ���");
					sc.nextLine();
					sc.nextLine();
				}
				
				
			}
			if(menu==3) {	// ��ŷ
				System.out.println("����	�г���	���̵�	����");
				System.out.println("----------------------------");
				rank.rank_view();
				System.out.println("----------------------------");
				
				System.out.println("����ȭ������ ���÷��� Enter�� �����ּ���");
				sc.nextLine();
				sc.nextLine();
				
			}
			if(menu==4) {	// ����
				System.out.println("����Ǿ����ϴ�.");
				end++;
				break;
			}
			if(menu==1) {
				break;
			}
			
			}
			if(menu==4) break;
			
			
			
		
			while(true) {
				mp3.stop();
				mp3.play(musicList.get(1).getPath());
				
				System.out.println("Enter�� ������ ����˴ϴ�.");
				sc.nextLine();
				sc.nextLine();
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				
				PrologDAO dao = new PrologDAO();
				dao.real_name(name2);
				ending.real_name(name2);
				dao.prolog();
				break;
				
			}
				// ���� ���(�Ǻ�,����)
				// �ʱ� �Ǹ�
				
				
				Random r = new Random();
				model.True_answer ans = new model.True_answer();
				model.Quiz quiz = new model.Quiz();
				
				for(int k=0 ; k<3;k++) {
					list[k]=r.nextInt(10)+1;
					for(int k2=0 ; k2<k ;k2++) {
					if(list[k]==list[k2]) {
						k--;
						break;
					}
					}
				}
				for(int k=0 ; k<4;k++) {
					list2[k]=r.nextInt(10)+1;
					for(int k2=0 ; k2<k ;k2++) {
					if(list2[k]==list2[k2]) {
						k--;
						break;
					}
					}
				}
			
					
					
			while(end!=1) {
				mp3.stop();
				mp3.play(musicList.get(2).getPath());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round1(name2);
				System.out.println("Enter�� ���� �����ϼ���");
				sc.nextLine();
				life = 3;
				
				for (int i = 0; i < 3; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("����"+(i+1));
					quiz.QuizEasy(list[i]);
					ans.answer_easy(list[i]);
					System.out.print("������ �Է��ϼ��� >> ");
					String answer_easy = sc.next();
					
					if(answer_easy.equals(ans.answer_easy(list[i]))) {
						round.Round1_O(i);
						Score++;
						System.out.println("���� ������ "+Score+"�Դϴ�");
					}else {
						round.Round1_X(i);
						life--;
						System.out.println("���� ����� "+life+" ���ҽ��ϴ�.");
						System.out.println("���� ������ "+Score+"�Դϴ�");
						
					}
					
					if(bg.bonusevent()==1&&life>0) {
						mp3.stop();
						mp3.play(musicList.get(8).getPath());
						System.out.println("����(�ڹٿ���) : ������! ���ĵ弼��~");
						String ans1 = bg.bonusQuiz();
						System.out.print("������ �Է��ϼ��� >> ");
						String input = sc.next();
						if(ans1.equals(input)) {
							
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							
							String story = ("���� ������ �����ұ��?\n\n\n\n"
							+"���ʽ������� �������� ȹ��˴ϴ�.(�ּ�1~�ִ�5)\n"
							+"���ʽ������� �������� Enter�� ��������!");
											
							
							try {
								Thread.sleep(500);
								for(int k = 0; k< story.length(); k ++)
								{
									System.out.print(story.substring(0+k, k+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sc.nextLine();
							sc.nextLine();
															
							int bonusscore = r.nextInt(5)+1;
							
							for(int k = 0; k < bonusscore; k++) {
							story = ("���ʽ� ������ ȹ���ϼ̽��ϴ�.");
							try {
								Thread.sleep(500);
								for(int p = 0; p< story.length(); p ++)
								{
									System.out.print(story.substring(0+p, p+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								Score++;
								
							
							}catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							}
											
						}
						else {
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("������ �ٸ� �������� �غ��ҰԿ�...");
						}
						System.out.println("���� ������ "+Score+"�Դϴ�");
						mp3.stop();
						mp3.play(musicList.get(2).getPath());
					}
					
					
					
					

				}
				
				if(life<=0) {
					mp3.stop();
					mp3.play(musicList.get(6).getPath());
					ending.Bad_ED();
					
					
					System.out.println("Enter�� ������ �Ѿ�ϴ�.");
					sc.nextLine();
					sc.nextLine();
					
					ending.Epilogue_Bad();
					System.out.println("Enter�� ������ ����˴ϴ�.");
					sc.nextLine();
					mp3.stop();
					
					break;
				}
				
				round.Clear1();
				
				System.out.println();
				System.out.println("�������������� �Ѿ�ϴ�. Enter�� �����ּ���!");
				sc.nextLine();
				sc.nextLine();
				
				life = 3;
				// �߱� �Ǹ�
				mp3.stop();
				mp3.play(musicList.get(3).getPath());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round2(name2);
				System.out.println("Enter�� ���� �����ϼ���");
				sc.nextLine();
				
				
				for (int i = 0; i < 4; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("����"+(i+4));
					quiz.QuizNormal(list2[i]);
					ans.answer_normal(list2[i]);
					System.out.print("������ �Է��ϼ��� >> ");
					String answer_normal = sc.next();
					if(answer_normal.equals(ans.answer_normal(list2[i]))) {
						round.Round2_O(i);
						Score++;
						System.out.println("���� ������ "+Score+"�Դϴ�");
					}else {
						round.Round2_X(i);
						life--;
					System.out.println("���� ����� "+life+" ���ҽ��ϴ�.");
					System.out.println("���� ������ "+Score+"�Դϴ�");
					}
					if(life<=0) {
						gameover.gameover();
						break;
					}
					
					if(bg.bonusevent()==1&&life>0) {
						mp3.stop();
						mp3.play(musicList.get(8).getPath());
						System.out.println("����(�ڹٿ���) : ������! ���ĵ弼��~");
						String ans1 = bg.bonusQuiz();
						System.out.print("������ �Է��ϼ��� >> ");
						String input = sc.next();
						if(ans1.equals(input)) {
							
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							
							String story = ("���� ������ �����ұ��?\n\n\n\n"
							+"���ʽ������� �������� ȹ��˴ϴ�.(�ּ�1~�ִ�5)\n"
							+"���ʽ������� �������� Enter�� ��������!");
											
							
							try {
								Thread.sleep(500);
								for(int k = 0; k< story.length(); k ++)
								{
									System.out.print(story.substring(0+k, k+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sc.nextLine();
							sc.nextLine();
															
							int bonusscore = r.nextInt(5)+1;
							
							for(int k = 0; k < bonusscore; k++) {
							story = ("���ʽ� ������ ȹ���ϼ̽��ϴ�.");
							try {
								Thread.sleep(500);
								for(int p = 0; p< story.length(); p ++)
								{
									System.out.print(story.substring(0+p, p+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								Score++;
								
							
							}catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							}
											
						}
						else {
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("������ �ٸ� �������� �غ��ҰԿ�...");
						}
						System.out.println("���� ������ "+Score+"�Դϴ�");
						mp3.stop();
						mp3.play(musicList.get(3).getPath());
					}
					
				}
				if(life<=0) {
					mp3.stop();
					mp3.play(musicList.get(6).getPath());
					ending.Bad_ED();
					
					
					System.out.println("Enter�� ������ �Ѿ�ϴ�.");
					sc.nextLine();
					sc.nextLine();
					
					ending.Epilogue_Bad();
					System.out.println("Enter�� ������ ����˴ϴ�.");
					sc.nextLine();
					mp3.stop();
					
					break;

			}
				round.Clear2();
				
				System.out.println();
				System.out.println("�������������� �Ѿ�ϴ�. Enter�� �����ּ���!");
				sc.nextLine();
				sc.nextLine();
				mp3.stop();
				mp3.play(musicList.get(4).getPath());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round3(name2);
				System.out.println("Enter�� ���� �����ϼ���");
				sc.nextLine();
			
				
				
				life = 3;
				// ��� �Ǹ�
				for (int i = 0; i < 3; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.println("����"+(i+8));
					quiz.QuizHard(list[i]);
					ans.answer_hard(list[i]);
					System.out.print("������ �Է��ϼ��� >> ");
					String answer_hard = sc.next();
					if (answer_hard.equals(ans.answer_hard(list[i]))) {
						round.Round3_O(i);
						Score++;
						System.out.println("���� ������ "+Score+"�Դϴ�");
					}else {
						round.Round3_X(i);
						life--;
					System.out.println("���� ����� "+life+" ���ҽ��ϴ�.");
					System.out.println("���� ������ "+Score+"�Դϴ�");
					}
					
					if(bg.bonusevent()==1&&life>0) {
						mp3.stop();
						mp3.play(musicList.get(8).getPath());
						System.out.println("����(�ڹٿ���) : ������! ���ĵ弼��~");
						String ans1 = bg.bonusQuiz();
						System.out.print("������ �Է��ϼ��� >> ");
						String input = sc.next();
						if(ans1.equals(input)) {
							
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							
							String story = ("���� ������ �����ұ��?\n\n\n\n"
							+"���ʽ������� �������� ȹ��˴ϴ�.(�ּ�1~�ִ�5)\n"
							+"���ʽ������� �������� Enter�� ��������!");
											
							
							try {
								Thread.sleep(500);
								for(int k = 0; k< story.length(); k ++)
								{
									System.out.print(story.substring(0+k, k+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sc.nextLine();
							sc.nextLine();
															
							int bonusscore = r.nextInt(5)+1;
							
							for(int k = 0; k < bonusscore; k++) {
							story = ("���ʽ� ������ ȹ���ϼ̽��ϴ�.");
							try {
								Thread.sleep(500);
								for(int p = 0; p< story.length(); p ++)
								{
									System.out.print(story.substring(0+p, p+1));
									Thread.sleep(10);
//									mp3.play(typing);  //Ÿ���� �Ҹ� bgm ����
								}
								System.out.println();
								Score++;
								
							
							}catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							}
											
						}
						else {
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println("������ �ٸ� �������� �غ��ҰԿ�...");
						}
						System.out.println("���� ������ "+Score+"�Դϴ�");
						mp3.stop();
						mp3.play(musicList.get(4).getPath());
					}
				
				}
				if(life<=0) {
					mp3.stop();
					mp3.play(musicList.get(6).getPath());
					ending.Bad_ED();
					
					
					System.out.println("Enter�� ������ �Ѿ�ϴ�.");
					sc.nextLine();
					
					ending.Epilogue_Bad();
					System.out.println("Enter�� ������ ����˴ϴ�.");
					sc.nextLine();
					sc.nextLine();
					mp3.stop();
					
					break;}
				
					round.Clear3();
					


				life = 3;
			
				
				System.out.println("Enter�� ������ �Ѿ�ϴ�.");
				sc.nextLine();
				sc.nextLine();
				
				if(Score>=7) {
					rank.rank_save(name2, id, Score);
					mp3.stop();
					mp3.play(musicList.get(5).getPath());
					ending.Happy_ED();
					
					System.out.println("Enter�� ������ �Ѿ�ϴ�.");
					sc.nextLine();
					
					
					ending.Epilogue_Happy();
					System.out.println("����	�г���	���̵�	����");
					System.out.println("----------------------------");
					rank.rank_view();
					System.out.println("----------------------------");
					System.out.println("Enter�� ������ ����˴ϴ�.");
					sc.nextLine();
					mp3.stop();
					break;
					
				}else {
					mp3.stop();
					mp3.play(musicList.get(6).getPath());
					ending.Bad_ED();
					
					
					System.out.println("Enter�� ������ �Ѿ�ϴ�.");
					sc.nextLine();
					
					ending.Epilogue_Bad();
					System.out.println("Enter�� ������ ����˴ϴ�.");
					sc.nextLine();

					mp3.stop();
					
					break;
					
				}
			}
			
				
			}
			
				
			
	}
				
				
				
			
			
			
			
		}
		
	




