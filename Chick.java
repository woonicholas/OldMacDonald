class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    public Chick(String type, String sound, String sound2)
    {
    	myType = type;
    	if(Math.random()<.5)
    	{
    	mySound = sound;
    	}
    	else
    	{
    	mySound = sound2;
   		}
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