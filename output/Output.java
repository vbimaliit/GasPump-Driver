package output;
/* output class for performing operations
 * 
 */

import abstract_Factory.Abstract_Factory;
import data_store.DataStore;
import strategy.CancelMsg;
import strategy.DisplayMenu;
import strategy.GasPumpedMsg;
import strategy.PayMsg;
import strategy.PrintReceiptMsg;
import strategy.PumpGasUnit;
import strategy.ReadyMsg;
import strategy.RejectMsg;
import strategy.SetInitialValues;
import strategy.SetPrice;
import strategy.StopMsg;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.ReturnCash;

public class Output {

	Abstract_Factory factory = null;
	DataStore dataStore = null;
	
	
	public Output(Abstract_Factory factory, DataStore dataStore) {
		this.factory = factory;
		this.dataStore = dataStore;
	}
	
	public void StoreData() {
		// TODO Auto-generated method stub
		System.out.println("\n !!Welcome to gas pump. Its activated!! \n");
		StoreData storedata = factory.get_StoreData();
		storedata.StoreData(dataStore);
	}
	
	public void PayMsg() {
		// TODO Auto-generated method stub
		PayMsg paymsg = factory.get_PayMsg();
		paymsg.PayMsg();
	}

	public void StoreCash() {
		// TODO Auto-generated method stub
		StoreCash storecash = factory.get_StoreCash();
		storecash.StoreCash(dataStore);
		
	}

	public void SetW() {
		// TODO Auto-generated method stub
		
	}

	public void DisplayMenu() {
		// TODO Auto-generated method stub
		DisplayMenu displaymenu = factory.get_DisplayMenu();
		displaymenu.DisplayMenu();
		
	}

	public void RejectMsg() {
		// TODO Auto-generated method stub
		RejectMsg rejectmsg = factory.get_RejectMsg();
		rejectmsg.RejectMsg();
	}

	public void CancelMsg() {
		// TODO Auto-generated method stub
		CancelMsg cancelmsg = factory.get_CancelMsg();
		cancelmsg.cancelmsg();
		
		
	}

	public void SetPrice() {
		// TODO Auto-generated method stub
		SetPrice setprice = factory.get_SetPrice();
		setprice.SetPrice(dataStore);
		
	}

	public void SetInitialValues() {
		// TODO Auto-generated method stub
		SetInitialValues setinitialvalues = factory.get_SetInitialValues();
		setinitialvalues.SetInitialValues(dataStore);
		
	}

	public void ReadyMsg() {
		// TODO Auto-generated method stub
		ReadyMsg readymsg = factory.get_ReadyMsg();
		readymsg.ReadyMsg();
		
	}

	public void PumpGasUnit() {
		// TODO Auto-generated method stub
		PumpGasUnit pumpgasunit = factory.get_PumpGasUnit();
		pumpgasunit.PumpGasUnit();
		
	}

	public void GasPumpedMsg() {
		// TODO Auto-generated method stub
		GasPumpedMsg gaspumpedmsg = factory.get_GasPumpedMsg();
		gaspumpedmsg.GasPumpedMsg(dataStore);
		
	}

	public void StopMsg() {
		// TODO Auto-generated method stub
		StopMsg stopmsg = factory.get_StopMsg();
		stopmsg.StopMsg();
		
	}

	public void PrintReceiptMsg() {
		// TODO Auto-generated method stub
		System.out.println("\n RECEIPT: \n");
		PrintReceiptMsg printreceiptmsg = factory.get_PrintReceiptMsg();
		printreceiptmsg.PrintReceiptMsg(dataStore);
		
	}
	
	public void ReturnCash(){
		ReturnCash returncash = factory.get_ReturnCash();
		returncash.ReturnCash(dataStore);
		
	}

	

}
