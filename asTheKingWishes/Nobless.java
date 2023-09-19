package asTheKingWishes;

public class Nobless {
	private String name = "귀족";
	//print
	public void event1() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   The Left나라에서 항구개방을 요청하였습니다.");
        System.out.println("   항구를 개방하면 무역이 활성화되어");
        System.out.println("   나라 재정과 상인들에게 도움이 될것입니다.");
        System.out.println();
        System.out.println(" =================================================");
	}
	public void event2() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   The City마을에 극심한 가뭄이 들었습니다.");
		System.out.println("   백성들이 굶어 죽어가며 곡소리가 끊이질 않습니다.");
		System.out.println("   지역 세금을 1년동안 면제하시고");
		System.out.println("   국고를 열어 은혜를 배푸시겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event3() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   두 달 뒤면 각 나라의 공주들이 연회에 참석합니다.");
		System.out.println("   연회를 성대하게 준비하시겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event4() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하! 국고가 바닥나고있습니다.");
		System.out.println("   RUSH&CASH 가문에서 이 소식을 듣고	");
		System.out.println("   폐하께만 연금리 0.0004% 대출을 해주겠답니다.");
		System.out.println("   빌리시겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event5() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   The Right 나라에서 공물을 바치면");
		System.out.println("   우리나라를 보호해주겠다는 서신이 왔습니다.");
		System.out.println("   공물을 준비할까요?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event6() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하, 각 지역 엘리트를 뽑아 유학을 보내어");
		System.out.println("   인재양성에 힘 쓰는게 어떨까요?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event7() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하 각지에서 세금을 낮추어 달라고 시위가 일어나고 있습니다.");
		System.out.println("   세금을 낮추시겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event8() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하 전염병으로인해 백성들이 매우 힘들어하고 있습니다.");
		System.out.println("   국고를 개방하시겠습니까?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event9() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하 JEJU섬에서 귤이라는 과일이 폭풍 수확되고 있습니다.");
		System.out.println("   무역상품에 올릴까요?");
		System.out.println();
		System.out.println(" =================================================");
	}
	public void event10() {
		System.out.println(" ====["+getName()+"]========================================");
		System.out.println();
		System.out.println("   폐하, 지역예산 분배를 앞두고");
		System.out.println("   영주들이 서로 앞다투어 공물을 바치고 있습니다.");
		System.out.println("   받으시겠습니까?");
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
