package view;

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
