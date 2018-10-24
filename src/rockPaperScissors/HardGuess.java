package rockPaperScissors;

public class HardGuess extends Player {
	
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) (Math.random() * 3);
		switch (randNum) {
		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}
}
