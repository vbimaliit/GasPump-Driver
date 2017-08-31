/* Author Visal
 * This is code for input processor for gas pump 1
 */
package gaspump;

import data_store.DataStore;
import data_store.DataStore2;
import state.MDAEFSM;

public class GasPump_2 {
	
	MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

	DataStore dataStore = null; // Pointer to DataStore

	public GasPump_2(MDAEFSM efsm, DataStore dataStore) {
		
		this.mdaefsm = efsm;
		this.dataStore = dataStore;
		// TODO Auto-generated constructor stub
	}

	public void Activate(int regularprice,int premiumprice, int superprice ) {
		// TODO Auto-generated method stub
		
		if (premiumprice >0 && superprice > 0 && regularprice >0 ){
			((DataStore2) dataStore).temp_a = premiumprice;
			((DataStore2) dataStore).temp_b = superprice;
			((DataStore2) dataStore).temp_c = regularprice;
			mdaefsm.Activate();
		}
		
	}

	public void Start() {
		// TODO Auto-generated method stub
		mdaefsm.Start();
	}

	public void PayCash(int cash) {
		// TODO Auto-generated method stub
		if (cash > 0){
			((DataStore2) dataStore).temp_cash = cash;
			//((DataStore2) dataStore).w = 0;
			mdaefsm.PayType(2);
		}
		
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		mdaefsm.Cancel();
		mdaefsm.ReturnCash();
	}

	public void Regular() {
		// TODO Auto-generated method stub
		
		((DataStore2) dataStore).set_rprice();
		mdaefsm.SelectGas(1);

		System.out.println("!!Regular Gas is Selected!!\n");
		
	}

	public void Premium() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).set_pprice();
		mdaefsm.SelectGas(2);

		System.out.println("!!Premium Gas is Selected!!\n");
		
	}

	public void Super() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).set_sprice();
		mdaefsm.SelectGas(3);

		System.out.println("!!Super Gas is Selected!!\n");
		
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		mdaefsm.StartPump();
		
	}

	public void Pump() {
		// TODO Auto-generated method stub
		if (((DataStore2) dataStore).cash < (((DataStore2) dataStore).L + 1)
				* ((DataStore2) dataStore).Price) {
			mdaefsm.StopPump();
			System.out.println("!!Pump Stopped due to Insufficient Cash!!\n");
		} else

			mdaefsm.Pump();
		
	}

	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.StopPump();
	}

	public void Receipt() {
		// TODO Auto-generated method stub
		mdaefsm.Receipt();
		mdaefsm.ReturnCash();
	}

	public void NoReceipt() {
		// TODO Auto-generated method stub
		mdaefsm.NoReceipt();
		mdaefsm.ReturnCash();
	}
	
	

}
