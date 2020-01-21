package members;
import java.util.Scanner;

public class HungryPerson {
	private String name;

	public HungryPerson() {
		super();
	}

	public HungryPerson(String name) {
		super();
		this.name = name;
	}
	
	public static String inputName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Името на гладният човек е: ");
		String name = scan.nextLine();
		return name;
	}
}
