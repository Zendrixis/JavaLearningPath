package src;
import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {

		Product[] myProducts = new Product[2];
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
					System.out.println("Enter \"Yes\" to continue or \"No\"to stop the program ");
					controlvar = controls.nextLine();
					if(controlvar.equals("No"))
						break;

				}
				catch(Exception E) {
					System.out.println("Your data is inserted wrong");
				}
			}
		}
	

	static void displayInventory(Product[] myProducts) {
		for(int g = 0;g<myProducts.length;g++) {
			System.out.println(myProducts[g]);
		}



	}


}




