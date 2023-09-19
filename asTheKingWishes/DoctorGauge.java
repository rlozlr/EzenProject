package asTheKingWishes;

import java.util.Scanner;

public class DoctorGauge {

	public String gaugeName = "Doctor";
	public int gauge = 50;
	public int random = 0;

	King king = new King();
	Doctor doctor = new Doctor();
	CharacterImage CharatorImg = new CharacterImage();
	EndingImage endImg = new EndingImage();
	EventPopularity event = new EventPopularity();

	// 랜덤 메서드
	public int random() {
		return random = (int) (Math.random() * 10) + 21;
	}

	// 게이지 메서드
	public void changeGauge(Scanner scan) {
		CharatorImg.DoctorImage();
		random();

		switch (random) {

		case 21:
			doctor.event1();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else if (!king.isContain()) {
				gauge = gauge - 20;
			}
			break;
		case 22:
			doctor.event2();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else if (!king.isContain()) {
				gauge = gauge - 20;
			}
			break;
		case 23:
			doctor.event3();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 20;
			} else if (!king.isContain()) {
				gauge = gauge - 20;
			}
			break;
		case 24:
			doctor.event4();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 5;
			} else if (!king.isContain()) {
				gauge = gauge - 5;
			}
			break;
		case 25:
			doctor.event5();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 15;
			} else if (!king.isContain()) {
				gauge = gauge + 15;
			}
			break;
		case 26:
			doctor.event6();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 10;
			} else if (!king.isContain()) {
				gauge = gauge - 10;
			}
			break;
		case 27:
			doctor.event7();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 10;
			} else if (!king.isContain()) {
				gauge = gauge - 10;
			}
			break;
		case 28:
			doctor.event8();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 5;
			} else if (!king.isContain()) {
				gauge = gauge + 5;
			}
			break;
		case 29:
			doctor.event9();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge + 10;
			} else if (!king.isContain()) {
				gauge = gauge - 10;
			}
			break;
		case 30:
			doctor.event10();
			king.printSelect(scan);
			if (king.isContain()) {
				gauge = gauge - 10;
			} else if (!king.isContain()) {
				gauge = gauge + 10;
			}
			break;
		default:
			break;

		}

	}

// 엔딩 출력 메서드
	public void Ending() {
		if (gauge <= 0) {
			endImg.DocMinImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  왕은 의술을 너무 우습게 보았습니다.");
			System.out.println("  시간이 흐를수록 처 음본 역병들이 생겨났고");
			System.out.println("  의술의 발전은 뒤로한 채 방탕하게 놀기만 하던 왕은");
			System.out.println("  신종 바이러스인 코로나에 걸리고 말았습니다.");
			System.out.println("  그의 나이 고작 98세...");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 03] 의술을 우습게 볼만 했네..!");
			System.out.println(" =================================================");
		}
		if (gauge >= 100) {
			endImg.DocMaxImage();
			System.out.println(" =================================================");
			System.out.println();
			System.out.println("  왕은 너무나 많은 것을 의사에게 맡겼습니다.");
			System.out.println("  의사의 명성은 국민들 사이에서 드높아지고");
			System.out.println("  권력의 맛을 본 의사는 욕망이 점점 커져갔습니다.");
			System.out.println("  '왕만 없다면 내가 왕이 될 수도...?'");
			System.out.println("  항상 왕을 죽일 기회를 엿보던 의사는 결국 독약을 완성시키고");
			System.out.println("  순진한 왕에게 먹였습니다.");
			System.out.println();
			System.out.println();
			System.out.println("  [Ending 04] 은밀하게 위대하게..!");
			System.out.println(" =================================================");
		}
	}
	public void event(Scanner scan) {
		event.eventPrint(scan);
		switch (event.getResult()) {
		case 1: gauge = gauge + 10; break;	// 광대가 짐
		case 2: gauge = gauge - 10; break;	// 광대가 이김
		case -1 : gauge = gauge -15; break;	// 게임 거절
		}
	}

	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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

}
