class Chick implements Animal 
{     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound1, String sound2)     {         
         myType = type;         
         mySound = sound1;
         int chance;
         chance = (int)(Math.random()*2);
         if (chance == 1)
         {
            mySound = sound1;
         }
         else 
        {
            mySound = sound2;
        }

     }     
     public Chick()     
     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}