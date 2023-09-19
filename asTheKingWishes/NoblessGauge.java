package asTheKingWishes;

import java.util.Scanner;

public class NoblessGauge {

	private String gaugeName = "Nobless";
	private int gauge = 50;
	private int random;

	Nobless nobless = new Nobless();
	King king = new King();
	CharacterImage CharatorImg = new CharacterImage();
	EndingImage endImg = new EndingImage();
	EventFinance event = new EventFinance();

	public int random() {
		int random = (int) (Math.random() * 10) + 41;
		return random;
	}

	public void changeGauge(Scanner scan) {
		CharatorImg.NoblessImage();
		int random = random();
		switch (random) {

		case 41:
			nobless.event1();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 30;
			} else {
				gauge = gauge + 0;
			}
			break;

		case 42:
			nobless.event2();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 25;
			} else {
				gauge = gauge + 20;
			}
			break;
		case 43:
			nobless.event3();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 20;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 44:
			nobless.event4();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 30;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 45:
			nobless.event5();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 30;
			} else {
				gauge = gauge + 10;
			}
			break;
		case 46:
			nobless.event6();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 30;
			} else {
				gauge = gauge + 10;
			}
			break;
		case 47:
			nobless.event7();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 20;
			} else {
				gauge = gauge + 20;
			}
			break;
		case 48:
			nobless.event8();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 30;
			} else {
				gauge = gauge + 10;
			}
			break;
		case 49:
			nobless.event9();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 30;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 50:
			nobless.event10();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 5;
			}
			break;
		default:
			break;
		}

	}

	public void ending() {
		if (gauge <= 0) {
			endImg.NoblessMinImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("   국고가 텅텅 비었습니다.");
			System.out.println("   능력없는 왕은 폐위되었습니다.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 07] 0원한건 내 텅장뿐..!");
			System.out.println(" =================================================");

		}
		if (gauge >= 100) {
			endImg.NoblessMaxImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("   돈이 많아진 상인들과 귀족들에게 권력을 뺏겼습니다.");
			System.out.println("   권력다툼에 패배한 왕은 쫓겨났습니다.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 08] 돈이 대체 뭔데..!");
			System.out.println(" =================================================");

		}
	}
	
	public void event(Scanner scan) {
		event.eventPrint(scan);
		switch (event.getResult()) {
		case 1: gauge = gauge -10; break;	// 광대가 이김
		case 2: gauge = gauge +10; break;	// 광대가 짐
		case 3 : break;	// 무승부 
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

	public void setGauge(int gauge) {
		this.gauge = gauge;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public Nobless getNobless() {
		return nobless;
	}

	public void setNobless(Nobless nobless) {
		this.nobless = nobless;
	}

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}
}