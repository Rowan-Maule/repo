import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Khandan Moshi
 * Description: Asks for patient & procedure info and displays it along with calculating total costs
 * Due: 2/26/2025
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Maule
*/

public class PatientDriverApp 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Patient patient = new Patient();
		
		//asks user to enter patient info and saves to the patient object
		System.out.println("What is the patient's first name? ");
		String firstName = input.nextLine();
		patient.setFirstName(firstName);
		System.out.println("What is the patient's middle name? ");
		String middleName = input.nextLine();
		patient.setMiddleName(middleName);
		System.out.println("What is the patient's last name? ");
		String lastName = input.nextLine();
		patient.setLastName(lastName);
		System.out.println("What is the patient's street address? ");
		String address = input.nextLine();
		patient.setAddress(address);
		System.out.println("What city does the patient live in? ");
		String city = input.nextLine();
		patient.setCity(city);
		System.out.println("What state does the patient live in? ");
		String state = input.nextLine();
		patient.setState(state);
		System.out.println("What ZIP code does the patient live in? ");
		int zip = input.nextInt();
		patient.setZip(zip);
		input.nextLine();
		System.out.println("What is the patient's phone number? ");
		String phone = input.nextLine();
		patient.setPhone(phone);
		System.out.println("What is the name of the patient's emergency contact? ");
		String emergencyName = input.nextLine();
		patient.setEmergencyName(emergencyName);
		System.out.println("What is the patient's emergency contact's phone number? ");
		String emergencyPhone = input.nextLine();
		patient.setEmergencyPhone(emergencyPhone);
		
		//take info for procedures
		//procedure 1: (creates object using no arg constructor)
		System.out.println("Enter info for the first procedure: \n");
		Procedure procedure1 = new Procedure();
		
		System.out.println("Enter the name of the procedure: ");
		String procedureName = input.nextLine();
		procedure1.setProcedureName(procedureName);
		System.out.println("Enter the date of the procedure: ");
		String procedureDate = input.nextLine();
		procedure1.setProcedureDate(procedureDate);
		System.out.println("Enter the name of the practicioner: ");
		String practicionerName = input.nextLine();
		procedure1.setPracticionerName(practicionerName);
		System.out.println("Enter the charge for the procedure: ");
		double charge = input.nextDouble();
		procedure1.setCharges(charge);
		input.nextLine();
		
		//procedure 2: (creates object using name and date constructor)
		System.out.println("Enter info for the second procedure: \n");
		
		System.out.println("Enter the name of the procedure: ");
		procedureName = input.nextLine();
		System.out.println("Enter the date of the procedure: ");
		procedureDate = input.nextLine();
		
		Procedure procedure2 = new Procedure(procedureName, procedureDate);
		
		System.out.println("Enter the name of the practicioner: ");
		practicionerName = input.nextLine();
		procedure2.setPracticionerName(practicionerName);
		System.out.println("Enter the charge for the procedure: ");
		charge = input.nextDouble();
		procedure2.setCharges(charge);
		input.nextLine();
		
		//procedure 3: (creates object using all attribute constructor)
		System.out.println("Enter the info for the third procedure: \n");
		
		System.out.println("Enter the name of the procedure: ");
		procedureName = input.nextLine();
		System.out.println("Enter the date of the procedure: ");
		procedureDate = input.nextLine();		
		System.out.println("Enter the name of the practicioner: ");
		practicionerName = input.nextLine();
		System.out.println("Enter the charge for the procedure: ");
		charge = input.nextDouble();
		input.nextLine();
		
		Procedure procedure3 = new Procedure(procedureName, procedureDate, practicionerName, charge);

		//calculate charges
		double totalCharges = calculateTotalCharges(procedure1.getCharges(), procedure2.getCharges(), procedure3.getCharges());
		
		//display info
		displayPatient(patient);
		displayProcedure(procedure1, procedure2, procedure3);
		
		//display total charges
		System.out.printf("Total Charges: $%,.2f", totalCharges);
		System.out.println(" \n");
		
		//display student info
		final String studentName = "Rowan Maule";
		final String mNumber = "M21170534";
		final String dueDate = "2/26/2025";
		
		System.out.println("This program was developed by:");
		System.out.println("Student name: " + studentName);
		System.out.println("Student M#: " + mNumber);
		System.out.println("Due Date: " + dueDate);
		
		input.close();
	}
	
	//display patient info
	public static void displayPatient(Patient patient)
	{
		System.out.println(patient.toString() + "\n");
	}
	
	
	//display procedure info 
	public static void displayProcedure(Procedure procedure1, Procedure procedure2, Procedure procedure3)
	{
		System.out.println(procedure1.toString() + "\n");
		System.out.println(procedure2.toString() + "\n");
		System.out.println(procedure3.toString() + "\n");
	}
	
	
	//calculate total charges
	public static double calculateTotalCharges(double procedure1, double procedure2, double procedure3)
	{
		return (procedure1 + procedure2 + procedure3);
	}
}
