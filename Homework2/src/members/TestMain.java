package members;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		HungryPerson chef = new HungryPerson(HungryPerson.inputName());
		List<Eggs> portionOfEggs = new ArrayList<Eggs>();
		Scanner scan = new Scanner(System.in);
		String option = "N";
		do {
			Eggs portion = new Eggs();
			System.out.println("------------------------------------------------------");
			System.out.println("------------------------------------------------------");
			System.out.println("Нека приготвянето на яйцата да започне: ");
			System.out.println("------------------------------------------------------");
			System.out.println("------------------------------------------------------");
			int numberOfEggs = Eggs.inputTheNumberOfEggs();
			portion.setNumber(numberOfEggs);
			System.out.println("Броят на яйцата е: "+ portion.getNumber());
			Cookware cookW = Eggs.selectCookware();
			System.out.println("Избраният съд за яйцата е: " + Cookware.getNameOfCookware(cookW));
			portion.setSelectedCookware(cookW);
			System.out.println("------------------------------------------------------");
			Eggs.washTheEggs();
			System.out.println("------------------------------------------------------");
			Eggs.fillCookwareWithWater();
			System.out.println("------------------------------------------------------");
			Eggs.putCookwareOnHotPlate();
			System.out.println("------------------------------------------------------");
			StateOfEggs state = Eggs.catchTimeWhenBoiled();
			System.out.println(StateOfEggs.getName(state));
			portion.setState(state);
			System.out.println("------------------------------------------------------");
			Eggs.removeEggsFromHotPlate();
			System.out.println("------------------------------------------------------");
			Eggs.changeTheWaterOfEggs();
			System.out.println("Яйцата са готови!");

			portionOfEggs.add(portion);
			System.out.println("Моля, въведете 'N' - за приключване на въвеждането или друг символ за продължение: ");
			option = scan.nextLine();
		} while (!option.equals("N"));
		System.out.println("The End!");
	}

}
