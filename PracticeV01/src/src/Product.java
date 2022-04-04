package src;

public class Product {

	private String name;
	private int number;
	private int quantity;
	private int price;
	boolean status;

	Product(String n,int g,int i,int j){
		this.name = n;
		this.number = g;
		this.quantity = i;
		this.price = j;

	}


	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String n1) {
		this.name = n1;
	}

	public void setNumber(int g1) {
		this.number = g1;
	}

	public void setQuantity(int i1) {
		this.quantity = i1;
	}

	public void setPrice(int j1) {
		this.price = j1;
	}

	public boolean getStatus() {
		if(quantity>0) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}

	public String toString() {
		return "Product NAME: "+getName()
		+"\nNUMBER: "+getNumber()
		+"\nQUANTITY: "+getQuantity()
		+"\nPRICE: "+getPrice()
		+"\nSTATUS: "+getStatus();

	}
}

