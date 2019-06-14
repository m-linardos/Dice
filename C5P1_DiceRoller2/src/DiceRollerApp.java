

public class DiceRollerApp {

	public static void main(String[] args) {
		
		String choice;
		int die1;
		int die2;
		int total;
		
		Console.printWelcome();
		choice = Console.getChoiceString("Roll the dice(y/n)?", "y", "n");
		
		while (choice.equalsIgnoreCase("y")) {
		die1 = rollDice();	
		die2 = rollDice();
		total = die1 + die2;
		System.out.println("die1 is "+ die1+ "and die2 is "+ die2);
		System.out.println("The total of die1 and die2 is "+ total);
		if (total == 2) {
			System.out.println("Snake Eyes !!!");
		} else if (total == 12) { 
			System.out.println("Box Cars !!!");
		}
		
		choice = Console.getChoiceString("Roll the dice again(y/n)?", "y", "n");
		
		}
				
		
		
		
		
		
		

	}

	
	public static int rollDice() {
		int die = (int) ((Math.random()*6)+1);		
		return die;
	}
	
	
}
