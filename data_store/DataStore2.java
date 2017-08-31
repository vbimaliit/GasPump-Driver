package data_store;

public class DataStore2 extends DataStore {

	public int temp_a;
	public int temp_b;
	public int temp_c;
	public int pprice;
	public int sprice;
	public int rprice;
	public int Price;
	public int total;
	public int Total;
	public int l;
	public int L;
	public int w;
	public int W;
	public int temp_cash;
	public int cash;
	
	public int set_premium_price()
	{
		 return this.pprice = this.temp_a;
	}
	
	public int set_super_price()
	{
		return this.sprice = this.temp_b;
	}
	
	public int set_regular_price()
	{
		return  rprice = this.temp_c;
	}
	
	public void set_pprice()
	{
		this.Price = this.pprice;
	}
	
	public void set_sprice()
	{
		this.Price = this.sprice;
	}
	
	public void set_rprice()
	{
		this.Price = this.rprice;
	}
	
	public void set_Total(int total) {

		this.Total = this.total;

	}

	public int get_Total() {

		return this.total = this.Price * this.L;// Total amount=(Price*Number of Liters)
	}
	
	public int set_L(int l) {
		return this.L = this.l;
	}

	public int get_L() {

		return this.L = this.L + 1;

	}
	
	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}
	
	public int get_Price() {

		return this.Price;
	}
	
	public int set_cash() {

		return this.cash = this.temp_cash;
	}

	public int get_cash() {

		return this.cash;
	}
}
