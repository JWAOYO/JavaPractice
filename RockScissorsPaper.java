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
		
		System.out.println("���� ������ �Է��ϼ���.");
		System.out.println("1. ���� 2. ���� 3. ��");
		
		String userChoice;
		userChoice = userEnter.next();
		
		user=Integer.parseInt(userChoice);
		
		if(user==1) {
			System.out.println("������ �Է��߽��ϴ�.");
		}else if(user==2) {
			System.out.println("������ �Է��߽��ϴ�.");
		}else if(user==3) {
			System.out.println("���� �Է��߽��ϴ�.");
		} else {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		Random compuNum = new Random();
		computer = compuNum.nextInt(3)+1;
		
		if(computer==1) {
			System.out.println("��ǻ�Ͱ� ������ �Է��߽��ϴ�.");
		}else if(computer==2) {
			System.out.println("��ǻ�Ͱ� ������ �Է��߽��ϴ�.");
		}else if(computer==3) {
			System.out.println("��ǻ�Ͱ� ���� �Է��߽��ϴ�.");
		} else {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
		}
		
		if(computer==user) {
			System.out.println("�����ϴ�.");
			}else if(computer==1&user==2) {
				System.out.println("������ �̰���ϴ�.");
			}else if(computer==1&user==3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else if(computer==2&user==1) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else if(computer==2&user==3) {
				System.out.println("������ �̰���ϴ�.");
			}else if(computer==3&user==1) {
				System.out.println("������ �̰���ϴ�.");
			}else if(computer==3&user==2) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		
	}
}