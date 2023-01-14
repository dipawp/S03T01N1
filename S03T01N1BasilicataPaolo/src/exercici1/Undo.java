package exercici1;

import java.util.ArrayList;

public class Undo {
	public ArrayList<String> llistaComandes = new ArrayList<String>();
	
	private Undo() {
		//System.out.println("S'ha creat una istancia de la classe Undo");
	}
	
	private static class UndoHelper{
		private static final Undo INSTANCE = new Undo();
	}
	
	public static Undo getInstance() {
		return UndoHelper.INSTANCE;
	}
	
	public void addCommand(String command) {
		UndoHelper.INSTANCE.llistaComandes.add(command);
		System.out.println("item inserted correctly");
		System.out.println("#########################");
	}
	
	public void removeCommand(int index) {
		try {
			llistaComandes.remove(index);
			System.out.println("item deleted successfully");
		} catch (Exception e) {
			System.out.println("this item cannot be deleted");
		}
		
	}
	public void deleteLastCommand() {
		if(llistaComandes.size() > 0) {
			llistaComandes.remove(llistaComandes.size() - 1);
		}
	}

}
