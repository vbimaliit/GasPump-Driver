/**
 * 
 */
package state;

import output.Output;

/**
 * State class performing activate function
 */
public class S extends state {

	
	

	public S(state s) {
		super(s);
		
	}

	/* (non-Javadoc)
	 * @see state.state#Activate()
	 */
	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		opobj.StoreData();
		MDAEFSM.mdaefsmState = MDAEFSM.getS0State();
	}

	/* (non-Javadoc)
	 * @see state.state#Start()
	 */
	@Override
	public void Start() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#PayCredit()
	 */
	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#PayCash()
	 */
	@Override
	public void PayCash() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#Reject()
	 */
	@Override
	public void Reject() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#Cancel()
	 */
	@Override
	public void Cancel() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#Approved()
	 */
	@Override
	public void Approved() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#SelectGas(int)
	 */
	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#StartPump()
	 */
	@Override
	public void StartPump() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#Pump()
	 */
	@Override
	public void Pump() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#StopPump()
	 */
	@Override
	public void StopPump() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#Receipt()
	 */
	@Override
	public void Receipt() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see state.state#NoReceipt()
	 */
	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ReturnCash() {
		// TODO Auto-generated method stub
		
	}

}
