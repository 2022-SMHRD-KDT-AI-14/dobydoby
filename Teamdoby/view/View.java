package view;

import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.Gameover;
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
		
		Scanner sc = new Scanner(System.in);
		
		int log =0;
		int cnt = 0;
		int over = 0;
		int[]list = new int[3];
		int[]list2 = new int[4];
		int Score=0;
		int life =3;
		int end =0;
		
		String id2=null; 
		String name2=null;
			
		while(true) {
			
			System.out.println("  ___    _____      _    _                     _              \r\n"
					+ " / _ \\  |_   _|    | |  | |                   (_)             \r\n"
					+ "/ /_\\ \\   | |      | |  | |  __ _  _ __  _ __  _   ___   _ __ \r\n"
					+ "|  _  |   | |      | |/\\| | / _` || '__|| '__|| | / _ \\ | '__|\r\n"
					+ "| | | |  _| |_     \\  /\\  /| (_| || |   | |   | || (_) || |   \r\n"
					+ "\\_| |_/  \\___/      \\/  \\/  \\__,_||_|   |_|   |_| \\___/ |_|   \r\n"
					+ "                                                              ");
			System.out.println(" ~ Team Doby ~\n");
			
			
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
					String	id = sc.next();
					System.out.print("PW >> ");
					String	pw = sc.next();
					user_infoDTO dto = new user_infoDTO(id, pw);
					user_infoDAO dao = new user_infoDAO();
					name2=dao.name_select(dto);
					dao.login(dto);
					
					
					if (dao.login(dto) == 1) {
						System.out.println("로그인 성공");
						break;
					}

					if (dao.login(dto) == 2) {
						System.out.println("로그인 실패");
						
						break;
					}
				}
				
				// 로그인 이후 게임 실행(프롤로그 진입)
				// 프롤로그
				
				
				
				rank.id_save(id2);
				rank.name_save(name2);
				
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
				dao.real_name(name2);
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
				System.out.println("순위	닉네임	아이디	점수");
				System.out.println("----------------------------");
				rank.rank_view();
				System.out.println("----------------------------");
				
			}
			if(menu==4) {	// 종료
				System.out.println("종료되었습니다.");
				end++;
				break;
			}
			}
				// 문제 출력(건빈,영역)
				// 초급 악마
				
				
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
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round1();
				
				for (int i = 0; i < 3; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("문제"+(i+1));
					quiz.QuizEasy(list[i]);
					ans.answer_easy(list[i]);
					System.out.print("정답을 입력하세요 >> ");
					String answer_easy = sc.next();
					
					if(answer_easy.equals(ans.answer_easy(list[i]))) {
						round.Round1_O(i);
						Score++;
						System.out.println("현재 점수는 "+Score+"입니다");
					}else {
						round.Round1_X(i);
						life--;
						System.out.println("현재 목숨은 "+life+" 남았습니다.");
						System.out.println("현재 점수는 "+Score+"입니다");
						
					}

				}
				
				if(life<=0) {
					gameover.gameover();
					
					
					break;
				}
				
				round.Clear1();
				
				life = 3;
				// 중급 악마
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round2();
				
				
				
				for (int i = 0; i < 4; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("문제"+(i+4));
					quiz.QuizNormal(list2[i]);
					ans.answer_normal(list2[i]);
					System.out.print("정답을 입력하세요 >> ");
					String answer_normal = sc.next();
					if(answer_normal.equals(ans.answer_normal(list2[i]))) {
						round.Round2_O(i);
						Score++;
						System.out.println("현재 점수는 "+Score+"입니다");
					}else {
						round.Round2_X(i);
						life--;
					System.out.println("현재 목숨음 "+life+" 남았습니다.");
					System.out.println("현재 점수는 "+Score+"입니다");
					}
					if(life<=0) {
						gameover.gameover();
						break;
					}
				}
				if(life<=0) {
					gameover.gameover();
					break;

			}
				round.Clear2();
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round3();
				
				life = 3;
				// 고급 악마
				for (int i = 0; i < 3; i++) {
					
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.println("문제"+(i+8));
					quiz.QuizHard(list[i]);
					ans.answer_hard(list[i]);
					System.out.print("정답을 입력하세요 >> ");
					String answer_hard = sc.next();
					if (answer_hard.equals(ans.answer_hard(list[i]))) {
						round.Round3_O(i);
						Score++;
						System.out.println("현재 점수는 "+Score+"입니다");
					}else {
						round.Round3_X(i);
						life--;
					System.out.println("현재 목숨음 "+life+" 남았습니다.");
					System.out.println("현재 점수는 "+Score+"입니다");
					}
				
				}
				if(life<=0) {
					gameover.gameover();
					break;}
				
					round.Clear3();
					

			
				rank.score_save(Score);
				life = 3;
				System.out.println("순위	닉네임	아이디	점수");
				System.out.println("----------------------------");
				rank.rank_view();
				System.out.println("----------------------------");
				
				if(Score>=7) {
					System.out.println("해피 엔딩");
					rank.rank_view();
					break;
					
				}else {
					System.out.println("베드 엔딩");
					rank.rank_view();
					break;
					
				}
			
				
			}
			
				
			
				
				
				
				
			
			
			
			
		}
		
	
}




