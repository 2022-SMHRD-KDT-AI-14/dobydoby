package model;

public class Round {
	String name = "ㅇㅇ";
	public void Round1() {
		System.out.println("[System]\r\n" + "(bgm이 바뀐다) 이때 한 손에는 망치를 든 누군가가 나타나는데");
		System.out.println("[???]\r\n" + "수료증을 받고 싶으면 우선 나를 먼저 저를 이겨야 해요.");
		System.out.println("["+name+"]\r\n" + "캐치마인드 해요!!");
		System.out.println("[System] (초급)자바 마왕 박수현(이)가 나타났다!!\r\n" + "[System] (초급)자바마왕 박수현(이)가 내는 문제를 맞추세요.\r\n"
				+ "목숨은 3번이며 목숨을 전부 잃을 시 수료증을 얻을 수 없습니다.");
	}
	public void Round1_O() {
		System.out.println("[수현마왕]\r\n" + "그렇쵸그렇쵸(끄덕끄덕)");
		System.out.println("[수현마왕]\r\n" + "조아여조아여(끄덕끄덕)");
		System.out.println("[수현마왕]\r\n" + "보상으로 맛집 하나 알려 드릴게요.");

	}
	public void Round1_X() {
		System.out.println("[수현마왕]\r\n" + "뚝배기 깨러 갑니다.");
		System.out.println("[수현마왕]\r\n" + "저 망치 들었어요.");
		System.out.println("[수현마왕]\r\n" + "진짜 망치 들고 갑니다.");
	}
	
	public void Clear1() {
		System.out.println("[System] 라운드1 클리어!!");
		System.out.println("[수현마왕]\r\n" + "여러분 수고하셨어요.\r\n"
				+ "점심 맛있게 드세요~");
	}
	public void Round2() {
		System.out.println("[???]\r\n"
				+ "자 수업 시작 합니다. 대답 슬랙에 올려주세요.");
		System.out.println("["+name+"]\r\n"
				+ "넹 아이스크림 사주세요!!");
		System.out.println("[???]\r\n"
				+ "\"......!(움찔)\"");
		System.out.println("[System] (중급)DB마왕 김동원(이)가 나타났다!!\r\n"
				+ "[System] (중급)DB마왕 김동원(이)가 내는 문제를 맞추세요.\r\n"
				+ "[System] 목숨은 3(life)번이며 목숨을 전부 잃을 시 수료증을 얻을 수 없습니다.");
		}
	public void Round2_O() {
		System.out.println("[동원마왕]\r\n" + "좀 더 어려운 문제를 내볼까요?");
		System.out.println("[동원마왕]\r\n" + "이번 문제는 진짜 쉬어요. 저 사기꾼 아닙니다.");
		System.out.println("[동원마왕]\r\n" + "자 알아서 공부를 열심히 해왔다고 믿고 다음 문제를...");
		System.out.println("[동원마왕]\r\n" + "다음 문제는 함정을 숨겨놨어요.");
	}
	public void Round2_X() {
		System.out.println("[동원마왕]\r\n" + "주말에 공부를 하나도 안 했고만...!!");
		System.out.println("[동원마왕]\r\n" + "과제 폭탄을 내줘야겠군요.");
		System.out.println("[동원마왕]\r\n" + "6개월 동안 insert만 하고 싶어요?");
	}
	public void Clear2() {
		System.out.println("[System] 라운드2 클리어!!");
		System.out.println("[동원마왕]\r\n" + "자 이제 어려운 문제는 끝났습니다.\r\n"
				+ "다음 분은 더 쉽습니다.\r\n"
				+ "자 저를 한 번만 믿어보세요.");
	}
	
	public void Round3() {
		System.out.println("[???]\r\n"
				+ "자바에서 오류를 발견 하면...\r\n"
				+ "저는 아 또 내가 뭘 틀렸을까 하면서 두근 거려요.");
		System.out.println("["+name+"]\r\n"
				+ "제정신이 아니야...!!");
		System.out.println("[System] (고급)자바마왕 나예호(이)가 나타났다!!\r\n"
				+ "[System] (고급)자바마왕 나예호(이)가 내는 문제를 맞추세요.\r\n"
				+ "목숨은 3(life)번이며 목숨을 전부 잃을 시 수료증을 얻을 수 없습니다.");
	}
	public void Round3_O() {
		System.out.println("[예호마왕]\r\n" + "아이 자바 재밌다.");
		System.out.println("[예호마왕]\r\n" + "짜→자→잔↗");
		System.out.println("[예호마왕]\r\n" + "아이 자바 쉽다.");
	}
	public void Round3_X() {
		System.out.println("[예호마왕]\r\n" + "뭘 틀렸을까 두근 거리나요?");
		System.out.println("[예호마왕]\r\n" + "땡! 그리고 저는 20살 입니다.");
		System.out.println("[예호마왕]\r\n" + "아이 자바 쉽다.");
	}
	
	public void Clear3() {
		System.out.println("[System] 라운드3 클리어!!");
		System.out.println("[예호마왕]\r\n"
				+ "아이 자바 재밌다~\r\n"
				+ "아이 JDBC 재밌다~\r\n"
				+ "(예호마왕은 바뀌지 않았다. 자바 재밌다 중얼 거리며 유유히 사라진다.)");
	}
}
