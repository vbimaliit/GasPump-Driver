package state;

public class S5 extends state {

	public S5(state s) {
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

	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub

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
		opobj.PumpGasUnit();
		opobj.GasPumpedMsg();
		MDAEFSM.mdaefsmState = (state.getS5State());

	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		opobj.StopMsg();
		MDAEFSM.mdaefsmState = (state.getS6State());

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
