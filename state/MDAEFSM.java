package state;

import abstract_Factory.Abstract_Factory;
import data_store.DataStore;
import output.Output;

public class MDAEFSM {


	static state mdaefsmState = null;
	static state S,S0,S1,S2,S3,S4,S5,S6;
	
	Abstract_Factory factory = null;

	public MDAEFSM() {
		

		
		S = new S(mdaefsmState);
		S0 = new S0(mdaefsmState);
		S1 = new S1(mdaefsmState);
		S2 = new S2(mdaefsmState);
		S3 = new S3(mdaefsmState);
		S4 = new S4(mdaefsmState);
		S5 = new S5(mdaefsmState);
		S6 = new S6(mdaefsmState);
		mdaefsmState = S;
		
	}
	public void Activate() {

		mdaefsmState.Activate();
		printCurrentState();

	}
	
	public void Start() {

		mdaefsmState.Start();
		printCurrentState();
	}
   public void PayType(int t ) {
	   if(t==1){
		   	mdaefsmState.PayCredit();
			printCurrentState();
	   }else{
		   	mdaefsmState.PayCash();
			printCurrentState();  
	   	}
	
	}


	public void Reject() {

		mdaefsmState.Reject();
		printCurrentState();

	}

	public void Cancel() {

		mdaefsmState.Cancel();
		printCurrentState();

	}

	public void Approved() {

		mdaefsmState.Approved();
		printCurrentState();
	}

	public void StartPump() {

		mdaefsmState.StartPump();
		printCurrentState();
	}

	public void Pump() {

		mdaefsmState.Pump();
		printCurrentState();
	}

	public void StopPump() {

		mdaefsmState.StopPump();
		printCurrentState();
	}

	public void SelectGas(int g) {

		mdaefsmState.SelectGas(g);
		printCurrentState();
	}

	public void Receipt() {

		mdaefsmState.Receipt();
		printCurrentState();
	}

	public void NoReceipt() {

		mdaefsmState.NoReceipt();
		printCurrentState();
	}

	public void setState(state mdaefsmState) {
		this.mdaefsmState = mdaefsmState;
	}

	public state getMachineState() {
		return mdaefsmState;
	}

	public static state getS0State() {
		return S0;
	}

	public static state getS1State() {
		return S1;
	}

	public static state getS2State() {
		return S2;
	}

	public static state getS3State() {
		return S3;
	}

	public static state getS4State() {
		return S4;
	}

	public static state getS5State() {
		return S5;
	}

	public static state getS6State() {
		return S6;
	}
	
	public void printCurrentState() {
		System.out.println("\n" + "Current State : "
				+ mdaefsmState.getClass().getName() + "\n");
	}
	public void ReturnCash() {
		// TODO Auto-generated method stub
		mdaefsmState.ReturnCash();
		printCurrentState();
		
	}


}
