package strategy;

import data_store.DataStore;
import data_store.DataStore1;

public class SetInitialValues_GP1 extends SetInitialValues {
	
	
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub
		((DataStore1)dataStore).set_G(0);
		((DataStore1)dataStore).set_Total(0);
	}
}
