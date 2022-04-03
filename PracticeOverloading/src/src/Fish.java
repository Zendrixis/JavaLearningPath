package src;

public class Fish {
	private String typeOfFish;
	private int friendliness;
	private String friendlinessEvo;

	public Fish() {
		typeOfFish = "Unknown";
		friendliness = 3;

	}
	public Fish(String t, int f) {
		this.typeOfFish = t;
		this.friendliness = f;

	}

	public int getFriendliness() {
		return friendliness;
	}
	
	public String getFriendliness1() {
		switch(friendliness) {
		case 1: 
			this.friendlinessEvo = "Mean";
			break;
		case 2: 
			this.friendlinessEvo = "Not friendly";
			break;
		case 3: 
			this.friendlinessEvo  = "Neutral";
			break;
		case 4: 
			this.friendlinessEvo = "friendly";
			break;
		case 5: 
			this.friendlinessEvo = "Very friendly";
			break;
		default:System.out.println("Error");
		
		}
		return this.friendlinessEvo;
	}
	
	
	public String toString() {
		return "Fish type "+this.typeOfFish
				+"\nFriendliness: "+getFriendliness1();
	}
	
}
