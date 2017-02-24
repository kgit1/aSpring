package a1.Start;

public class Volunteer implements Thinker {

	private String thoughts;

	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}	
	
	
}
