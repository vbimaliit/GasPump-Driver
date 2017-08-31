package strategy;

import data_store.DataStore;
import data_store.DataStore1;


public class StoreData_GP1 extends StoreData {

	public void StoreData(DataStore dataStore)
	{
		((DataStore1)dataStore).set_superprice();
		((DataStore1)dataStore).set_regularprice();
	}
}
