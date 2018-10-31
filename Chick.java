class Chick implements Animal 
{     
  private String myType;     
  private String mySound;      
  public Chick(String type, String sound, String otherSound) {         
    myType = type;  
    if (Math.random() < 0.5) {mySound = sound;} 
    else {mySound = otherSound;}
  }     
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {return mySound;}     
  public String getType() {return myType;}
}
