class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    } //your code here
    public Chick()
    {
    	myType = "?";
    	mySound = "?";
    }
    public String getSound()
    {
    	return mySound;
    }
    public String getType()
    {
    	return myType;
    } //your code here
}