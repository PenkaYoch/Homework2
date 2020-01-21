package members;

public enum StateOfEggs {
	SOFT("Жълтъкът и голяма част от белтъка са течни"),
	MEDIUM("Жълтъкът все още е течен"),
	HARD("Белтъкът и жълтъкът са твърди");
	
	private final String name;

	private StateOfEggs(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public static StateOfEggs getName(int number) {
		if(number <= 3) {
			return StateOfEggs.SOFT;
		}else if(number > 3 && number < 5) {
			return StateOfEggs.MEDIUM;
		}else {
			return StateOfEggs.HARD;
		}
	}
	
	public static String getName(StateOfEggs state) {
		return state.name;
	}
}
