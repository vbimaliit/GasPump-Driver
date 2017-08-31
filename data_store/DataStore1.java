package data_store;

public class DataStore1 extends DataStore {

	
	public int W; // Flag for Cash and Credit
	public int G; // Number of Gallons Variable
	public float Price; // Price of gas variable
	public float Total; // Total Amount Variable
	public float temp_a; // Temporary Variable for super gas unit  Price
	public float temp_b; // Temporary Variable for regular gas unit  Price
	public float sprice;// Variable for keeping super gas price
	public float rprice;// Variable for keeping regular gas price

	public int g; // Number of Gallons Temporary Variable
	public float total; // Total Amount Temporary Variable
	public int w; // Temporary Flag for Cash and Credit
	
	
	public float set_superprice()
	{
		return this.sprice = this.temp_a;
	}
	
	public float set_regularprice()
	{
		return this.rprice = this.temp_b;
	}
	
	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}
	
	
	public void set_G(int g) {

		this.G = this.g;

	}

	public int get_G() {

		return this.G = this.G + 1;

	}
	
	public float get_Price() {
		return this.Price;
	}
	
	public void set_sprice() {

		this.Price = this.sprice;

	}
	
	public void set_rprice() {

		this.Price = this.rprice;

	}
	public void set_Total(int total) {

		this.Total = this.total;

	}

	public float get_Total() {

		return this.total = this.Price * this.G; // Total amount=(Price*Number of Gallons)
	}
	
	
	

	
}
