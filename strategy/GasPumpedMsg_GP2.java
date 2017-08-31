package strategy;

import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;

public class GasPumpedMsg_GP2 extends GasPumpedMsg {

	@Override
	public void GasPumpedMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println(((DataStore2)dataStore).get_L() + " Liters(s) Pumped"  );
		System.out.println("\nPress 9 to Continue Pumping:\n");
	}

}
