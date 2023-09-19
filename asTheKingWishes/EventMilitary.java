package asTheKingWishes;

import java.util.Scanner;

public class EventMilitary {
	private String answer;
	private int result;
	private String eventCharacter = "악마";
	private String[] coin = {"앞면", "뒷면"};
	
	CharacterImage charactorImg = new CharacterImage();
	
	public void eventPrint(Scanner scan) {
		charactorImg.DevilImage();
		System.out.println(" ====[" + getEventCharacter() + "]========================================");
		System.out.println();
		System.out.println("  인생은 도박과 같은 것... ");
		System.out.println("  나와 동전 던지기 내기를 하지 않겠나?");
		System.out.println("  나에게서 이기면 엄청난 힘을 너에게 주지.");
		System.out.println();
		System.out.println(" =================================================");
		System.out.println();
		System.out.println("  악마의 내기에 응하겠습니까? (y/n)");
		System.out.print(">> ");
		answer = scan.next();
		System.out.println();
		
		switch (answerCase(answer)) {
		case 1: case 2: break;
		case 3: gamePlay(scan); break; 
		}
	}
	
	// 랜덤
	public int random() {
		return (int)(Math.random()*2);
	}
	
	// 대답에 따른 스토리
	public int answerCase(String answer) {	
		if(!(answer.equals("n") || (answer.equals("y")))) {
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  악마는 엉뚱한 소리를 하는 왕을 보며 고개를 가로저었다.");
			System.out.println("  '이딴게 왕이라고?'");
			System.out.println("  흥미가 식은 악마는 심연 속으로 사라집니다.");
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
			charactorImg.DevilImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  내 달콤한 제안에도 흔들림이 없다니...!");
			System.out.println("  그대는 참으로 현명한 왕이로다.");
			System.out.println("  다음에 다시 한번 더 너를 찾아오겠다...");
			System.out.println("  그 때는 반드시 너를 타락시켜주지.");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println("  (지켜보던 Google 신이 감격하여 군인들에게 활력을 불어줍니다.)");
			System.out.println("  [군사력이 +20 증가했습니다.]");
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
			charactorImg.DevilImage();
			System.out.println(" ====[" + getEventCharacter() + "]========================================");
			System.out.println();
			System.out.println("  (악마가 동전을 던졌다 움켜잡았다.)");
			System.out.println("  자, 동전이 앞면일까 뒷면일까, 맞춰보거라.");
			System.out.println();
			System.out.println(" =================================================");
			System.out.println(" 	          [1. 앞면]  "+"|"+"  [2. 뒷면]");
			System.out.print(">> ");
			return 3;
		}
		return -1;
	}
	
	
	public void gamePlay(Scanner scan) {
		int random = random();
		String str = coin[random];
		while(true) {
			int user = scan.nextInt();
			
			if(random == 0) {
				if(user == 1) {
					charactorImg.DevilImage();	
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  정답이다...");
					System.out.println("  (악마가 펼친 손 안에는 ["+str+"]이/가 있었습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [군사력이 +25 증가했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(1);
					break;
				} else if (user == 2 ) {
					charactorImg.DevilImage();	
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  크하하, 틀렸느니라.");
					System.out.println("  (악마가 펼친 손 안에는 ["+str+"]이/가 있었습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [군사력이 -25 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(2);
				}
				break;
			}
			if(random == 1) {
				if(user == 2) {
					charactorImg.DevilImage();	
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  정답이다...");
					System.out.println("  (악마가 펼친 손 안에는 ["+str+"]이/가 있었습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [군사력이 +25 증가했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(1);
					break;
				} else if (user == 1 ) {
					charactorImg.DevilImage();	
					System.out.println(" ====[" + getEventCharacter() + "]========================================");
					System.out.println();
					System.out.println("  크하하, 틀렸느니라.");
					System.out.println("  (악마가 펼친 손 안에는 ["+str+"]이/가 있었습니다.)");
					System.out.println();
					System.out.println(" =================================================");
					System.out.println("  [군사력이 -25 감소했습니다.]");
					System.out.println();
					try {
						Thread.sleep(3500); // 5초 후
					} catch (Exception e) {
						e.printStackTrace();
					}
					setResult(2);
				}
				break;
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
