package src;
import java.util.Scanner;

public class FishDriver {

	public static void main(String[] args) {

		Fish[] nicest = new Fish[3];

		for(int i = 0;i<nicest.length;i++) {
			Scanner name = new Scanner(System.in);
			System.out.println("Please enter fishs name:");
			String fishName = name.nextLine();
			Scanner friendliness = new Scanner(System.in);
			System.out.println("Please enter firnedliness level");
			int fishFriendliness = friendliness.nextInt();


			Fish amber = new Fish(fishName,fishFriendliness);

			Scanner name1 = new Scanner(System.in);
			System.out.println("Please enter fishs name:");
			String fishName1 = name.nextLine();
			Scanner friendliness1 = new Scanner(System.in);
			System.out.println("Please enter firnedliness level");
			int fishFriendliness1 = friendliness.nextInt();

			Fish james = new Fish(fishName1,fishFriendliness1);

			nicest[i] = Fish.nicestFish(amber,james);
			System.out.println(nicest[i]);
		}

		for(int j=0;j<nicest.length;j++) {

			for(int g=1;g<nicest.length;g++) {
				if(nicest[j].getFriendliness()>nicest[g].getFriendliness()) {
					System.out.println(nicest[j]);
				}
			}


		}

	}
}
