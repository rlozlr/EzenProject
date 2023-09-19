package asTheKingWishes;

import java.util.Scanner;

public class ATKW_Main extends ATKW_Manager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ATKW_Manager m = new ATKW_Manager();
		MainImage mainImg = new MainImage();

		// 게임 메인화면
		mainImg.mainImage();
		System.out.print(">> ");
		int num = scan.nextInt();
		System.out.println();
		if (num == 2) {
			System.out.println(" >> 시스템을 종료합니다. << ");
			;
		}

		if (num == 1) {
			m.gameStart(scan);
			while (true) {
				m.printGauge();
				m.playGame(scan);					
					if (m.getArmy().getGauge() >= 100 
							|| m.getDoctor().getGauge() >= 100 
							|| m.getNobless().getGauge() >= 100
							|| m.getHoly().getGauge() >= 100) {
						m.getArmy().ending();
						m.getDoctor().Ending();
						m.getHoly().ending();
						m.getNobless().ending();
						break;
					} else if (m.getArmy().getGauge() <= 0 
							|| m.getDoctor().getGauge() <= 0
							|| m.getNobless().getGauge() <= 0 
							|| m.getHoly().getGauge() <= 0) {
						m.getArmy().ending();
						m.getDoctor().Ending();
						m.getHoly().ending();
						m.getNobless().ending();
						break;
					}
					if (m.getArmy().getGauge() < 100 
							|| m.getDoctor().getGauge() < 100 
							|| m.getNobless().getGauge() < 100
							|| m.getHoly().getGauge() < 100) {
						if (m.getCount() % 5 == 0) {
							m.event(scan);
						}
					} else if (m.getArmy().getGauge() > 0
							|| m.getDoctor().getGauge() > 0 
							|| m.getNobless().getGauge() > 0
							|| m.getHoly().getGauge() > 0) {
						if (m.getCount() % 5 == 0) {
							m.event(scan);
						}
					}
			}
			System.out.println();
			System.out.println("  >> [" + m.getK().getKingName() + "]왕은 [" + m.getCount() + "]년 살아남으셨습니다. <<");
		}

	}
}
