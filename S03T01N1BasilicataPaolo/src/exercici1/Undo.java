package exercici1;

import java.util.ArrayList;

public class Undo {
	private ArrayList<String> commandsList = new ArrayList<String>();
	
	private Undo() {
		//System.out.println("S'ha creat una istancia de la classe Undo");
	}
	
	private static class UndoHelper{
		private static final Undo INSTANCE = new Undo();
	}
	
	public static Undo getInstance() {
		return UndoHelper.INSTANCE;
	}
	
	public void setCommandsList(ArrayList<String> commandsList) {
		this.commandsList = commandsList;
	}
	
	public ArrayList<String> getCommandsList() {
		return commandsList;
	}
	
	public void addCommand(String command) {
		UndoHelper.INSTANCE.commandsList.add(command);
		System.out.println("item inserted correctly");
		System.out.println("#########################");
	}
	
	public void removeCommand(int index) {
		try {
			commandsList.remove(index);
			System.out.println("item deleted successfully");
		} catch (Exception e) {
			System.out.println("this item cannot be deleted");
		}
		
	}
	public void deleteLastCommand() {
		if(commandsList.size() > 0) {
			commandsList.remove(commandsList.size() - 1);
		}
	}

}
