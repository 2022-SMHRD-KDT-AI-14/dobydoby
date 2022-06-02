package model;

public class Ending {
	public void Happy_ED() {
		System.out.println("[System] 축하합니다 3명의 마왕과의 싸움에서 승리하였습니다!");
		System.out.println("[용현(자바요정)]\r\n" + "축하해요. 이건 닉네임씨가 6개월동안 열심히 노력했다는 용사의 수료증이에요!");
		System.out.println("[System] 축하합니다 용사의 수료증을 받았습니다!");
		System.out.println("The AI Warrior");
		System.out.println("랭킹순위   아이디  닉네임   점수");
	}
	// EpilogDAO 16번
	
	public void Epilogue_Happy() {
		System.out.println("그렇게 닉네임(은)는 무사히 수료증을 받을 수 있었다.\r\n"
				+ "닉네임(은)는 자바 요정 용현이 주는 마지막 간식을 받고 취업을 위한 첫 발을 내딛기 시작했다.\r\n"
				+ "하지만 그의 고난은 끝나지 않았다.\r\n"
				+ "공부는 죽을 때까지 해야 한다.\r\n"
				+ "더 좋은 환경과 높은 급여를 받을 수 있는 길드 이직을 위해 그의 스펙업는 계속 된다.");
	}
	
	// EpilogDAO 34번

	public void Bad_ED() {
		System.out.println("[System] 이수 실패!!!");
		System.out.println("[System] 마왕에게 졌습니다. ");
		System.out.println("[System] 당신은 하위 6%로 떨어졌습니다.");
		System.out.println("[System] 당신은 이번달 심사에서 떨어져 이번달 지원급 318,000원이 강제 반납 됩니다.");
		System.out.println("[System] 당신은 빈털털이가 되었습니다.");
		System.out.println("[System] 그 어느 길드에서도 당신의 취업 시켜주지 않습니다.");
	}
	// Gameover 19번

	public void Epilogue_Bad() {
		System.out.println("닉네임(은)는 용사의 수련 이수에 실패 하였다. 그렇다, 그렇다. 닉네임(은)는 하위 6%로 떨어지고 말았다.\r\n"
				+ "덕분에 이번달 심사에서 떨어져 지원금 318,000원을 강제 반납 당하게 된다.\r\n"
				+ "빈털털이가 된 용사는 길드몬과 길드천국을 떠돌지만 그 누구도 스펙 하나 없는 용사를 취업 시켜주지 않았다. \r\n"
				+ "닉네임(은)는 폐지를 주워가며 살아간다. 오늘은 유독 날이 차다.\r\n"
				+ "잘자요 모두들...");
	}
	// Gameover 19번 이어서
}
