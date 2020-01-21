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
			System.out.println("Моля, въведете броя на яйцата: ");
			num = scan.nextLine();
			if (!isValidInput(num)) {
				System.out.println("Невалиден брой!");
			} else if(Integer.parseInt(num) > 0 && Integer.parseInt(num) < 11) {
					isValid = true;
			}else {
				System.out.println("Яйцата трябва да са 1 - 10 на брой!");
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
					"Моля, изберете съд като въведете една цифра от клавеатурата: 1./Джезве/, 2./Канче/, 3./Тенджера/ ");

			currentNum = scan.nextLine();
			if (!isValidInput(currentNum)) {
				System.out.println("Моля, въведете валидно число!");
			} else if (Integer.parseInt(currentNum) > 0 && Integer.parseInt(currentNum) < 4) {
					isValid = true;
			}else {
				System.out.println("Моля, въведете от 1 - 3!");
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
		System.out.println("Измиване на яйцата.");
	}

	public static void fillCookwareWithWater() {
		System.out.println("Заливане на яйцата със студена вода.");
	}

	public static void putCookwareOnHotPlate() {
		System.out.println("Слагане на котлона.");
	}

	public static StateOfEggs catchTimeWhenBoiled() {
		System.out.println("Засичане на времето, в което са заврели.");
		String minutes = "";
		int min = 3;
		boolean isValid = false;
		do {
			System.out.println("Моля, въведете минутите на варене на яйцата след завирането: ");
			minutes = scan.nextLine();
			if (!isValidInput(minutes)) {
				System.out.println("Невалиден вход!");
			}else {
				if(Integer.parseInt(minutes) > 0 && Integer.parseInt(minutes) < 11) {
					isValid = true;
					min = Integer.parseInt(minutes); 
				}else {
					System.out.println("Невалидни минути!");
				}
			}
		} while (!isValid);
		return StateOfEggs.getName(min);
	}

	public static void removeEggsFromHotPlate() {
		System.out.println("Сваляне от огъня.");
	}

	public static void changeTheWaterOfEggs() {
		System.out.println("Заливане със студена вода.");
	}
}
