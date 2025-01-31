
/**
 * Gurveer Singh 
 * Student No.= 3187474
 */ 
public enum Planet
{
    MERCURY("Mercury",0,true),VENUS("Venus",0,true),
    EARTH("Earth",1,true),MARS("Mars", 2, true),JUPITER("Jupiter",67,false),
    SATURN("Saturn",62,false),URANUS("Uranus",27,false), NEPTUNE("Neptune",14,false);
    
    private String friendlyName;
    private int moons;
    private boolean isTerrestrial;
    
    private Planet(String friendlyName, int moons, boolean isTerrestrial)
    {
        this.friendlyName=friendlyName;
        this.moons = moons;
        this.isTerrestrial = isTerrestrial;
    }
    public String getFriendlyName()
    {
        return friendlyName;
    }

    public int getNumberOfMoons()
    {
        return moons;
    }

    public boolean isTerrestrial() 
    {
        return isTerrestrial;
    }

    /**public boolean isTerrestrial() 
    {
        return isTerrestrial;
    }*/
    public String toString()
    {
        return friendlyName+" has " + moons + " moons.";
    }
}

