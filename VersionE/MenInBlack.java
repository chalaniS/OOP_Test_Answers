package VersionE;

public class MenInBlack {
	private int score = 0;
	AlienPack alienpack = new AlienPack();
	
	public MenInBlack(AlienPack alienpack, int score) {
		super();
		this.score = score;
		this.alienpack = alienpack;
	}

	public AlienPack getAlienpack() {
		return alienpack;
	}

	public void setAlienpack(AlienPack alienpack) {
		this.alienpack = alienpack;
	}
	
    public int kill() {
    	return score;
		
	}

	

}
