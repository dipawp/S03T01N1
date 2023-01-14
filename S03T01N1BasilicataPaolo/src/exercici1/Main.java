package exercici1;

import java.util.Scanner;


public class Main {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMenuPrincipal();
        
        String in = scanner.nextLine();
        Undo undo;
        
        //in = scanner.nextLine();
        while(!(in.equals("5"))) {
        	switch(in) {
            case "1":
           	 undo = Undo.getInstance();
           	 if(undo.getCommandsList().size() > 0) {
           		 for (String cmdString : undo.getCommandsList()) {
        				System.out.println("-" + cmdString);
        			}
           		 System.out.println("#########################");
           	 }else {
           		 System.out.println("no items");
           		 System.out.println("#########################");
           	 }
           	 printMenuPrincipal();
           	 in = scanner.nextLine();
           	 break;
            case "2":
           	 System.out.println("Type the command");
           	 String command = scanner.nextLine();
           	 undo = Undo.getInstance();
           	 undo.addCommand(command);
           	 printMenuPrincipal();
           	 in = scanner.nextLine();
           	 break;
            case "3":
            	undo = Undo.getInstance();
            	if(undo.getCommandsList().size() > 0) {
            		for(int i = 0; i <= undo.getCommandsList().size() -1; i++) {
                		System.out.println(i+1 + "." + undo.getCommandsList().get(i));
                		}
            	}else {
            		System.out.println("no items");
            	}
            	in = scanner.nextLine();
            	undo.removeCommand(Integer.parseInt(in) - 1);
            	printMenuPrincipal();
            	in = scanner.nextLine();
            	break;
            case "4":
            	undo = Undo.getInstance();
            	if(undo.getCommandsList().size() > 0) {
            		undo.deleteLastCommand();
            	}else {
            		System.out.println("no items");
            	}
            	printMenuPrincipal();
            	in = scanner.nextLine();
            	break;
            default:
            	System.out.println("invalid option.");
            	System.out.println("#########################");
            	printMenuPrincipal();
            	in = scanner.nextLine();
           	 break;
           }
        }
	}
	
	
	private static void printMenuPrincipal() {
		System.out.println("Choose an option" + "\n#########################" + 
	            "\n" + "1.- List commands." +
                "\n" + "2.- Insert command." +
                "\n" + "3.- Delete command" +
                "\n" + "4.- Delete last command" +
		        "\n" + "5.- Exit");
		System.out.println("#########################");
		
	}

}
