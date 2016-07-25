package com.week2.day1.assignment1;

public class PTBoat
{   
    int location;
   // private boolean amIHit = false;
   
    // Provide a constructor
    public PTBoat(int location)
    {
        this.location =  location;
       // this.amIHit = amIhit;
        //
        
        
        
        
    }
    
    
    public boolean amIHit(int column)
    {
        return (column == location);
    }
}
