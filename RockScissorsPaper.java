import java.util.Scanner;
import java.util.Random;

public class RockScissorsPaper {
	
	public static int user;
	public static int computer;
	
//	public boolean compare() {
//		
//	}
	public static void main(String[] args) {
		
		Scanner userEnter=new Scanner(System.in);
		
		System.out.println("다음 동작을 입력하세요.");
		System.out.println("1. 가위 2. 바위 3. 보");
		
		String userChoice;
		userChoice = userEnter.next();
		
		user=Integer.parseInt(userChoice);
		
		if(user==1) {
			System.out.println("가위를 입력했습니다.");
		}else if(user==2) {
			System.out.println("바위를 입력했습니다.");
		}else if(user==3) {
			System.out.println("보를 입력했습니다.");
		} else {
			System.out.println("올바른 입력이 아닙니다.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		
		Random compuNum = new Random();
		computer = compuNum.nextInt(3)+1;
		
		if(computer==1) {
			System.out.println("컴퓨터가 가위를 입력했습니다.");
		}else if(computer==2) {
			System.out.println("컴퓨터가 바위를 입력했습니다.");
		}else if(computer==3) {
			System.out.println("컴퓨터가 보를 입력했습니다.");
		} else {
			System.out.println("올바른 입력이 아닙니다.");
		}
		
		if(computer==user) {
			System.out.println("비겼습니다.");
			}else if(computer==1&user==2) {
				System.out.println("유저가 이겼습니다.");
			}else if(computer==1&user==3) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(computer==2&user==1) {
				System.out.println("컴퓨터가 이겼습니다.");
			}else if(computer==2&user==3) {
				System.out.println("유저가 이겼습니다.");
			}else if(computer==3&user==1) {
				System.out.println("유저가 이겼습니다.");
			}else if(computer==3&user==2) {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		
	}
}