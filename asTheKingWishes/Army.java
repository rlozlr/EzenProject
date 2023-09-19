package asTheKingWishes;

public class Army {
	private String name = "장군";
	// Army event 
	public void event1() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   우리나라에는 우수한 사령관이 필요합니다!");
		System.out.println("   그러니 폐하께서는 저를 선택하셔야합니다.");
		System.out.println();
		System.out.println(" =================================================");
	}

	public void event2() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   공병이 새로운 무기를 몰래 연구하고 있다고 합니다.");
		System.out.println("   공식적으로 연구하라고 할까요?");
		System.out.println();

		System.out.println(" =================================================");
	}

	public void event3() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하! 사냥 도중에 이렇게 다치시다니...!");
		System.out.println("   상처에서 피가 흘러나옵니다!");
		System.out.println("   치료를 명할까요?");
		System.out.println();

		System.out.println(" =================================================");
	}

	public void event4() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   숲 속에서 푸른버섯과 갈색버섯을 발견했습니다.");
		System.out.println("   파란 버섯은 먹을 수 있는 것 같습니다.");
		System.out.println("   요리사에게 이것을 이번 식사에 대령하라 할까요?");
		System.out.println();

		System.out.println(" =================================================");
	}

	public void event5() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   올해는 아무 일이 일어나지 않았습니다.");
		System.out.println("   군대는 따분해 죽을 지경입니다.");
		System.out.println("   이웃나라에 전쟁을 일으켜주세요!");
		System.out.println();

		System.out.println(" =================================================");
	}

	public void event6() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   일부 백성이 폭도가 되어 마녀사냥을 하고 있습니다.");
		System.out.println("   필요한 경우 사살해도 되겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}

	public void event7() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하, 만일의 사태에 대비해 징병을 좀 더 구성해야 합니다!");
		System.out.println();
		System.out.println(" =================================================");
	}

	public void event8() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   지하 감옥에서 양손이 없는 시체가 발견되었습니다.");
		System.out.println("   신원은 모르겠습니다.");
		System.out.println("   군사를 더 모집하여 경비를 강화할까요?");
		System.out.println();
		System.out.println(" =================================================");
	}

	public void event9() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   북부에서 바이킹이 공격해 옵니다!");
		System.out.println("   여기선 방어를 굳혀야 할 것 같습니다!");
		System.out.println();
		System.out.println(" =================================================");
	}

	public void event10() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   익살꾼 보르헷이 투석기를 부쉈습니다.");
		System.out.println("   저 녀석의 팔을 잘라버려도 괜찮을까요?");
		System.out.println();
		System.out.println(" =================================================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
