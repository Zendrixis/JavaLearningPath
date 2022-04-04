package src;

public class FishDriver {

	public static void main(String[] args) {
		Fish amber = new Fish("AngelFish", 5);
		Fish james = new Fish("Guppy",3);
		Fish nicest = Fish.nicestFish(amber,james);
		System.out.println(nicest);

	}

}
