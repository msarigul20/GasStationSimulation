/*
 * *Created by Mustafa SARIGÜL
 *             Ýsmail Alp SEL
 *             Mehmet Emir ÖZÇOPUR
 *             Mehmet Aydýn KICIRTI 
 *
 *    Finished the 17.12.2017 18:08(06:08 p.m).
 */
package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// initialize
	static int choice;
	static int i;
	static int quantitySelectionGasoline;
	static int quantitySelectionDiesel;
	static int quantitySelectionGas;
	static int DesicionGasoline;
	static int DesicionDiesel;
	static int DesicionGas;
	public int SystemMainMenu;
	public static int pass = 1903;
	public static int GoBack, GoBack1, GoBack2, GoBack3;
	static double CheckCost, CheckCost1, CheckCost2, CheckTerminate;
	public static int SelectionManagerMenu;
	static int counter_c;
	static int counter_a;
	static double gasoline_cost;
	static double diesel_cost;
	static double gas_cost;
	public static int total_gasoline_liter, total_diesel_liter, total_gas_liter = 0;
	public static double sum_diesel_cost, sum_gasoline_cost, sum_gas_cost = 0;
	public static boolean flag1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner Created
		WelcomeMenu();// Configured the cost of fuel
		System.out.println(" Firstly enter a  cost of gasoline for configure: ");
		gasoline_cost = input.nextDouble();
		System.out.println(" Secondly enter a  cost of diesel for configure :");
		diesel_cost = input.nextDouble();
		System.out.println(" Third enter a  cost of gas for configure: ");
		gas_cost = input.nextDouble();
		System.out.println(" Okey type of fuel configured.");
		System.out.println(" ");
		// ArrayList Keeping Customer Ýnformation.
		ArrayList<Customer> CustomerList = new ArrayList<Customer>();
		// Created Customer with by constructor
		Cars TryCar = new Cars("Mustafa", "SARIGÜL", "12345678910", 1234, "05431234567", "project@gmail.com", "35A35",
				"Gasoline");
		TryCar.setPersonName("Mustafa");
		TryCar.setPersonSurname("Sarýgül");
		TryCar.setPersonCitizenNumber("12345678910");
		TryCar.setCustomerID(1234);
		TryCar.setTelephoneNumber("054341234567");
		TryCar.setEmail("project@gmail.com");
		TryCar.setPlate("35A35");
		TryCar.setTypeOfFuel("Gasoline");
		// Add the Car to ArrayList
		CustomerList.add(TryCar);

		for (;;) {// Contain Base Reputation
			MainMenu();// Display Main Menu
			choice = input.nextInt();
			// Selection Main Menu
			switch (choice) {
			// SALES GASOLINE FOR UNCUSTOMERS
			case 1:
				System.out.println(" How Much Liters GASOLINE Do You Want To Buy ?" + "(Cost = " + gasoline_cost + ")");
				quantitySelectionGasoline = input.nextInt();
				if (quantitySelectionGasoline == 0) {// Validation Zero Taken
					System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
					break;
				}
				sum_gasoline_cost = sum_gasoline_cost + (quantitySelectionGasoline * gasoline_cost);
				total_gasoline_liter = quantitySelectionGasoline + total_gasoline_liter;
				System.out.println(" You will take " + quantitySelectionGasoline + " liters GASOLÝNE and will pay "
						+ quantitySelectionGasoline * gasoline_cost + " TL for GASOLÝNE...");
				System.out.println(" ");
				System.out.println(" Attantion Note : GASOLÝNE Cost is " + gasoline_cost + " TL per liter. ");
				System.out.println(" ");
				System.out.println(" Are you sure?");
				System.out
						.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				DesicionGasoline = input.nextInt();
				// Selection Part Cancel or Accept the buying of fuel
				switch (DesicionGasoline) {
				case 1:
					System.out.println(" Your tank is fulling with gasoline.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;
					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_gasoline_liter = total_gasoline_liter - quantitySelectionGasoline;
					sum_gasoline_cost = sum_gasoline_cost - (quantitySelectionGasoline * gasoline_cost);
					break;
				default:
					System.out.println(" ! PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
					total_gasoline_liter = total_gasoline_liter - quantitySelectionGasoline;
					sum_gasoline_cost = sum_gasoline_cost - (quantitySelectionGasoline * gasoline_cost);
				}
				break;
			// SALES DIESEL FOR UNCUSTOMERS
			case 2:
				System.out.println(" How Much Liters DIESEL Do You Want To Buy ?" + "(Cost = " + diesel_cost + ")");
				quantitySelectionDiesel = input.nextInt();
				if (quantitySelectionDiesel == 0) {/// Validation Zero Taken
					System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
					break;
				}
				sum_diesel_cost = sum_diesel_cost + (quantitySelectionDiesel * diesel_cost);
				total_diesel_liter = quantitySelectionDiesel + total_diesel_liter;
				System.out.println(" You will take " + quantitySelectionDiesel + " liters DÝESEL and will pay "
						+ quantitySelectionDiesel * diesel_cost + " TL for DIESEL...");
				System.out.println(" Are you sure?");
				System.out
						.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				DesicionDiesel = input.nextInt();
				// Selection Part Cancel or Accept the buying of fuel
				switch (DesicionDiesel) {
				case 1:
					System.out.println(" Your tank is fulling with diesel.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;
					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_diesel_liter = total_diesel_liter - quantitySelectionDiesel;
					sum_diesel_cost = sum_diesel_cost - (quantitySelectionDiesel * diesel_cost);
					break;
				default:
					System.out.println("PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
					total_diesel_liter = total_diesel_liter - quantitySelectionDiesel;
					sum_diesel_cost = sum_diesel_cost - (quantitySelectionDiesel * diesel_cost);
				}
				break;
			// SALES GAS FOR UNCUSTOMERS
			case 3:
				System.out.println(" How Much Liters GAS Do You Want To Buy ?" + "(Cost = " + gas_cost + ")");
				quantitySelectionGas = input.nextInt();
				if (quantitySelectionGas == 0) {// Validation Zero Taken
					System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
					break;
				}
				sum_gas_cost = sum_gas_cost + (quantitySelectionGas * gas_cost);
				total_gas_liter = quantitySelectionGas + total_gas_liter;
				System.out.println(" You will take " + quantitySelectionGas + " liters GAS and will pay "
						+ quantitySelectionGas * gas_cost + " TL for GAS...");
				System.out.println(" Are you sure?");
				System.out
						.println(" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
				DesicionGas = input.nextInt();
				// Selection Part Cancel or Accept the buying of fuel
				switch (DesicionGas) {
				case 1:
					System.out.println(" Your tank is fulling with gas.Wait!");
					System.out.println(" -------------------------------------------");
					counter_a++;
					break;
				case 0:
					System.out.println(" Your selling has been canceled!");
					System.out.println(" -------------------------------------------");
					counter_c++;
					total_gas_liter = total_gas_liter - quantitySelectionGas;
					sum_gas_cost = sum_gas_cost - (quantitySelectionGas * gas_cost);
					break;
				default:
					System.out.println(" PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
				}
				break;
			// SALES GAS FOR CUSTOMERS
			case 4:
				System.out.println("Please enter Subcribe ID : ");
				for (int i = 0; i <= CustomerList.size(); i++) {
					if (CustomerList.size() == 0) {// Validation Empty ArrayList
						System.out.println("Customer List is Empty. Please add by System Menu !!!");
						break;
					}
				}
				int TempCustomerID = input.nextInt();
				for (int i = 0; i < CustomerList.size(); i++) {// Reputation for iteration for ArrayList
					if (TempCustomerID == CustomerList.get(i).getCustomerID()) {// Check is it customer
						flag1 = false;
						/*
						 * We solved here problem of else part. Because of iterator of for and ArrayList
						 * local iterator else part always displayed. We used boolean and another if
						 * statement and fixed this problem here.
						 */
						CustomerList.get(i).DisplayCustomerInfo(); // Displaying information of Customer //Special
																	// Welcome Part for Customer
						System.out.println("Welcome " + CustomerList.get(i).getPersonName());
						SubsTakingMenu();// Customer Sales Menu
						int choiceSubsTaking = input.nextInt();
						switch (choiceSubsTaking) {
						// SALES GASOLINE FOR CUSTOMERS
						case 1:
							double SubsGasolineCost = gasoline_cost - (gasoline_cost * 15 / 100);
							System.out.println(" How Much Liters GASOLINE Do You Want To Buy ?" + "(Cost = "
									+ SubsGasolineCost + ")");
							int SubsGasolineLiter = input.nextInt();
							if (SubsGasolineLiter == 0) {// Validation Zero Taken!
								System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
								SubsTakingMenu();
								break;
							}
							sum_gasoline_cost = sum_gasoline_cost + (SubsGasolineLiter * SubsGasolineCost);
							total_gasoline_liter = total_gasoline_liter + SubsGasolineLiter;
							System.out.println(" You will take " + SubsGasolineLiter + " liters GASOLÝNE and will pay "
									+ SubsGasolineLiter * SubsGasolineCost + " TL for GASOLINE...");
							System.out.println(" ");
							System.out.println(" Attantion Note : GASOLÝNE Cost is " + SubsGasolineCost
									+ " TL per liter.(Discount : %15) ");
							System.out.println(" ");
							System.out.println(" Are you sure?");
							System.out.println(
									" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
							int SubsChoiceYesNoGasoline = input.nextInt();
							// Selection Part Cancel or Accept the buying of fuel
							switch (SubsChoiceYesNoGasoline) {
							case 1:
								System.out.println(" Your tank is fulling with gasoline.Wait!");
								System.out.println(" -------------------------------------------");
								counter_a++;
								break;
							case 0:
								System.out.println(" Your selling has been canceled!");
								System.out.println(" -------------------------------------------");
								counter_c++;
								total_gasoline_liter = total_gasoline_liter - SubsGasolineLiter;
								sum_gasoline_cost = sum_gasoline_cost - (SubsGasolineLiter * SubsGasolineCost);
								break;
							default:
								System.out.println(" ! PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
							}
							break;
						// SALES DIESEL FOR CUSTOMERS
						case 2:
							double SubsDieselCost = diesel_cost - (diesel_cost * 15 / 100);
							System.out.println(
									" How Much Liters DIESEL Do You Want To Buy ?" + "(Cost = " + SubsDieselCost + ")");
							int SubsDieselLiter = input.nextInt();
							if (SubsDieselLiter == 0) {// Validation Zero Taken!
								System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
								SubsTakingMenu();
								break;
							}
							sum_diesel_cost = sum_diesel_cost + (SubsDieselLiter * SubsDieselCost);
							total_diesel_liter = total_diesel_liter + SubsDieselLiter;
							System.out.println(" You will take " + SubsDieselLiter + " liters Diesel and will pay "
									+ SubsDieselLiter * SubsDieselCost + " TL for DIESEL...");
							System.out.println(" ");
							System.out.println(" Attantion Note : Diesel Cost is " + SubsDieselCost
									+ " TL per liter.(Discount : %15) ");
							System.out.println(" ");
							System.out.println(" Are you sure?");
							System.out.println(
									" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
							int SubsChoiceYesNoDiesel = input.nextInt();
							// Selection Part Cancel or Accept the buying of fuel
							switch (SubsChoiceYesNoDiesel) {
							case 1:
								System.out.println(" Your tank is fulling with diesel.Wait!");
								System.out.println(" -------------------------------------------");
								counter_a++;
								break;
							case 0:
								System.out.println(" Your selling has been canceled!");
								System.out.println(" -------------------------------------------");
								counter_c++;
								total_diesel_liter = total_diesel_liter - SubsDieselLiter;
								sum_diesel_cost = sum_diesel_cost - (SubsDieselLiter * SubsDieselCost);
								break;
							default:
								System.out.println(" ! PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
							}
							break;
						// SALES GAS FOR CUSTOMERS
						case 3:
							double SubsGasCost = gas_cost - (gas_cost * 15 / 100);
							System.out.println(
									" How Much Liters GAS Do You Want To Buy ?" + "(Cost = " + SubsGasCost + ")");
							int SubsGasLiter = input.nextInt();
							if (SubsGasLiter == 0) {// Validation Zero Taken!
								System.out.println("You entered 0. Zero can not taking ! Please Be Careful :)");
								SubsTakingMenu();
								break;
							}
							sum_gas_cost = sum_gas_cost + (SubsGasLiter * SubsGasCost);
							total_gas_liter = total_gas_liter + SubsGasLiter;
							System.out.println(" You will take " + SubsGasLiter + " liters GAS and will pay "
									+ SubsGasLiter * SubsGasCost + " TL for GAS...");
							System.out.println(" ");
							System.out.println(
									" Attantion Note : Gas Cost is " + SubsGasCost + " TL per liter.(Discount : %15) ");
							System.out.println(" ");
							System.out.println(" Are you sure?");
							System.out.println(
									" If you want to continue ,please enter 1 OR you can cancel the selling by enter 0.");
							int SubsChoiceYesNoGas = input.nextInt();
							// Selection Part Cancel or Accept the buying of fuel
							switch (SubsChoiceYesNoGas) {
							case 1:
								System.out.println(" Your tank is fulling with gas.Wait!");
								System.out.println(" -------------------------------------------");
								counter_a++;
								break;
							case 0:
								System.out.println(" Your selling has been canceled!");
								System.out.println(" -------------------------------------------");
								counter_c++;
								total_gas_liter = total_gas_liter - SubsGasLiter;
								sum_gas_cost = sum_gas_cost - (SubsGasLiter * SubsGasCost);
								break;
							default:
								System.out.println(" ! PLEASE PRESS 1 OR 0.DO NOT ENTER A VALUE OTHER THAN 1 AND 0!");
							}
							break;
						default:
							System.out.println("Please Select One Of Type Between 1 to 3 :");
						}// Close Switch of Customer Selection Which Type of Fuel
						break;
					} // Closing Check is it Customer by Customer ID
					flag1 = true;// Change Flag for Else Problem
				} // Closing Reputation for iteration for ArrayList

				if (flag1 == true) {// Fixed With Flag for Else Problem
					System.out.println("You entered uncorrect customer ID.");
					System.out.println("You will go to main menu. Please access the manager !");
				}
				break;
			// Manager Panel Entering
			case 9:
				System.out.println(" Please enter password for Personal System...:");
				System.out.println(" If you want to go main menu please enter [99] !!!");
				for (;;) {// Reputation for infinite loop Manager Mode
					pass = input.nextInt();
					if (pass == 1903) {// Entering with Password[Opening Manager Menu Statement]
						// in Manager Panel
						System.out.println(" ");
						System.out.println("   ---You are in the Personal System---   ");
						System.out.println(" ");
						System.out.println(" - Press to 1 Learn Canneles and Accepts.    ");
						System.out.println(" - Press to 2 change the cost of gasoline.   ");
						System.out.println(" - Press to 3 change the cost of diesel.     ");
						System.out.println(" - Press to 4 change the cost of gas.        ");
						System.out.println(" - Press to 5 print the summary of day.      ");
						System.out.println(" - Press to 6 add customer to customer list. ");
						System.out.println(" - Press to 7 print the customer information.");
						System.out.println(" Press to 99 go to menu. ");
						SelectionManagerMenu = input.nextInt();
						switch (SelectionManagerMenu) {
						// Decision Manager Menu
						case 1:// Learn Cancels and Accepts
							System.out.println(" Total accepts: " + counter_a);
							System.out.println(" Total cancels: " + counter_c);
							System.out.println(" Press to 99 for go back");
							System.out.println(
									" If you enter a value other than 99,you will direct to main menu.For:Security");
							GoBack = input.nextInt();
							if (GoBack == 99) {// Go to previous section[Password Section]
								System.out.println(" Please enter password for PS.:");
								System.out.println(" If you want to go main menu please enter [99] !!!");
								continue;
							} else {// Go to Main Menu With Annotation
								System.out.println(" ----------------------");
								System.out.println(" You Have Entered a Value Other Than 99. ");
								System.out.println(" So, You are directing to Main Menu!");
								System.out.println(" ----------------------");
							}
							break;
						// Change the Gasoline Cost That Belong to System
						case 2:
							System.out.println(" Cost is " + gasoline_cost + "TL.");
							System.out.println(" Enter a new cost:  ");
							CheckCost = input.nextDouble();
							gasoline_cost = CheckCost;
							System.out.println(" New gasoline cost:" + CheckCost);
							System.out.println(" Gasoline cost has been changed");
							System.out.println(" Press to 99 for go back");
							System.out.println(
									" If you enter a value other than 99,you will direct to main menu.For:Security");
							GoBack = input.nextInt();
							if (GoBack == 99) {// Go to previous section[Password Section]
								System.out.println(" Please enter password for PS.:");
								System.out.println(" If you want to go main menu please enter [99] !!!");
								continue;
							} else {// Go to Main Menu With Annotation
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								break;
							}
							// Change the Gasoline Cost That Belong to System
						case 3:
							System.out.println(" Cost is " + diesel_cost + "TL.");
							System.out.println(" Enter a new cost:  ");
							CheckCost1 = input.nextDouble();
							diesel_cost = CheckCost1;
							System.out.println(" New diesel cost:" + CheckCost1);
							System.out.println(" Gasoline cost has been changed");
							System.out.println(" Press to 99 for go back");
							System.out.println(
									" If you enter a value other than 99,you will direct to password screen.For:Security");
							GoBack1 = input.nextInt();
							if (GoBack1 == 99) {// Go to previous section[Password Section]
								System.out.println(" Please enter password for PS.:");
								System.out.println(" If you want to go main menu please enter [99] !!!");
								continue;
							} else {// Go to Main Menu With Annotation
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								break;
							}
							// Change the Gasoline Cost That Belong to System
						case 4:
							System.out.println(" Cost is " + gas_cost + "TL.");
							System.out.println(" Enter a new cost:  ");
							CheckCost2 = input.nextDouble();
							gas_cost = CheckCost2;
							System.out.println(" New diesel cost:" + CheckCost2);
							System.out.println(" Gasoline cost has been changed");
							System.out.println(
									"  If you enter a value other than 99,you will direct to main menu.For:Security");
							System.out.println(" Press to 99 for go back");
							GoBack2 = input.nextInt();
							if (GoBack2 == 99) {// Go to previous section[Password Section]
								System.out.println(" Please enter password for PS.:");
								System.out.println(" If you want to go main menu please enter [99] !!!");
								continue;
							} else {// Go to Main Menu With Annotation
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								System.out.println(" !!!.You entered wrong option for go to back !!!");
								System.out.println(" ");
								System.out.println(" Please Try From The Beginning.(For Security Reasons)");
								System.out.println(" ");
								System.out.println(" You Are Directing To The Main Menu.");
								System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								break;
							}
							// Display Summary of Day of Sales And Liters
						case 5:
							System.out.println(" - Today sales of GASOLINE liters : " + total_gasoline_liter);
							System.out.println(" - Today sales of DIESEL liters : " + total_diesel_liter);
							System.out.println(" - Today sales of GAS liters : " + total_gas_liter);
							System.out.println(" + Today sales of GASOLINE cost  : " + sum_gasoline_cost);
							System.out.println(" + Today sales of DIESEL cost : " + sum_diesel_cost);
							System.out.println(" + Today sales of GAS cost : " + sum_gas_cost);
							System.out.println(" ");
							System.out.println("  Press to 99 for go back");
							System.out.println(
									"  If you enter a value other than 99,you will direct to main menu.For:Security");
							GoBack3 = input.nextInt();
							if (GoBack3 == 99) {// Go to Main Menu With Annotation
								System.out.println(" Please enter password for PS.:");
								System.out.println(" If you want to go main menu please enter [99] !!!");
								continue;
							} else {// Go to Main Menu With Annotation
								System.out.println(" ----------------------");
								System.out.println(" You Have Entered a Value Other Than 99. ");
								System.out.println(" So, You are directing to Main Menu!");
								System.out.println(" ----------------------");
							}
							break;
						// Add customer add CustomerList by given input
						case 6:
							input.nextLine();
							System.out.println("Please enter Customer Name: ");
							String TempCustomerName = input.nextLine();
							System.out.println("Please enter Customer Surname: ");
							String TempCustomerSurname = input.nextLine();
							System.out.println("Please enter Customer Citizen Number: ");
							String TempCustomerCitizenNumber = input.nextLine();
							System.out.println("Please enter Customer ID: ");
							int TempCustomerID1 = input.nextInt();
							System.out.println("Please enter Customer Telephone Number :");
							input.nextLine();
							String TempTelephoneNumber = input.nextLine();
							System.out.println("Please enter Customer E Mail Adress :");
							String TempEMail = input.nextLine();
							System.out.println("Please enter Car Plate: ");
							String TempCarPlate = input.nextLine();
							System.out.println("Please enter Type Of Fuel :");
							String TempTypeOfFuel = input.nextLine();
							Cars CarTemp = new Cars(TempCustomerName, TempCustomerSurname, TempCustomerCitizenNumber,
									TempCustomerID1, TempTelephoneNumber, TempEMail, TempCarPlate, TempTypeOfFuel);
							CarTemp.setPersonName(TempCustomerName);
							CarTemp.setPersonSurname(TempCustomerSurname);
							CarTemp.setPersonCitizenNumber(TempCustomerCitizenNumber);
							CarTemp.setCustomerID(TempCustomerID1);
							CarTemp.setTelephoneNumber(TempTelephoneNumber);
							CarTemp.setEmail(TempEMail);
							CarTemp.setPlate(TempCarPlate);
							CarTemp.setTypeOfFuel(TempTypeOfFuel);
							CustomerList.add(CarTemp);// Added Temporary Car Object in CustomerList
							System.out.println(" " + CustomerList.size() + ". Customer Added.");// Counter of added
																								// customer
							break;
						// Display CustomerList
						case 7:
							System.out.println("Printing Customer And Their information :");
							for (int i = 0; i < CustomerList.size(); i++) {
								System.out.println(" " + (i + 1 + ". Customer Information :"));
								CustomerList.get(i).DisplayCustomerInfo();
							}
							break;
						// Quit the this section.
						case 99:
							break;
						// Default Manager Menu
						default:
							System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println(" !!!.You entered wrong menu option for Personal System.!!!");
							System.out.println(" ");
							System.out.println(" Please Try From The Beginning.(For Security Reasons)");
							System.out.println(" ");
							System.out.println(" You Are Directing To The Main Menu.");
							System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						}
						break;
					} // Closing Password if Statement(Check Password Section)
						// Quit the this section
					else if (pass == 99) {
						break;
					}
					// Warning enter disallowed value
					else {
						System.out.println("----------------------------");
						System.out.println(" You entered wrong password.");
						System.out.println("  Please Try Again");
						System.out.println("If you want to go back PLEASE PRESS [99] !!!!");
						System.out.println(" Password: ");
					}
				} // Closing Reputation for infinite loop Manager Mode
				break;
			// Terminate The Program
			case 1923:
				CheckTerminate = input.nextInt();
				if (CheckTerminate == pass) {// Check Password for Security of Program
					input.close();
					System.exit(0);
				} else {
					break;
				}
				// Default Main Menu Switch
			default:
				DefaultMainMenu();
			}// Closing Main Menu Switch Statement
		} // Closing Public Void Main
	}// Closing Class

	// First Edit Cost Method
	public static void WelcomeMenu() {
		System.out.println(" -----------------------------------------------");
		System.out.println(" |---------------------------------------------|");
		System.out.println(" |            WELCOME TO AUTOFULLER            |");
		System.out.println(" |  This screen belong to authorized person.   |");
		System.out.println(" |  This screen wont show any one more times.  |");
		System.out.println(" |     So, we must do some configiration.      |");
		System.out.println(" | We firstly configiration fuel of type cost. |");
		System.out.println(" |---------------------------------------------|");
		System.out.println(" -----------------------------------------------");
		System.out.println(" ");
	}

	// Main Menu Method
	public static void MainMenu() {
		System.out.println(" -------------------------------------------");
		System.out.println("      /////" + "WHAT DO YOU GET?" + "/////      ");
		System.out.println("  If you are get Gasoline,please enter 1.   ");
		System.out.println("   If you are get Diesel,please enter 2.    ");
		System.out.println("     If you are get Gas,please enter 3.     ");
		System.out.println("  ");
		System.out.println(" If you are SUBCRIBE CUSTOMER plase enter 4.");
		System.out.println(" ");
		System.out.println("         Press to 9 for System Menu");
		System.out.println(" -------------------------------------------");
	}

	// Methods that belong to Registered Customer
	public static void SubsTakingMenu() {
		System.out.println(" -------------------------------------------");
		System.out.println("      /////" + "WHAT DO YOU GET SUBCRIBE?" + "/////      ");
		System.out.println("       If you are get Gasoline,please enter 1.   ");
		System.out.println("        If you are get Diesel,please enter 2.    ");
		System.out.println("         If you are get Gas,please enter 3.     ");
		System.out.println("  ");
		System.out.println(" -------------------------------------------");
	}

	// Methods that belong to default of Registered Customer Selling
	public void SubsTakingMenuDefault() {
		System.out.println("---------------------------------------------------");
		System.out.println("Dear Subcribe,Please entered correct selection !!!");
		System.out.println("                Please Try Again!");
		System.out.println("---------------------------------------------------");
		System.out.println("      /////" + "WHAT DO YOU GET SUBCRIBE?" + "/////      ");
		System.out.println("       If you are get Gasoline,please enter 1.   ");
		System.out.println("        If you are get Diesel,please enter 2.    ");
		System.out.println("         If you are get Gas,please enter 3.     ");
		System.out.println("---------------------------------------------------");
	}

	// Methods that belong to default of Main Menu
	public static void DefaultMainMenu() {
		System.out.println(" ------Wrong Entered  Value In Main Menu.--------");
		System.out.println("  ");
		System.out.println(" ----------------Please Try Again----------------");
		System.out.println(" ");
	}
}