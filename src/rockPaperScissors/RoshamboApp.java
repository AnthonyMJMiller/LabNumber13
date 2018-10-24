package rockPaperScissors;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Player user = new Human();
		String name;
		String confirm;
		int wins = 0;
		int loss = 0;
		int tie = 0;
		
		name = Validator.getString(key, "Please enter your name: ");
		user.setName(name);
		
		do {
		name = Validator.getString(key, "Who would you like to play against? The Beginner or The Expert? (B/E) ");
		
			Player opponent = null;
			
		if (name.equalsIgnoreCase("B")) {
			opponent = new EasyRock();
			opponent.setName("Sim");
			System.out.println(opponent.getName() + " says: Oh gosh, I don't even kno' what Rochambo is...");
		} else if (name.equalsIgnoreCase("E")) {
			opponent = new HardGuess();
			opponent.setName("Jackal");
			System.out.println(opponent.getName() + " says: ...You won't win.");
		}
		
		
		do {
			Roshambo input = user.generateRoshambo();
			Roshambo output = opponent.generateRoshambo();
			
			
			System.out.println(user.getName() + " picks " + input + " and " + opponent.getName() + " picks " + output + ".");
			
			if ((input == Roshambo.ROCK && output == Roshambo.ROCK) || (input == Roshambo.PAPER && output == Roshambo.PAPER)
					|| (input == Roshambo.SCISSORS && output == Roshambo.SCISSORS)) {
				System.out.println("Draw Game!");
				tie++;
			} else if ((input == Roshambo.PAPER && output == Roshambo.ROCK)
					|| (output == Roshambo.PAPER && input == Roshambo.SCISSORS) || (input == Roshambo.ROCK && output == Roshambo.SCISSORS)) {
				System.out.println("You Won!");
				wins++;
			} else if ((input == Roshambo.PAPER && output == Roshambo.SCISSORS)
					|| (input == Roshambo.SCISSORS && output == Roshambo.ROCK) || (input == Roshambo.ROCK && output == Roshambo.PAPER)) {
				System.out.println("You Lose!");
				loss++;
			} 
			System.out.println("You have a total of: " + wins + " win(s), " + loss + " loss(es), and " + tie + " draw(s).");
		
		confirm = Validator.getContinue(key, "Want to go another round? (Yes/No) ");
		} while (confirm.equalsIgnoreCase("Yes"));
		
		confirm = Validator.getContinue(key, "Would you like to select a new opponent? (Yes/No) ");
		
		} while (confirm.equalsIgnoreCase("Yes"));
		
		System.out.println("Game Over! We await your return...Warrior!");

	}

}