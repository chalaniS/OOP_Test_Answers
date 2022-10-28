package VersionA;

class Lottery
{
    private  int[] lotteryNumbers = new int[5];

    public Lottery()
    {
        int max = 9, min = 0, range = max - min + 1;
        
        for(int i = 0; i < this.lotteryNumbers.length; i++)
        {
            int rand = (int)(Math.random() * range) + min;
           
            boolean alreadyIn = false;
            
            for (int j = 0; j < this.lotteryNumbers.length; j++)
            {
                if(rand == this.lotteryNumbers[j])
                {
                    alreadyIn = true;
                    i--;
                    break;
                }
            }
            
            if(alreadyIn == false)
                lotteryNumbers[i] = rand;
        }
    }
    
    
    public int[]  lotteryPics(int[] arrayOfInteger)
    {
        int matchingTimes = 0;
        int matchingDigits[] = new int[]{-1, -1, -1 , -1, -1};
        
        for(int i = 0; i < this.lotteryNumbers.length; i++)
        {
            for (int j = 0; j < arrayOfInteger.length; j++)
            {
                if(this.lotteryNumbers[i] == arrayOfInteger[j])
                {
                    //System.out.println("ok");
                    matchingDigits[matchingTimes] = this.lotteryNumbers[i];
                    matchingTimes++;
                }
            }   
        }
        
        System.out.print("\nNumber of matching digits :   " + matchingTimes + " \n");
        
        return matchingDigits;
    }
    
    public void displayWiningNmbers()
    {
        System.out.print("\nLotteryr's NUmbers : ");
        for (int i = 0; i < this.lotteryNumbers.length; i++)
        {
            System.out.print(this.lotteryNumbers[i] + "  ");
        }
        
    }
}

class Main
{   
    
    public static void main(String args[]) 
    {
        int[] usersNumber = new int[]{4, 2, 9, 7, 3};
        
        System.out.print("\nuser's NUmbers : ");
        
        for (int i = 0; i < usersNumber.length; i++)
        {
            System.out.print(usersNumber[i] + "  ");
        }
        
        Lottery myLottery = new Lottery();
        
        myLottery.displayWiningNmbers();
        
        int matchedDigits[] = myLottery.lotteryPics(usersNumber);
        
        System.out.print("\nMatching digits : ");
        
        for (int i = 0; i < matchedDigits.length; i++)
        {
            if(matchedDigits[i] != -1)
                System.out.print(matchedDigits[i] + " ");
        }
        System.out.println("\n");
        
    }

}