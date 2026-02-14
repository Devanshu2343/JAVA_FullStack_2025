package encapsulation;

public class Product {

	private int price;
	
	//setter
	public void setPrice(int price ) {
		//validation
		if (price>0) {
			this.price = price ;
		}
	}
	
	//getter
	public int getPrice() {
		return price ;
	}
	
//	public int setPrice(int price) {
//		this.price = price ;
//		return  price ;
//	}

}
