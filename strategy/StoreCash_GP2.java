package strategy;

import data_store.DataStore;
import data_store.DataStore2;

public class StoreCash_GP2 extends StoreCash {

	@Override
	
		// TODO Auto-generated method stub
		
		public void StoreCash(DataStore dataStore)
		{
			((DataStore2)dataStore).set_cash();
			System.out.println("Gas Pump 3:: Cash Stored: $" + ((DataStore2)dataStore).get_cash() );
		}

	

}
