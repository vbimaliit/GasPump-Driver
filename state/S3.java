package state;
import Maindriver.MainDriver;

public class S3 extends state {
	public S3(state s) {
		super(s);
		//this.state = state;
	}
	
	MDAEFSM state = null;

	
	@Override
	public void Activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void PayCash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub
		if (MainDriver.gaspump == 1){
		opobj.CancelMsg();
		MDAEFSM.mdaefsmState = (state.getS0State());
		}
		else if(MainDriver.gaspump == 2){
			opobj.CancelMsg();
			opobj.ReturnCash();
			MDAEFSM.mdaefsmState = (state.getS0State());
		}

	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub
		opobj.SetPrice();
		MDAEFSM.mdaefsmState = (state.getS4State());

	}

	@Override
	public void StartPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ReturnCash() {
		// TODO Auto-generated method stub
		
	}

	


}
