package asTheKingWishes;

import java.util.Scanner;

public class HolyGauge {
	private String gaugeName = "Holy";
	private int gauge = 50;

	King king = new King();
	Holy holy = new Holy();
	CharacterImage CharatorImg = new CharacterImage();
	EndingImage endImg = new EndingImage();
	EventFaith event = new EventFaith();

	// 랜덤 생성
	public int random() {
		int random = (int) (Math.random() * 10) + 11;
		return random;
	}

	// 게이지메소드
	public void changeGauge(Scanner scan) {
		CharatorImg.HolyImage();
		int random = random();
		switch (random) {
		case 11:
			holy.event1();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 10;
			} else if (!king.isContain()) {
				gauge = gauge - 10;
			}
			break;
		case 12:
			holy.event2();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 15;
			} else if (!king.isContain()) {
				gauge = gauge - 15;
			}
			break;
		case 13:
			holy.event3();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else if (!king.isContain()) {
				gauge = gauge - 20;
			}
			break;
		case 14:
			holy.event4();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 5;
			} else if (!king.isContain()) {
				gauge = gauge - 5;
			}
			break;
		case 15:
			holy.event5();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else if (!king.isContain()) {
				gauge = gauge - 20;
			}
			break;
		case 16:
			holy.event6();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 35;
			} else if (!king.isContain()) {
				gauge = gauge - 35;
			}
			break;
		case 17:
			holy.event7();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 15;
			} else if (!king.isContain()) {
				gauge = gauge - 15;
			}
			break;
		case 18:
			holy.event8();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 5;
			} else if (!king.isContain()) {
				gauge = gauge - 5;
			}
			break;
		case 19:
			holy.event9();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 5;
			} else if (!king.isContain()) {
				gauge = gauge - 5;
			}
			break;
		case 20:
			holy.event10();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 25;
			} else if (!king.isContain()) {
				gauge = gauge + 20;
			}
			break;
		default:
			break;
		}
	}

	public void ending() {
		if (gauge <= 0) {
			endImg.HolyMinImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("   백성들이 더 이상 구글링하지 않게 되었습니다.");
			System.out.println("   모두 ChatGPT를 사용하며 스스로 생각하기를 거부합니다.");
			System.out.println("   왕의 곁에서 참언을 해주는 신하도 더이상 존재하지 않습니다.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 01] AI의 뜻대로..!");
			System.out.println(" =================================================");
		}
		if (gauge >= 100) {
			endImg.HolyMaxImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("   백성들의 신앙심에 Google신께서 감격했습니다.");
			System.out.println("   모두가 VR을 끼고 Google 지도를 통해 세계로 떠납니다.");
			System.out.println("   우리는 현실을 잃었습니다.");
			System.out.println("   허상에 사는 백성들은 더 이상 왕의 말에 귀기울여 주지 않았습니다.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 02] 떠나자 VR세계로..!");
			System.out.println(" =================================================");
		}
	}
	
	public void event(Scanner scan) {
		event.eventPrint(scan);
		switch (event.getResult()) {
		case 1: gauge = gauge -10; break;	// 악마가 이김
		case 2: gauge = gauge -20; break;	// 악마가 짐
		case -1 : gauge = gauge +20; break;	// 게임 거절
		}
	}
	
	public String getGaugeName() {
		return gaugeName;
	}

	public void setGaugeName(String gaugeName) {
		this.gaugeName = gaugeName;
	}

	public int getGauge() {
		return gauge;
	}

	public int setGauge(int gauge) {
		return this.gauge = gauge;
	}

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}

	public Holy getHoly() {
		return holy;
	}

	public void setHoly(Holy holy) {
		this.holy = holy;
	}

}
