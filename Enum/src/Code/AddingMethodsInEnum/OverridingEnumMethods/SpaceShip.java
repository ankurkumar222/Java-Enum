package Code.AddingMethodsInEnum.OverridingEnumMethods;


public enum SpaceShip {
	SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
	
	public String toString() {
		String id = name();
		String lower = id.substring(2).toLowerCase();
		return id.substring(0,2) + lower;
	}

	public static void main(String[] args) {
		for (SpaceShip s : values()) {
			System.out.println(s);
		}
	}
} 
