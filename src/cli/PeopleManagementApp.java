package cli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import ui.UI;

public class PeopleManagementApp {
	
	public static void main(String[] args) {
		PeopleManagementApp app = new PeopleManagementApp();
		app.startCommandLineInterface();
	}
	
	public void startCommandLineInterface() {
		String presentation = "Welcome to People Management App CLI \n";
		
		String option1 = "Type 'list' to see all employees registered \n";
		String option2 = "Type 'new' to register a new employee \n";
		System.out.println(presentation);
		System.out.println(option1);
		System.out.println(option2);
		
		UI ui = new UI();
		
		Scanner scan = new Scanner(System.in);
		
		String command = "";
		
		while(scan.hasNext()) {
			command = scan.nextLine();
			
			switch (command){
				case "list":
					System.out.println("You chose list");
					System.out.println(ui.list());
					break;
				case "new": 
					System.out.println("You chose new");
					break;
			}
		}
		
	}
}
