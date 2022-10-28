package VersionB;

import java.util.Random;

//Alien

interface Alien 
{
	public int getScore();
	
}


//AlienPack

class AlienPack 
{
	Alien arr[];
	
	public AlienPack(int noOfAliens)
	{
		arr = new Alien[noOfAliens];
	}
	
	public void addAliens(Alien a, int index)
	{
		arr[index] = a;
	}
	public Alien[] getAliens()
	{
		return arr;
	}
}


//MarshmalloAlien

class MarshmalloAlien implements Alien 
{
	int score =15;
	public int getScore()
	{
		return score;
		
	}
}

//MenInBlack
class MenInBlack 
{
	int score;
	AlienPack ap;
	
	public MenInBlack(AlienPack a)
	{
		ap = a;
		score = 0;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void kill()
	{
		Alien arr[] = ap.getAliens();
		
		for(int i =0 ; i<arr.length ; i++)
		{
			this.score = this.score + arr[i].getScore();
		}
	}
}

//MenInBlack2

class MenInBlack2 extends MenInBlack 
{
	public MenInBlack2(AlienPack a) 
	{
		super(a);
		score = 0;
	}

	public void kill()
	{
		Alien arr[] = ap.getAliens();
		
		for(int i =0 ; i<arr.length ; i++)
		{
			Random rand = new Random();
			
			this.score = this.score + arr[i].getScore();
			
			if(rand.nextInt()%2==1)
			{
				this.score = this.score - 2;
			}
		}
	}
}


//OrgeAlien
class OrgeAlien implements Alien 
{
	int score = 10;
	public int getScore()
	{
		return score;
	}

}

//SnakeAlien

class SnakeAlien implements Alien 
{
	int score = 5;
	public int getScore()
	{
		return score;
	}
}

//Main

public class Main {

	public static void main(String[] args) 
	{
		AlienPack pack1 = new AlienPack(5);
		pack1.addAliens(new MarshmalloAlien(), 0);
		pack1.addAliens(new OrgeAlien(), 1);
		pack1.addAliens(new OrgeAlien(), 2);
		pack1.addAliens(new SnakeAlien(), 3);
		pack1.addAliens(new MarshmalloAlien(), 4);
		
		MenInBlack AgentK = new MenInBlack(pack1);
		AgentK.kill();
		System.out.println( "Your score is " + AgentK.getScore());
		MenInBlack2 AgentK2 = new MenInBlack2(pack1);
		AgentK2.kill();
		System.out.println( "Your score is " + AgentK2.getScore());

	}

}



