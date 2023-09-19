package asTheKingWishes;

import java.util.Scanner;

public class ArmyGauge {

	private String gaugeName = " Army";
	private int gauge = 50;
	private int random;

	Army army = new Army();
	King king = new King();
	CharacterImage CharatorImg = new CharacterImage();
	EndingImage endImg = new EndingImage();
	EventMilitary event = new EventMilitary();
	

	public int random() {
		int random = (int) (Math.random() * 10) + 31;
		return random;
	}

	public void changeGauge(Scanner scan) {
		CharatorImg.ArmyImage();
		int random = random();
		switch (random) {

		case 31:
			army.event1();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 20;
			} else {
				gauge = gauge + 10;
			}
			break;

		case 32:
			army.event2();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 33:
			army.event3();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 30;
			}
			break;
		case 34:
			army.event4();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 30;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 35:
			army.event5();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge + 10;
			}
			break;
		case 36:
			army.event6();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 30;
			} else {
				gauge = gauge + 10;
			}
			break;
		case 37:
			army.event7();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 10;
			}
			break;
		case 38:
			army.event8();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 30;
			}
			break;
		case 39:
			army.event9();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 10;
			} else {
				gauge = gauge - 30;
			}
			break;
		case 40:
			army.event10();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else {
				gauge = gauge - 20;
			}
			break;
		default:
			break;
		}

	}

	public void ending() {
		if (gauge <= 0) {
			endImg.ArmyMinImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  침략군이 성문까지 왔습니다!!!");
			System.out.println("  우리에게는 이미 저들을 막을 만할 힘이 없습니다!!!!");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 05] 살려주시오..!");
			System.out.println(" =================================================");

		}
		if (gauge >= 100) {
			endImg.ArmyMaxImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  막강한 힘을 가진 군사들이 쿠데타를 일으켰습니다!!!!!");
			System.out.println("  폐하, 전권을 제게 넘긴다면 목숨을 살려드리지요.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 06] 살려준다며..!");
			System.out.println(" =================================================");
		}
	}
	
	public void event(Scanner scan) {
		event.eventPrint(scan);
		switch (event.getResult()) {
		case 1: gauge = gauge +25; break;	// 악마가 짐
		case 2: gauge = gauge -25; break;	// 악마가 이김
		case -1 : gauge = gauge +20; break;	// 무승부 
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

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}

}
