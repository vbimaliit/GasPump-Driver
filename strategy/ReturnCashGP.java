package strategy;

import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;

public class ReturnCashGP extends ReturnCash{

	@Override
	public void ReturnCash(DataStore datastore) {
		// TODO Auto-generated method stub
		int cash =((DataStore2)datastore).get_cash();
		int unit_price = ((DataStore2)datastore).get_Price();
		int liters = ((DataStore2)datastore).get_L() - 2;
		
		int s = cash - (unit_price * liters);
		
		
		System.out.println("the amount of cash to be returned :$"+ s);
		
	}
	

}
