package state;

public class S2 extends state {
	public S2(state s) {
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
		opobj.RejectMsg();
		MDAEFSM.mdaefsmState = (state.getS0State());

	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		opobj.SetW();
		opobj.DisplayMenu();
		MDAEFSM.mdaefsmState = (state.getS3State());

	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub

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
