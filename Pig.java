class Pig implements Animal 
{     
    private String myType;
    private String mySound;
    public Pig(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    } //your code here
    public Pig()
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