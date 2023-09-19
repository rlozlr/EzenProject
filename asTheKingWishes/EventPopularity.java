package asTheKingWishes;

import java.util.Scanner;

public class EventPopularity {
	private String answer;
	private int com;
	private int result;
	private String eventCharacter = "광대";
	
	CharacterImage charactorImg = new CharacterImage();
	
	public void eventPrint(Scanner scan) {
		charactorImg.ClownImage();
		System.out.println(" ====[" + getEventCharacter() + "]========================================");
		System.out.println();
		System.out.println("  폐하! 요즘 백성들 사이에서 가위바위보가 ★대★유★행★이야!");
		System.out.println("  그러니까 나랑 가위바위보 하지 않을래?");
		System.out.println("  나를 이기면 폐하가 엄청나게 좋은 사람이라고 소문 내줄게!");
		System.out.println();
		System.out.println(" =================================================");
		System.out.println();
		System.out.println("  광대의 제안에 응하겠습니까? (y/n)");
		System.out.print(">> ");
		answer = scan.next();
		
		switch (answerCase(answer)) {
		case 1: case 2: break;
		case 3: gamePlay(scan); break; 
		}
	}
	
	// 가위바위보
	public int random() {
		return (int)(Math.random()*3)+1;
	}
	
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
			System.out.println("  '있잖아, 왕님은 백성들이 천하다고 무시하는거 알아?'");
			System.out.println("  (웅성웅성...) (수근수근...)");
			System.out.println("  '그렇다니까? 가위바위보를 알려드릴려고 했는데...'");
			System.out.println("  '글쎄 천한 놀이라고 썩 꺼지라는거 있지?'");
			System.out.println("  (웅성웅성...) (수근수근...)");
			System.out.println("  게임을 거절당한 광대는 백성들에게 헛소문을 퍼뜨립니다.");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  [민심이 -15 감소했습니다.]");
			System.out.println();
			try {
				Thread.sleep(3500); // 5초 후
			} catch (Exception e) {
				e.printStackTrace();
			}
			setResult(-1);
			return 2;
		}

		if (answer.equals("y")) {
			charactorImg.ClownImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  자~ 가위! 바위! 보!");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("무엇을 내시겠습니까? (가위/바위/보)");
			System.out.print(">> ");
			return 3;
		}
		return -1;
	}
	
	public void gamePlay(Scanner scan) {
		com = random();
		String str = "";
		
		switch (com) {
		case 1: str = "가위"; break;
		case 2: str = "바위"; break;
		case 3: str = "보"; break;
		}
		
		while(true) {
			String user = scan.next();
			if(com == 1) {	// 가위
				if(user.equals("바위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  칫, 내가 졌어...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [민심이 +10 증가했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(1);
					break;
				}
				if(user.equals("보")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  우왕!! 내가 이겼다!!!");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분 좋은 광대가 왕은 멍청하다고 소문을 냅니다.)");
					System.out.println("  [민심이 -10 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(2);
					break;
				}
				if(user.equals("가위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  폐하랑 통했다니...!");
					System.out.println("  으, 기분 더러워...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분이 언짢은 광대가 왕은 그냥 안좋은 사람이라고 소문을 냅니다.)");
					System.out.println("  [민심이 -5 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(3);
					break;
				}
			} else if (com == 2) {	// 바위
				if(user.equals("보")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  칫, 내가 졌어...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [민심이 +10 증가했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(1);
					break;
				}
				if(user.equals("가위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  우왕!! 내가 이겼다!!!");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분 좋은 광대가 왕은 멍청하다고 소문을 냅니다.)");
					System.out.println("  [민심이 -10 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(2);
					break;
				}
				if(user.equals("바위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  폐하랑 통했다니...!");
					System.out.println("  으, 기분 더러워...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분이 언짢은 광대가 왕은 그냥 안좋은 사람이라고 소문을 냅니다.)");
					System.out.println("  [민심이 -5 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(3);
					break;
				}
			} else if (com == 3) {	// 보
				if(user.equals("가위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  칫, 내가 졌어...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [민심이 +10 증가했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(1);
					break;
				}
				if(user.equals("바위")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  우왕!! 내가 이겼다!!!");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분 좋은 광대가 왕은 멍청하다고 소문을 냅니다.)");
					System.out.println("  [민심이 -10 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(2);
					break;
				}
				if(user.equals("보")) {
					charactorImg.ClownImage();
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  폐하랑 통했다니...!");
					System.out.println("  으, 기분 더러워...");
					System.out.println("  (광대는 ["+str+"]를 꺼냈습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  (기분이 언짢은 광대가 왕은 그냥 안좋은 사람이라고 소문을 냅니다.)");
					System.out.println("  [민심이 -5 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(3);
					break;
				}
				
			}
		}
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

}
