/* Abstract class for state pattern */
package state;
import output.Output;
public abstract class state  {

	public static Output opobj;
	state curstate;
	public state( state s)
	{
		
		curstate = s;
	}
	
	
	public abstract void Activate();

	public abstract void Start();

	public abstract void PayCredit();

	public abstract void PayCash();

	public abstract void Reject();

	public abstract void Cancel();

	public abstract void Approved();

	public abstract void SelectGas(int g);

	public abstract void StartPump();

	public abstract void Pump();

	public abstract void StopPump();

	public abstract void Receipt();

	public abstract void NoReceipt();

	public void setState(state s) {
		
		curstate = s;
		
	}


	public abstract void ReturnCash();
		// TODO Auto-generated method stub
		
	
}
