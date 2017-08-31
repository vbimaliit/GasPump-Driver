package strategy;

import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;

public class SetInitialValues_GP2 extends SetInitialValues {

	@Override
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub

		((DataStore2)dataStore).set_L(0);
		((DataStore2)dataStore).set_Total(0);
	}

}
