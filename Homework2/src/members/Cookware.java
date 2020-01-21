package members;

public enum Cookware {
	JEZVE("Джезве"),
	MUG("Канче"),
	POT("Тенджера");
	
	private final String nameOfCookware;

	private Cookware(String nameOfCookware) {
		this.nameOfCookware = nameOfCookware;
	}

	public String getNameOfCookware() {
		return nameOfCookware;
	}
	
	public static Cookware getNameOfCookware(int number) {
		Cookware currentCookware;
		switch (number) {
		case 1:
			currentCookware = JEZVE;
			break;
		case 2: 
			currentCookware = MUG;
			break;
		default:
			currentCookware = POT;
			break;
		}
		return currentCookware;
	}
	
	public static String getNameOfCookware(Cookware cookW) {
		return cookW.nameOfCookware;
	}
}
