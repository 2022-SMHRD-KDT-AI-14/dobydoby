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
		int over = 0;
		int[]list = new int[3];
		int[]list2 = new int[4];
		int Score=0;
		int life =3;
		int end =0;
		
		
			while(true) {
			System.out.println("[1] 로그인");
			System.out.println();
			System.out.println("[2] 회원가입");
			System.out.println();
			System.out.println("[3] 랭킹");
			System.out.println();
			System.out.println("[4] 종료");
			System.out.println();
			System.out.print(">> ");
			int menu = sc.nextInt();
			
			if (menu == 1) {	// 로그인
				while (true) {
					System.out.print("ID >> ");
					String id = sc.next();
					System.out.print("PW >> ");
					String pw = sc.next();
					user_infoDTO dto = new user_infoDTO(id, pw);
					user_infoDAO dao = new user_infoDAO();
					dao.login(dto);
					
					
					if (dao.login(dto) == 1) {
						System.out.println("로그인 성공");
						break;
					}

					if (dao.login(dto) == 2) {
						System.out.println("로그인 실패");
					}
				}
				// 로그인 이후 게임 실행(프롤로그 진입)
				// 프롤로그
			
				
				System.out.println("Enter를 누르면 진행됩니다.");
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
				dao.prolog();
				break;
			}
			if(menu==2) {	// 회원가입
				System.out.println("==== 회원가입 ====");
				System.out.print("ID를 입력해주세요 >> ");
				String id = sc.next();
				System.out.print("PW를 입력해주세요 >> ");
				String pw = sc.next();
				System.out.print("NickName을 입력해주세요 >>");
				String name = sc.next();
				
				user_infoDTO dto = new user_infoDTO(id, pw, name);
				user_infoDAO dao = new user_infoDAO();
				cnt = dao.insert(dto);
				if(cnt>0) {
					System.out.println("회원가입에 성공하셨습니다.");
				}
				
				
			}
			if(menu==3) {	// 랭킹
				
				
			}
			if(menu==4) {	// 종료
				System.out.println("종료되었습니다.");
				end++;
			}
			}
				// 문제 출력(건빈영역)
				// 초급 악마
				
				
				Random r = new Random();
				model.True_answer ans = new model.True_answer();
				model.Quiz quiz = new model.Quiz();
				
				for(int k=0 ; k<3;k++) {
					list[k]=r.nextInt(5)+1;
					for(int k2=0 ; k2<k ;k2++) {
					if(list[k]==list[k2]) {
						k--;
						break;
					}
					}
				}
				for(int k=0 ; k<3;k++) {
					list2[k]=r.nextInt(5)+1;
					for(int k2=0 ; k2<k ;k2++) {
					if(list2[k]==list2[k2]) {
						k--;
						break;
					}
					}
				}
			
					
					
			while(end!=1) {
				
				for (int i = 0; i < 3; i++) {
					
					quiz.QuizEasy(list[i]);
					ans.answer_easy(list[i]);
					System.out.print("정답을 입력하세요 >> ");
					String answer_easy = sc.next();
					
					if(answer_easy.equals(ans.answer_easy(list[i]))) {
						Score++;
						System.out.println("현재 점수는 "+Score+"입니다");
					}else {
						life--;
						System.out.println("현재 목숨음 "+life+" 남았습니다.");
						System.out.println("현재 점수는 "+Score+"입니다");
						
					}

				}
				
				if(life<=0) {
					System.out.println("GAME OVER");
					
					break;
				}
				life = 3;
				// 중급 악마
				
				
				
				for (int i = 0; i < 4; i++) {
					
					quiz.QuizNormal(list2[i]);
					ans.answer_normal(list2[i]);
					System.out.println("정답을 입력하세요 >> ");
					String answer_normal = sc.next();
					if(answer_normal.equals(ans.answer_normal(list2[i]))) {
						Score++;
						System.out.println("현재 점수는 "+Score+"입니다");
					}else {
						life--;
					System.out.println("현재 목숨음 "+life+" 남았습니다.");
					System.out.println("현재 점수는 "+Score+"입니다");
					}
					if(life<=0) {
						break;
					}
				}
				if(life<=0) {
					System.out.println("GAME OVER");
					break;

			}
				life = 3;
				// 고급 악마
				for (int i = 0; i < 3; i++) {
				
					
						
						quiz.QuizHard(list[i]);
						ans.answer_hard(list[i]);
					System.out.println("정답을 입력하세요 >> ");
					String answer_hard = sc.next();
					if(answer_hard.equals(ans.answer_hard(list[i]))) {
						Score++;
					}

				
				
				}
				
				if(Score>=7) {
					System.out.println("해피 엔딩");
					break;
					
				}else {
					System.out.println("베드 엔딩");
					break;
					
				}
			
				
			}
			
				
			
				
				
				
				
			
			
			
			
		}
		
	
}




