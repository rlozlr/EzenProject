package asTheKingWishes;

import java.util.Scanner;

public class King {
	/* 1. 프롤로그
	 * 당신의 이름은 무엇인가? - 이름 입력
	 * 그대가 젊은 왕인가? - 그렇다만 / 그렇진않
	 * 그럼, 내게서 왕위를 뺏어가 나를 이 지하감옥에 가두고, 영원히 나오지 못하게 한게 네놈이로군? - 그렇다 / 아니다..
	 * 어찌됐은, 앞으로는 네가 모든것을 책임져야 할거다. 있는 힘을 다하는게 좋을 걸. 이 놈이고 저 놈이고, 다 얼빠진 놈들 뿐이니까. - 누구이야기지? / 무슨이야기지?
	 * 오래 살고싶다면, 4개의 세력의 균형을 잘 유지해서, 잘 꾸려나가도록 해라. - 알겠다 / 아니된다 
	 * 망령은 왕을 말끄러미 보고는 사라졌다. 왕은 알현실로 들어갔다.
	 * 
	 * 2. 질문 선택 메서드
	 * - 그러하라 / 불허한다
	 *
	 * */
	
	private String kingName;
	private boolean select;
	int answer;
	
	CharacterImage img = new CharacterImage();
	
	public King() { }
	
	//유저 이름 세팅
	public void userName(Scanner scan) {
		System.out.println(" =================================================");
		System.out.println(" 그대의 이름은 무엇인가?");
		System.out.print(">> ");
		setKingName(scan.next());
		System.out.println();
	}
	
	//그러하다/불허한다 선택
	public void printSelect(Scanner scan) {
		while(true) {
			System.out.println(" 	     [1. 그러하라]  "+"|"+"  [2.불허한다]");
			System.out.println(" =================================================");
			System.out.print(">> ");
			select(scan);
			System.out.println();
			return;
		}
	}
	
	// 1,2번 선택 메소드 (예외처리 포함)
	// 게이지 활용하실 때 select 값(매개변수) 불러오시면 됩니다. (getSelect)
	public void select(Scanner scan) {
		int selectNum1 = -1;
		int selectNum = scan.nextInt();
		System.out.println();
		if(!(selectNum==1||selectNum==2)) {
			do {
				System.out.println(" =================================================");
				System.out.println("  이 봐, 그 정신머리로 무슨 통치를 하겠다는거야.");
				System.out.println("  내 말 잘 들어.");
				System.out.println("  네가 할 수 있는 대답은 오로지 [1]과 [2]뿐이야.");
				System.out.println("  다시 기회를 주지.");
				System.out.println(" =================================================");
				System.out.print(">> ");
				selectNum1 = scan.nextInt();
				System.out.println();
			}while(!(selectNum1==1||selectNum1==2));
		}else if(selectNum==1) {
			select = true;
			return;
		}else if(selectNum==2) {
			select = false;
			return;
		}
	}
	
	public boolean isContain() {
		if(select==true) {
			return true;
		}else 
		return false;
	}
	
	
	
	/* 1. 프롤로그
	 * 당신의 이름은 무엇인가? - 이름 입력
	 * 그대가 젊은 왕인가? - 그렇다만 / 그렇진않
	 * 그럼, 내게서 왕위를 뺏어가 나를 이 지하감옥에 가두고, 영원히 나오지 못하게 한게 네놈이로군? - 그렇다 / 아니다..
	 * 어찌되었든, 앞으로는 네가 모든것을 책임져야 할거다. 있는 힘을 다하는게 좋을 걸. 이 놈이고 저 놈이고, 다 얼빠진 놈들 뿐이니까. - 누구이야기지? / 무슨이야기지?
	 * 오래 살고싶다면, 4개의 세력의 균형을 잘 유지해서, 잘 꾸려나가도록 해라. - 알겠다 / 아니된다 
	 * 망령은 왕을 말끄러미 보고는 사라졌다. 왕은 알현실로 들어갔다. */
	public void prologue(Scanner scan) {
		img.KingImage();
		int next = 0;
		while(true) {
			if(next==0) {
				System.out.println(" =================================================");
				System.out.println(" 그대가 젊은 왕인가?");
				System.out.println(" [1. 그렇다만]  "+"|"+"  [2. 그렇진않다]");
				System.out.println(" =================================================");
				System.out.print(">> ");
				select(scan);
				next++;
				System.out.println();
			}else if(next==1) {
				System.out.println(" =================================================");
				System.out.println(" 그럼, 내게서 왕위를 뺏어가 나를 이 지하감옥에 가두고");
				System.out.println(" 영원히 나오지 못하게 한게 네놈이로군?");
				System.out.println(" [1. 그렇다]  "+"|"+"  [2. 아니다] ");
				System.out.println(" =================================================");
				System.out.print(">> ");
				select(scan);
				next++;
				System.out.println();
			}else if(next==2) {
				System.out.println(" =================================================");
				System.out.println(" 어찌되었든, 앞으로는 네가 모든것을 책임져야 할거다.");
				System.out.println(" 있는 힘을 다하는게 좋을 걸.");
				System.out.println(" 이 놈이고 저 놈이고, 다 얼빠진 놈들 뿐이니까.");
				System.out.println(" [1. 누구 이야기지?]  "+"|"+"  [2. 무슨 이야기지?] ");
				System.out.println(" =================================================");
				System.out.print(">> ");
				select(scan);
				next++;
				System.out.println();
			}else if(next==3) {
				System.out.println(" =================================================");
				System.out.println(" 오래 살고싶다면 4개의 세력의 균형을");
				System.out.println(" 잘 유지해서 꾸려나가도록 해라.");
				System.out.println(" [1. 알겠다]  "+"|"+"  [2. 그게 전부인가?] ");
				System.out.println(" =================================================");
				System.out.print(">> ");
				select(scan);
				next++;
				System.out.println();
			}else if(next==4) {
				System.out.println(" =================================================");
				System.out.println(" 망령은 왕을 말끄러미 보고는 사라졌다.");
				System.out.println(" =================================================");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("************** 게임안내를 불러오는중입니다. **************");
				System.out.println();
				try {
					Thread.sleep(2000); // 2초 후
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("*******************<< 게임 안내 >>*******************");
				System.out.println(" 각 세력이 큰 힘을 가지거나 힘을 잃으면 왕은 어떻게 될까?");
				System.out.println(" 각 세력의 수치를 주목해주세요!");
				System.out.println(" [0]으로 떨어지지 않고 [100]으로 가득 차지 않도록");
				System.out.println(" 신하들의 요청과 질문에 성실하게 대답하여 각 세력의 균형을 하자!");
				System.out.println(" 과연 이번 왕은 얼마나 통치할 수 있을지...");
				System.out.println(" 모든 것은 '왕의 뜻대로...!'");
				System.out.println("**************************************************");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(3000); // 3초 후
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("**************************************************");
				System.out.println("************ ["+getKingName()+"]왕의 통치가 시작됩니다.");
				System.out.println("************ 왕이 알현실에 들어가고 있습니다. ");
				System.out.println("**************************************************");
				System.out.println();
				System.out.println();
				System.out.println();
				try {
					Thread.sleep(3000); // 3초 후
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			}
		}
	}
	
	
	
	
	// getter/setter
	public String getKingName() {
		return kingName;
	}

	public void setKingName(String kingName) {
		this.kingName = kingName;
	}
	
	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}

	//toString
	@Override
	public String toString() {
		return kingName;
	}
	
	
	
}
