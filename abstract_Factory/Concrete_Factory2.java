package abstract_Factory;

import data_store.DataStore;
import data_store.DataStore1;
import data_store.DataStore2;
import strategy.StoreCash_GP2;
import strategy.CancelMsg;
import strategy.CancelMsgGP;
import strategy.DisplayMenu;
import strategy.DisplayMenu_GP1;
import strategy.DisplayMenu_GP2;
import strategy.GasPumpedMsg;
import strategy.GasPumpedMsg_GP1;
import strategy.GasPumpedMsg_GP2;
import strategy.PayMsg;
import strategy.PayMsg_GP1;
import strategy.PayMsg_GP2;
import strategy.PayType;
import strategy.PaytypeGP;
import strategy.PrintReceiptMsg;
import strategy.PrintReceiptMsg_GP1;
import strategy.PrintReceiptMsg_GP2;
import strategy.PumpGasUnit;
import strategy.PumpGasUnit_GP1;
import strategy.PumpGasUnit_GP2;
import strategy.ReadyMsg;
import strategy.ReadyMsgGP;
import strategy.RejectMsg;
import strategy.RejectMsgGP;
import strategy.ReturnCash;
import strategy.ReturnCashGP;
import strategy.SetInitialValues;
import strategy.SetInitialValues_GP1;
import strategy.SetInitialValues_GP2;
import strategy.SetPrice;
import strategy.SetPrice_GP1;
import strategy.SetPrice_GP2;
import strategy.StopMsg;
import strategy.StopMsgGP;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.StoreData_GP1;
import strategy.StoreData_GP2;

public class Concrete_Factory2 implements Abstract_Factory{
	
	DataStore dataStore = new DataStore2();
	StoreData storedata = new StoreData_GP2();
	PayMsg paymsg = new PayMsg_GP2();
	StoreCash storecash = new StoreCash_GP2();
	DisplayMenu displaymenu = new DisplayMenu_GP2();
	ReadyMsg readymsg = new ReadyMsgGP();
	PumpGasUnit pumpgasunit = new PumpGasUnit_GP2();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg_GP2();
	StopMsg stopmsg = new StopMsgGP();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg_GP2();
	CancelMsg cancelmsg = new CancelMsgGP();
	SetInitialValues setinitialvalues = new SetInitialValues_GP2();
//	SetW setw = new SetW_GP1();
	PayType paytype = new PaytypeGP();
	SetPrice setprice = new SetPrice_GP2();
	ReturnCash returncash = new ReturnCashGP();

	
	public void ConcreteFactory() {

	}

	public DataStore CreateDataStore() {
		return (this.dataStore);
	}
	
	public DataStore GetDataStore() {
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
		return this.storecash;
	}

	@Override
	public DisplayMenu get_DisplayMenu() {
		// TODO Auto-generated method stub
		return this.displaymenu;
	}

	@Override
	public RejectMsg get_RejectMsg() {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}

	@Override
	public ReturnCash get_ReturnCash() {
		// TODO Auto-generated method stub
		return returncash;
	}

}
