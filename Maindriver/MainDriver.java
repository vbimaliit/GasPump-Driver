package Maindriver;
import java.util.Scanner;

import abstract_Factory.Concrete_Factory1;
import abstract_Factory.Concrete_Factory2;
import gaspump.GasPump_1;
import gaspump.GasPump_2;
import output.Output;
import state.MDAEFSM;
import state.state;

/**
 * 
 */

/**
 * @author Vishal
 * This is main driver which take the input from user and perform the action as specified by the user
 */
public class MainDriver 
{
    public static int gaspump = 0;
	public static void main(String[] args) 
	
	{
		
		System.out.println("		Select gas pump	to operate		");
		System.out.println("****************************************");
		System.out.println("		1. Gas Pump 1					");
		System.out.println("		2. Gas Pump 2					");
		System.out.println("****************************************");
		System.out.println("		Enter your choice				");

		Scanner scr = new Scanner(System.in);
		int choice = scr.nextInt();
		if (choice ==1)
		{
			gaspump= 1;	
			Concrete_Factory1 c_factory1 = new Concrete_Factory1();
			
			MDAEFSM md_efsm = new MDAEFSM();
			state.opobj = new Output(c_factory1, c_factory1.get_DataStore());
			GasPump_1 gp_1 = new GasPump_1(md_efsm, c_factory1.get_DataStore());
			
			System.out.println();
			System.out.println("Gas Pump 1");
			
			System.out.println("Operations for Gas Pump 1");
			
			System.out.println("1. Activate(float,float)");
			System.out.println("2. Start() ");
			System.out.println("3. PayCredit()");
			System.out.println("4. Reject() ");
			System.out.println("5. Cancel()");
			System.out.println("6. Approved()");
			System.out.println("7. Regular()  ");
			System.out.println("8. Super()");
			System.out.println("9. StartPump()");
			System.out.println("10. PumpGallon()");
			System.out.println("11. StopPump()");
			System.out.println("12. Quit");
			
			while(true)
			{
				System.out.println();
				System.out.println("Select Operation: ");
				System.out.println("1-Activate,2-Start,3-PayCredit,4-Reject,5-Cancel,6-Approved,7-Regular,8-Super,9-StartPump,10-PumpGallon,11-StopPump,12-Quit");	
				System.out.println("Enter your choice:");
				int choice_1 = scr.nextInt();
			
			if (choice_1 == 1)
			{
		
				System.out.println("\n  Operation:  Activate(float a,float b)");
				System.out.println("   Enter the Unit  Price of the Super Gas");
				float superprice_1  =  scr.nextFloat();
				System.out.println("   Enter the Unit  Price of the Regular Gas");
				float regularprice_1 = scr.nextFloat();
				gp_1.Activate(regularprice_1,superprice_1);
			
			}
			
			else if (choice_1 == 2)
			{
				
				System.out.println("  Operation:  Start()");
				gp_1.Start();
			
			}
			
			else if (choice_1 == 3)
			{
				
				System.out.println("  Operation:  PayCredit()");
				gp_1.PayCredit();
			}
			
			else if (choice_1 == 4)
			{
			
				System.out.println("Operations  Rejct()");
				gp_1.Reject();
				
			}
			
			else if (choice_1 ==5)
			{
			
				System.out.println("Operations  Cancel()");
				gp_1.Cancel();
				//cancel
			}
			
			else if (choice_1 == 6)
			{
				//approve
				System.out.println("Operations Approved()");
				gp_1.Approved();
			
			}
			
			else if (choice_1 == 7)
			{
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gp_1.Regular();
			
			}
			
			else if (choice_1 == 8)
			{
				//selected super gas
				System.out.println("  Operation:  Super()");
				gp_1.Super();
			}
			
			else if (choice_1 == 9)
			{
				//start pump
				System.out.println("  Operation:  StartPump()");
				gp_1.StartPump();
			
			}
			
			else if (choice_1 == 10)
			{
			
				System.out.println("  Operation:  Pump()");
				gp_1.Pump();
			
			}
			
			else if (choice_1 == 11)
			{
			
				System.out.println("  Operation:  StopPump()");
				gp_1.StopPump();
			}
			
			else if (choice_1 == 12)
			{
			
				System.out.println("Quitting Gas Pump 1");
			
			}
			else
				System.out.println("Select a valid input");
		    }
		}
		else if (choice ==2)
		{
			Concrete_Factory2 c_factory2 = new Concrete_Factory2();
			//Output op = new Output(c_factory2, c_factory2.GetDataStore());
			MDAEFSM mda_efsm = new MDAEFSM();
			state.opobj = new Output(c_factory2, c_factory2.GetDataStore());
			GasPump_2 gp_2 = new GasPump_2(mda_efsm, c_factory2.GetDataStore());
			gaspump = 2;
			
			System.out.println();
			System.out.println("Gas pump 2");
			System.out.println("**************");
			System.out.println("Operations for Gas Pump 2");
			System.out.println("**************");
			System.out.println("01. Activate(int, int ,int)");
			System.out.println("02. Start() ");
			System.out.println("03. PayCash()");
			System.out.println("04. Cancel()");
			System.out.println("05. Regular()");
			System.out.println("06. Premium()");
			
			System.out.println("07. Super()  ");
			System.out.println("08. StartPump()");
			System.out.println("09. PumpLiter()");
			System.out.println("10. StopPump()");
			System.out.println("11. Receipt()");
			System.out.println("12. NoReceipt()");
			System.out.println("13. Quit");
			
			while(true)
			{
				System.out.println();
				System.out.println("  Select Operation: ");
				System.out.println("01-Activate,02-Start,03-PayCash,04-Cancel,05-Regular,05-Premium,07-Super,08-StartPump,09-PumpLiter,10-StopPump,11-Receipt,12-NoReceipt,13-Quit");	
				System.out.println("Enter your choice:");
				int choice_2 = scr.nextInt();
	
			if (choice_2 == 1)
			{  //ACTIVATE
		
				System.out.println("\n  Operation:  Activate(int a,int b,int c)");
				System.out.println("   Enter the Unit  Price of the Premium Gas");
				int premiumprice_2  =  scr.nextInt();
				System.out.println("   Enter the Unit  Price of the Super Gas");
				int superprice_2  =  scr.nextInt();
				System.out.println("   Enter the Unit  Price of the Regular Gas");
				int regularprice_2 = scr.nextInt();
				gp_2.Activate(regularprice_2,premiumprice_2,superprice_2);
			
			}
			else if (choice_2 == 2)
			{
				
				System.out.println("  Operation:  Start()");
				gp_2.Start();
			}
			
			else if (choice_2 == 3)
			{
				//PayCash
				System.out.println("  Operation:  PayCash()");
				System.out.println("ENter the amount of cash :");
				int cash = scr.nextInt();
				gp_2.PayCash(cash);
			
			}
						
			else if (choice_2 ==4)
			{
				System.out.println("Operations  Cancel()");
				gp_2.Cancel();
				//cancel
			}
			else if (choice_2 == 5)
			{
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gp_2.Regular();
			
			}
			
			else if (choice_2 == 6)
			{
				//select premium gas
				System.out.println(" Operation:  Premium() ");
				gp_2.Premium();
			
			}
			else if (choice_2 == 7)
			{
				//selected super gas
				System.out.println("  Operation:  Super()");
				gp_2.Super();
			
			}
			else if (choice_2 == 8)
			{
				//start pump
				System.out.println("  Operation:  StartPump()");
				gp_2.StartPump();
			
			}
			else if (choice_2 == 9)
			{
			
				System.out.println("  Operation:  Pump()");
				gp_2.Pump();
			
			}
			else if (choice_2 == 10)
			{
			
				System.out.println("  Operation:  StopPump()");
				gp_2.StopPump();
			
			}
			else if (choice_2 == 11)
			{
			
				System.out.println("  Operation:  Receipt()");
				gp_2.Receipt();;
			}
			else if (choice_2 == 12)
			{
			
				System.out.println("  Operation:  NoReceipt()");
				gp_2.NoReceipt();
			
			}
			
			else if (choice_2 == 13)
			{
				
				System.out.println("Quitting Gas Pump 2");
			
			}
			else
				System.out.println("Select a valid input");
			}
		}
		else
		{
		
			System.out.println("Invalid choice selected");
		
		}
		
	}
		
}