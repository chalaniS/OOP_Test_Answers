package VersionE;

public class AlienPack {
	private int Alien[];

	public AlienPack() {
		super();
	}
	
	public void addAlien(int alien[], int size) {    
		
//		Alien = new int[size];
		Alien = alien;
		
	}
	
	public int[] getAliens() {
		return Alien;
	}

}
