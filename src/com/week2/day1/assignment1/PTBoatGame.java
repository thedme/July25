package com.week2.day1.assignment1;



public class PTBoatGame
{
        
    private static  PTBoat[] boats = new PTBoat[6];
    private static int numberOfBoats = 0;

    /*public PTBoatGame() 
    {
        
    }*/
    public void addBoat(int location)
    {
        boats [numberOfBoats] = new PTBoat(location);
        numberOfBoats++;
    }
    
        
    
    public boolean guessLocation(int location)
    {
        for (int i = 0; i < boats.length; i++)
        {
            if (boats[i].location == location)
            {
                return true;
            }
           
        }
        return false;
    }
    
    
    
    public static void main(String[] args)
    {
        
        PTBoatGame game1 = new PTBoatGame();
//        game1.addBoat(6);
        
        
        
        game1.addBoat(0);
        game1.addBoat(1);
        game1.addBoat(2);
       game1.addBoat(3);
       game1.addBoat(4);
      game1.addBoat(5);
        
        if(game1.guessLocation(2))
        {
        System.out.println("Hit");
        }
        else
        {
        System.out.println("miss");
        }
        
        
           /* for (int i = 0; i < 6; i++)
            {
                
                
               PTBoat aNewBoat = new PTBoat(i,false);
               
                    ptBoats[i] = aNewBoat;
                    numberOfBoats++;
                */
        
        //
                
             
    }

}

