/*
 * Vishal 
 * This class implements all the functions of the abstarct class and act as a concrete class
 */
package abstract_Factory;

import data_store.DataStore;
import data_store.DataStore1;
import strategy.CancelMsg;
import strategy.CancelMsgGP;
import strategy.DisplayMenu;
import strategy.DisplayMenu_GP1;
import strategy.GasPumpedMsg;
import strategy.GasPumpedMsg_GP1;
import strategy.PayMsg;
import strategy.PayMsg_GP1;
import strategy.PayType;
import strategy.PaytypeGP;
import strategy.PrintReceiptMsg;
import strategy.PrintReceiptMsg_GP1;
import strategy.PumpGasUnit;
import strategy.PumpGasUnit_GP1;
import strategy.ReadyMsg;
import strategy.ReadyMsgGP;
import strategy.RejectMsg;
import strategy.RejectMsgGP;
import strategy.ReturnCash;
import strategy.SetInitialValues;
import strategy.SetInitialValues_GP1;
import strategy.SetPrice;
import strategy.SetPrice_GP1;
//import strategy.SetW;
//import strategy.SetW_GP1;
import strategy.StopMsg;
import strategy.StopMsgGP;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.StoreData_GP1;

public class Concrete_Factory1 implements Abstract_Factory {
	
	
	DataStore dataStore = new DataStore1();
	StoreData storedata = new StoreData_GP1();
	PayMsg paymsg = new PayMsg_GP1();
	//StoreCash storecash = new StoreCash_GP1();
	DisplayMenu displaymenu = new DisplayMenu_GP1();
	RejectMsg rejectmsg = new RejectMsgGP();
	ReadyMsg readymsg = new ReadyMsgGP();
	PumpGasUnit pumpgasunit = new PumpGasUnit_GP1();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg_GP1();
	StopMsg stopmsg = new StopMsgGP();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg_GP1();
	CancelMsg cancelmsg = new CancelMsgGP();
	SetInitialValues setinitialvalues = new SetInitialValues_GP1();
	
//	SetW setw = new SetW_GP1();
	PayType paytype = new PaytypeGP();
	
	SetPrice setprice = new SetPrice_GP1();

	
	public void ConcreteFactory() {

	}

	public DataStore CreateDataStore() {
		return (this.dataStore);
	}
	
	public DataStore get_DataStore() {
		return this.dataStore;
	}
	@Override
	public StoreData get_StoreData() {
		// TODO Auto-generated method stub
		return this.storedata;
	}

	@Override
	public PayMsg get_PayMsg() {
		// TODO Auto-generated method stub
		return this.paymsg;
	}

	@Override
	public StoreCash get_StoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisplayMenu get_DisplayMenu() {
		// TODO Auto-generated method stub
		return this.displaymenu;
	}

	@Override
	public RejectMsg get_RejectMsg() {
		// TODO Auto-generated method stub
		return this.rejectmsg;
	}

//	@Override
//	public SetW CreateSetW() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public SetPrice get_SetPrice() {
		// TODO Auto-generated method stub
		return this.setprice;
	}

	@Override
	public ReadyMsg get_ReadyMsg() {
		// TODO Auto-generated method stub
		return this.readymsg;
	}

	@Override
	public SetInitialValues get_SetInitialValues() {
		// TODO Auto-generated method stub
		return this.setinitialvalues;
	}

	@Override
	public PumpGasUnit get_PumpGasUnit() {
		// TODO Auto-generated method stub
		return this.pumpgasunit;
	}

	@Override
	public GasPumpedMsg get_GasPumpedMsg() {
		// TODO Auto-generated method stub
		return this.gaspumpedmsg;
	}

	@Override
	public StopMsg get_StopMsg() {
		// TODO Auto-generated method stub
		return this.stopmsg;
	}

	@Override
	public PrintReceiptMsg get_PrintReceiptMsg() {
		// TODO Auto-generated method stub
		return this.printreceiptmsg;
	}

	@Override
	public CancelMsg get_CancelMsg() {
		// TODO Auto-generated method stub
		return this.cancelmsg;
	}

	@Override
	public PayType get_PayType() {
		// TODO Auto-generated method stub
		return this.paytype;
	}

	@Override
	public ReturnCash get_ReturnCash() {
		// TODO Auto-generated method stub
		return null;
	}

}
