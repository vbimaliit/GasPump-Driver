/* Author Visal
 * This is code for input processor for gas pump 1
 */

package gaspump;

import data_store.DataStore;
import data_store.DataStore1;

import state.MDAEFSM;

public class GasPump_1 {


		MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

		DataStore dataStore = null; // Pointer to DataStore

		public GasPump_1(MDAEFSM mdaefsm, DataStore dataStore) {
			this.mdaefsm = mdaefsm;
			this.dataStore = dataStore;

		}

		public void Activate(float superprice, float regularprice) {
			// TODO Auto-generated method stub
			if (superprice > 0 && regularprice > 0)
				((DataStore1) dataStore).temp_a = superprice;
			    ((DataStore1) dataStore).temp_b = regularprice;

			mdaefsm.Activate();
		}
		// TODO Auto-generated method stub

		public void Start() {
			// TODO Auto-generated method stub
			mdaefsm.Start();
		}

		public void PayCredit() {
			// TODO Auto-generated method stub
	//		mdaefsm.PayCredit();
			mdaefsm.PayType(1);
			System.out.println("waiting for payment approval");
		}

		public void Reject() {
			// TODO Auto-generated method stub
			mdaefsm.Reject();
			
		}

		public void Cancel() {
			// TODO Auto-generated method stub
			mdaefsm.Cancel();
			
		}

		public void Approved() {
			// TODO Auto-generated method stub
			mdaefsm.Approved();
			
		}

		public void Regular() {
			// TODO Auto-generated method stub
			((DataStore1) dataStore).set_rprice();
			mdaefsm.SelectGas(1);

			System.out.println("!!Regular Gas is Selected!!\n");
			
		}

		public void Super() {
			// TODO Auto-generated method stub
			((DataStore1) dataStore).set_sprice();
			mdaefsm.SelectGas(2);

			System.out.println("!!Super Gas is Selected!!\n");
			
		}

		public void StartPump() {
			// TODO Auto-generated method stub
			mdaefsm.StartPump();
			
		}

		public void Pump() {
			mdaefsm.Pump();
			// TODO Auto-generated method stub
			
		}

		public void StopPump() {
			// TODO Auto-generated method stub
			mdaefsm.StopPump();
			mdaefsm.Receipt();
			
		}
		
		
		
	}


