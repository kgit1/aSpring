package a1.Start;

public class CriticismEngineImpl implements CriticismEngine {

	private String[] criticismPool;

	public CriticismEngineImpl() {
	}

	public void setCretecismpool(String[] criticismPool) {
		this.criticismPool = criticismPool;
	}

	@Override
	public String getCriticism() {
		int i = (int) (Math.random() * criticismPool.length);
		return criticismPool[i];
	}
}
