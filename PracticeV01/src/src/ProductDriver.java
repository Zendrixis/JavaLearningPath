package src;
import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		Scanner maxProducts1 = new Scanner(System.in);
		System.out.println("Please enter how many products you wish to add as an integer number");
		int maxProducts = maxProducts1.nextInt();

		Product[] myProducts = new Product[maxProducts];
		String controlvar="Yes";

		for(int i = 0;i<myProducts.length;i++) {

			try {
				Scanner name = new Scanner(System.in);
				System.out.println("\nPlease Enter product name: ");
				String name1 = name.nextLine();
				Scanner number = new Scanner(System.in);
				System.out.println("Please enter product number: ");
				int number1 = number.nextInt();
				Scanner quantity = new Scanner(System.in);
				System.out.println("Please enter product quantity available: ");
				int quantity1 = quantity.nextInt();
				Scanner price = new Scanner(System.in);
				System.out.println("Please enter product price: ");
				int price1 = price.nextInt();


				myProducts[i] = new Product(name1,number1,quantity1,price1);
				Scanner controls = new Scanner(System.in);
				System.out.println("Enter \"No\"to stop the program ");
				controlvar = controls.nextLine();
				if(controlvar.equals("No"))
					break;

			}
			catch(Exception E) {
				System.out.println("Your data is inserted wrong");
			}
		}
		Scanner display1 = new Scanner(System.in);
		System.out.println("Do you wish to display products content ?If yes please type \"SHOW\"");
		String display = display1.nextLine();
		if(display.equals("SHOW"))
			displayInventory(myProducts);
	}


	static void displayInventory(Product[] myProducts) {
		for(int g=0;g<myProducts.length;g++) {
			System.out.println("\n"+myProducts[g]);
		}

	}
}







