package asTheKingWishes;

import java.util.Scanner;

public class EventFinance {
	private int com;
	private int me;
	private String answer;
	private int result;
	private String eventCharacter = "광대";
	
	CharacterImage charactorImg = new CharacterImage();

	public void eventPrint(Scanner scan) {	// 재정
		charactorImg.ClownImage();
		System.out.println(" ====[" + getEventCharacter() + "]========================================");
		System.out.println();
		System.out.println("  폐하! 정말 지루한 얼굴이네!");
		System.out.println("  나랑 주사위 게임하자!");
		System.out.println("  물론 서로 주머니를 걸고 하는거지!");
		System.out.println("  나 먼저 던질게!");
		com = random();
		System.out.println("  이야압!");
		System.out.println("  이제 폐하 차례야!");
		System.out.println();
		System.out.println(" =================================================");

		System.out.println();
		System.out.println("  주사위를 던지겠습니까? (y/n)");
		System.out.print(">> ");
		answer = scan.next();
		System.out.println();

		switch (answerCase(answer)) {
		case 1: case 2: break;
		case 3: gameResult(); break;
		}
	}
	
	// 주사위 굴리기
	public int random() {
		return (int)(Math.random()*6)+1;
	}
	
	// 대답에 따른 스토리 메소드
	public int answerCase(String answer) {	
		if(!(answer.equals("n") || (answer.equals("y")))) {
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  광대는 왕에게 무시를 당했습니다...");
			System.out.println("  어깨가 축 처진 광대는 눈물을 훔치며 알현실을 떠납니다.");
			System.out.println();
			System.out.println(" =================================================");
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 1;
		}
		if (answer.equals("n")) {
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  아 뭐야, 왕이 배짱이 없어.");
			System.out.println("  재미없어, 나 갈래.");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  [광대는 시무룩하게 알현실을 떠났다.]");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 2;
		}

		if (answer.equals("y")) {
			System.out.println("  왕이 주사위를 던지는 중입니다...");
			me = random();
			System.out.println();
			try {
				Thread.sleep(2000); // 2초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  두구두구두구 이제 숫자를 서로 밝혀볼까?");
			System.out.println("  나는 [" + com + "]!");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println(">>  짐은 [" + me + "]이/가 나왔군...");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 3;
		}
		return -1;
	}
	
	// 게임 결과 메소드
	public void gameResult() {
		if (com > me) {
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  우와아! 내가 이겼다!!!");
			System.out.println("  (광대는 돈을 들고 잽싸게 달아났다.)");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  [재정이 -10 감소했습니다.]");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			setResult(1);
		} else if (com < me) {
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  아 짜증나, 내가 졌어.");
			System.out.println("  (광대는 주머니에서 돈을 탈탈 털었다.)");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  [재정이 +10 증가했습니다.]");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			setResult(2);
		} else {
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  무승부잖아?");
			System.out.println("  운이 좋았네.");
			System.out.println("  (광대는 소란스럽게 알현실을 떠났다.)");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  [광대의 주머니도 지키고, 나라의 재정도 지켰습니다.]");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			setResult(3);
		}
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getMe() {
		return me;
	}

	public void setMe(int me) {
		this.me = me;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getEventCharacter() {
		return eventCharacter;
	}

	public void setEventCharacter(String eventCharacter) {
		this.eventCharacter = eventCharacter;
	}

	public CharacterImage getCharactorImg() {
		return charactorImg;
	}

	public void setCharactorImg(CharacterImage charactorImg) {
		this.charactorImg = charactorImg;
	}
	
	
		
}