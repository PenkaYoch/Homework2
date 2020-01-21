package members;

import java.util.Scanner;

public class Eggs {
	private StateOfEggs state;
	private int minutesForBoiling;
	private Cookware selectedCookware;
	private int number;
	private HungryPerson chef;

	static Scanner scan = new Scanner(System.in);

	public Eggs() {
		super();
	}

	public Eggs(StateOfEggs state, int minutesForBoiling, Cookware selectedCookware, int number, HungryPerson chef) {
		super();
		this.state = state;
		this.minutesForBoiling = minutesForBoiling;
		this.selectedCookware = selectedCookware;
		this.number = number;
		this.chef = chef;
	}

	public StateOfEggs getState() {
		return state;
	}

	public void setState(StateOfEggs state) {
		this.state = state;
	}

	public int getMinutesForBoiling() {
		return minutesForBoiling;
	}

	public void setMinutesForBoiling(int minutesForBoiling) {
		this.minutesForBoiling = minutesForBoiling;
	}

	public Cookware getSelectedCookware() {
		return selectedCookware;
	}

	public void setSelectedCookware(Cookware selectedCookware) {
		this.selectedCookware = selectedCookware;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HungryPerson getChef() {
		return chef;
	}

	public void setChef(HungryPerson chef) {
		this.chef = chef;
	}

	public static int inputTheNumberOfEggs() {
		String num = "";
		int numberOfEggs = 0;
		boolean isValid = false;
		do {
			System.out.println("����, �������� ���� �� ������: ");
			num = scan.nextLine();
			if (!isValidInput(num)) {
				System.out.println("��������� ����!");
			} else if(Integer.parseInt(num) > 0 && Integer.parseInt(num) < 11) {
					isValid = true;
			}else {
				System.out.println("������ ������ �� �� 1 - 10 �� ����!");
			}
		} while (!isValid);
		numberOfEggs = Integer.parseInt(num);
		return numberOfEggs;
	}

	public static Cookware selectCookware() {
		String currentNum = "";
		int option = 0;
		boolean isValid = false;
		do {
			System.out.println(
					"����, �������� ��� ���� �������� ���� ����� �� ������������: 1./������/, 2./�����/, 3./��������/ ");

			currentNum = scan.nextLine();
			if (!isValidInput(currentNum)) {
				System.out.println("����, �������� ������� �����!");
			} else if (Integer.parseInt(currentNum) > 0 && Integer.parseInt(currentNum) < 4) {
					isValid = true;
			}else {
				System.out.println("����, �������� �� 1 - 3!");
			}
		} while (!isValid);
		option = Integer.parseInt(currentNum);
		return Cookware.getNameOfCookware(option);
	}

	private static boolean isValidInput(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void washTheEggs() {
		System.out.println("�������� �� ������.");
	}

	public static void fillCookwareWithWater() {
		System.out.println("�������� �� ������ ��� ������� ����.");
	}

	public static void putCookwareOnHotPlate() {
		System.out.println("������� �� �������.");
	}

	public static StateOfEggs catchTimeWhenBoiled() {
		System.out.println("�������� �� �������, � ����� �� �������.");
		String minutes = "";
		int min = 3;
		boolean isValid = false;
		do {
			System.out.println("����, �������� �������� �� ������ �� ������ ���� ����������: ");
			minutes = scan.nextLine();
			if (!isValidInput(minutes)) {
				System.out.println("��������� ����!");
			}else {
				if(Integer.parseInt(minutes) > 0 && Integer.parseInt(minutes) < 11) {
					isValid = true;
					min = Integer.parseInt(minutes); 
				}else {
					System.out.println("��������� ������!");
				}
			}
		} while (!isValid);
		return StateOfEggs.getName(min);
	}

	public static void removeEggsFromHotPlate() {
		System.out.println("������� �� �����.");
	}

	public static void changeTheWaterOfEggs() {
		System.out.println("�������� ��� ������� ����.");
	}
}
