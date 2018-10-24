package rockPaperScissors;

public class EasyRock extends Player {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.ROCK;
	}

}
