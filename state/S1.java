package state;

public class S1 extends state {

	MDAEFSM state = null;

	public S1(state s) {
		super(s);
		//this.state = state;
	}

	
	public void Activate() {
		// TODO Auto-generated method stub

	}

	
	public void Start() {
		// TODO Auto-generated method stub

	}

	
	public void PayCredit() {
		// TODO Auto-generated method stub
		MDAEFSM.mdaefsmState = (state.getS2State());

	}

	
	public void PayCash() {
		// TODO Auto-generated method stub
		opobj.StoreCash();
		
		opobj.DisplayMenu();
		MDAEFSM.mdaefsmState = (state.getS3State());

	}

	
	public void Reject() {
		// TODO Auto-generated method stub

	}

	
	public void Cancel() {
		// TODO Auto-generated method stub

	}

	
	public void Approved() {
		// TODO Auto-generated method stub

	}

	
	public void SelectGas(int g) {
		// TODO Auto-generated method stub

	}

	
	public void StartPump() {
		// TODO Auto-generated method stub

	}

	
	public void Pump() {
		// TODO Auto-generated method stub

	}

	
	public void StopPump() {
		// TODO Auto-generated method stub

	}

	
	public void Receipt() {
		// TODO Auto-generated method stub

	}

	
	public void NoReceipt() {
		// TODO Auto-generated method stub

	}


	@Override
	public void ReturnCash() {
		// TODO Auto-generated method stub
		
	}

}
