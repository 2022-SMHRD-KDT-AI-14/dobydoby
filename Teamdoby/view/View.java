package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.Ending;
import model.Gameover;
import model.PrologDAO;
import model.RankDAO;
import model.Round;
import model.user_infoDAO;
import model.user_infoDTO;

import model.MusicVO;


public class View {

	public static void main(String[] args) {
		RankDAO rank = new RankDAO();
		MP3Player mp3 = new MP3Player();
		Round round = new Round();
		Gameover gameover = new Gameover();
		String name = "";
		Ending ending = new Ending();
		
		ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();

		String path = "C:/Users/smhrd/Desktop/mp3/music/";
		musicList.add(0,new MusicVO(path+"로그인화면.mp3")); //0
		musicList.add(1,new MusicVO(path+"프롤로그.mp3")); //1
		musicList.add(2,new MusicVO(path+"초급.mp3")); //2
		musicList.add(3,new MusicVO(path+"중급.mp3")); //3
		musicList.add(4,new MusicVO(path+"고급.mp3")); //4
		musicList.add(5,new MusicVO(path+"해피엔딩.mp3")); //5
		musicList.add(6,new MusicVO(path+"베드엔딩.mp3")); //6
		musicList.add(7,new MusicVO(path+"게임오버.mp3")); //7
		
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
			
			if (menu==1) {	// 로그인
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
						System.out.println("로그인 성공");
						break;
					}

					if (dao.login(dto) == 2) {
						System.out.println("로그인 실패");
						System.out.println("ID와 PW를 다시 확인해주세요");
					
					}
					}
				}
				
				// 로그인 이후 게임 실행(프롤로그 진입)
				// 프롤로그
				
				
			if(menu==2) {	// 회원가입
				System.out.println("==== 회원가입 ====");
				System.out.print("ID를 입력해주세요 >> ");
				id = sc.next();
				System.out.print("PW를 입력해주세요 >> ");
				pw = sc.next();
				System.out.print("NickName을 입력해주세요 >>");
				name = sc.next();
				
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
			if(menu==1) {
				break;
			}
			}
			
			
		
			while(true) {
				mp3.stop();
				mp3.play(musicList.get(1).getPath());
				
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
				mp3.stop();
				mp3.play(musicList.get(2).getPath());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round1(name2);
				life = 3;
				
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
					mp3.stop();
					mp3.play(musicList.get(7).getPath());
					gameover.gameover();
					
					
					break;
				}
				
				round.Clear1();
				
				System.out.println();
				System.out.println("다음스테이지로 넘어갑니다. Enter를 눌러주세요!");
				sc.nextLine();
				sc.nextLine();
				
				life = 3;
				// 중급 악마
				mp3.stop();
				mp3.play(musicList.get(3).getPath());
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				round.Round2(name2);
				
				
				
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
					mp3.stop();
					mp3.play(musicList.get(7).getPath());
					gameover.gameover();
					break;

			}
				round.Clear2();
				
				System.out.println();
				System.out.println("다음스테이지로 넘어갑니다. Enter를 눌러주세요!");
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
					mp3.stop();
					mp3.play(musicList.get(7).getPath());
					gameover.gameover();
					break;}
				
					round.Clear3();
					

			
				rank.rank_save(name2, id, Score);
				life = 3;
				System.out.println("순위	닉네임	아이디	점수");
				System.out.println("----------------------------");
				rank.rank_view();
				System.out.println("----------------------------");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(Score>=7) {
					mp3.stop();
					mp3.play(musicList.get(5).getPath());
					ending.Happy_ED();
					rank.rank_view();
					
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ending.Epilogue_Happy();
					
					break;
					
				}else {
					mp3.stop();
					mp3.play(musicList.get(6).getPath());
					ending.Bad_ED();
					rank.rank_view();
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ending.Epilogue_Bad();
					
					break;
					
				}
			}
			
				
			}
			
				
			
				
				
				
				
			
			
			
			
		}
		
	




