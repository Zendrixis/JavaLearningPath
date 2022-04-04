package src;
import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		Scanner maxProducts1 = new Scanner(System.in);
		System.out.println("Please enter how many products you wish to add as an integer number");
		int maxProducts = maxProducts1.nextInt();// how many products you wish to add ?

		Product[] myProducts = new Product[maxProducts];
	

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

				Scanner choice1 = new Scanner(System.in); // menu controls beginning
				System.out.println("1. View Inventory"
						+"\n2. Add Stock"
						+"\n3. Deduct Stock"
						+"\n4. Discontinue Stock"
						+"\n0. Exit");
				int choice = choice1.nextInt();
				if(choice==0)
					break;

				switch(choice) {
				case 1:
					displayInventory(myProducts);
					break;
				case 2:
					System.out.println("set total stock available");
					break;
				case 3:
					break;
				case 4:
					break;
		        default:
					System.out.println("Wrong choice.");
				}// menu controls end


			}
			catch(Exception E) {
				System.out.println("Your data is inserted wrong");
			}
		}// end loop that will add products



	}


	static void displayInventory(Product[] myProducts) {
		for(int g=0;g<myProducts.length;g++) {
			System.out.println("\n"+myProducts[g]);
		}//end method for display of products
	}


	static void addInventory(Product[]myProducts,Scanner in) {
		int numInput = in.nextInt();
		Scanner quantityScan = new Scanner(System.in);
		System.out.println("Please enter quantity to add to inventory");
		int quantityAdded = quantityScan.nextInt();
		myProducts[numInput].setQuantity(quantityAdded);
	}

}







