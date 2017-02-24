package a1.Start;

public class Magician implements MindReader {

	private String thoughts;

	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteers thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}
}
