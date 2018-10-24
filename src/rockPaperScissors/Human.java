package rockPaperScissors;

import java.util.Scanner;

public class Human extends Player {
	
	private Scanner key;
	
	@Override
	public Roshambo generateRoshambo() {
		key = new Scanner(System.in);
		String enter = Validator.getString(key, "Will you choose Rock, Paper, or Scissors? (Rock/Paper/Scissors) ");
		while(!enter.equalsIgnoreCase("Rock") && !enter.equalsIgnoreCase("Paper") && !enter.equalsIgnoreCase("Scissors")){
			enter = Validator.getString(key, "This is Roshambo. Please choose either Rock, Paper, or Scissors (Rock/Paper/Scissors) ");
		}
		if(enter.equalsIgnoreCase("Rock")) {
			return Roshambo.ROCK;
		} else if (enter.equalsIgnoreCase("Paper")) {
			return Roshambo.PAPER;
		} else if (enter.equalsIgnoreCase("Scissors")) {
			return Roshambo.SCISSORS;
		}
		return null;
	}

}
