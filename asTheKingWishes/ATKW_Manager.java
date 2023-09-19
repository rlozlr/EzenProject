package asTheKingWishes;

import java.util.Scanner;

public class ATKW_Manager {

	King k = new King();
	// 게이지 클래스들 불러오기
	HolyGauge holy = new HolyGauge();
	DoctorGauge doctor = new DoctorGauge();
	ArmyGauge army = new ArmyGauge();
	NoblessGauge nobless = new NoblessGauge();

	private int random;
	private int count; // 게임 횟수
	private String job[] = { "Holy", "Doctor", "Army", "Nobless" };

	public ATKW_Manager() {}

	public void gameStart(Scanner scan) {
		k.userName(scan);
		k.prologue(scan);
	}

	// case 랜덤수 생성 메서드
	public int random() {
		return random = (int) (Math.random() * job.length) + 1;
	}

	// 게임플레이 메서드
	public void playGame(Scanner scan) {
		random();
		switch (random) {
		case 1: // 교황
			holy.changeGauge(scan);
			count++;
			break;
		case 2: // 의사
			doctor.changeGauge(scan);
			count++;
			break;
		case 3: // 장군
			army.changeGauge(scan);
			count++;
			break;
		case 4: // 귀족
			nobless.changeGauge(scan);
			count++;
			break;
		}
	}

	// 게이지 출력 메서드
	public void printGauge() {
		System.out.println("  ─────────────────────────────────────────────");
		System.out.println(" | 신앙 = " + holy.getGauge() + " |" + "| 민심 = " + doctor.getGauge() + " |" + "| 군사 = "
				+ army.getGauge() + " |" + "| 재정 = " + nobless.getGauge() + " |");
		System.out.println("  ─────────────────────────────────────────────");
	}
	
	public void event(Scanner scan) {
		random();
		switch (random) {
		case 1: nobless.event(scan); break;
		case 2: holy.event(scan); break;
		case 3: doctor.event(scan); break;
		case 4: army.event(scan); break;
		}
	}
	
	public int randomEventNum() {
		return (int)(Math.random()+4)+1;
	}

	public King getK() {
		return k;
	}

	public void setK(King k) {
		this.k = k;
	}

	public HolyGauge getHoly() {
		return holy;
	}

	public void setHoly(HolyGauge holy) {
		this.holy = holy;
	}

	public DoctorGauge getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorGauge doctor) {
		this.doctor = doctor;
	}

	public ArmyGauge getArmy() {
		return army;
	}

	public void setArmy(ArmyGauge army) {
		this.army = army;
	}

	public NoblessGauge getNobless() {
		return nobless;
	}

	public void setNobless(NoblessGauge nobless) {
		this.nobless = nobless;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String[] getJob() {
		return job;
	}

	public void setJob(String[] job) {
		this.job = job;
	}



}
