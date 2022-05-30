package view;

import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.PrologDAO;
import model.user_infoDAO;
import model.user_infoDTO;


public class View {

	public static void main(String[] args) {
		
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		
		int log =0;
		int cnt = 0;
		
		while(true) {
			
			System.out.println("[1] �α���");
			System.out.println();
			System.out.println("[2] ȸ������");
			System.out.println();
			System.out.println("[3] ��ŷ");
			System.out.println();
			System.out.println("[4] ����");
			System.out.println();
			System.out.print(">> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {	// �α���
				while (true) {
					System.out.print("ID >> ");
					String id = sc.next();
					System.out.print("PW >> ");
					String pw = sc.next();
					user_infoDTO dto = new user_infoDTO(id, pw);
					user_infoDAO dao = new user_infoDAO();
					dao.login(dto);
					
					
					if (dao.login(dto) == 1) {
						System.out.println("�α��� ����");
						break;
					}

					if (dao.login(dto) == 2) {
						System.out.println("�α��� ����");
					}
				}
				// �α��� ���� ���� ����(���ѷα� ����)
				// ���ѷα�
			
				
				System.out.println("Enter�� ������ ����˴ϴ�.");
				String enter = sc.nextLine();
				
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
				dao.prolog();
				
				
				// ���� ���(�Ǻ󿵿�)
				// �ʱ� �Ǹ�
				int[]list = new int[3];
				int[]list2 = new int[4];
				int Score=0;
				int life =3;
				
				Random r = new Random();
				model.True_answer ans = new model.True_answer();
				model.Quiz quiz = new model.Quiz();
				
				for(int k=0 ; k<3;k++) {
					list[k]=	r.nextInt(5)+1;
					for(int k2=0 ; k2<k ;k2++) {
					if(list[k]==list[k2]) {
						k--;
					}
					
			for(int  j = 0 ; j<1 ;j++) {	
				for (int i = 0; i < 3; i++) {
				
					quiz.QuizEasy(list[i]);
					ans.answer_number(list[i]);
					System.out.print("������ �Է��ϼ��� >> ");
					String answer_easy = sc.next();
					
					if(answer_easy.equals(ans.answer_easy())) {
						Score++;
					}else {
						life--;
					}

				}if(life<=0) {
					System.out.println("GAME OVER");
					break;
				}
				life = 3;
				// �߱� �Ǹ�
				for (int i = 0; i < 4; i++) {
					
					
						quiz.QuizNormal(list[i]);
						ans.answer_number(list[i]);
					System.out.println("������ �Է��ϼ��� >> ");
					String answer_normal = sc.next();
					if(answer_normal.equals(ans.answer_normal())) {
						Score++;
					}

				}if(life<=0) {
					System.out.println("GAME OVER");
					break;
				}
				life = 3;
				// ��� �Ǹ�
				for (int i = 0; i < 3; i++) {
				
					
						
						quiz.QuizHard(list[i]);
						ans.answer_number(list[i]);
					System.out.println("������ �Է��ϼ��� >> ");
					String answer_hard = sc.next();
					if(answer_hard.equals(ans.answer_hard())) {
						Score++;
					}

				}
				if(Score>=7) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
			}
			}

				}
				
				
				
				
				
			}
			
			if(menu==2) {	// ȸ������
				System.out.println("==== ȸ������ ====");
				System.out.print("ID�� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.print("PW�� �Է����ּ��� >> ");
				String pw = sc.next();
				System.out.print("NickName�� �Է����ּ��� >>");
				String name = sc.next();
				
				user_infoDTO dto = new user_infoDTO(id, pw, name);
				user_infoDAO dao = new user_infoDAO();
				cnt = dao.insert(dto);
				if(cnt>0) {
					System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�.");
				}
				
				
			}
			if(menu==3) {	// ��ŷ
				
				
			}
			if(menu==4) {	// ����
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
		}
		
		

	}

}
