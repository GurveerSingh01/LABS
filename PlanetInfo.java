/**
 * Gurveer Singh 
 * Student No.= 3187474
 */ 
import java.util.Scanner;
import java.util.Arrays;
public class PlanetInfo
{
    public static void main (String[] args)
    {
        Scanner kb=new Scanner(System.in);
        String userInput="";
        boolean matchFound=false;
        Planet planets[] = Planet.values();

        System.out.println("Terrestorial planets:");

        for(Planet p: planets)
        {
            if(p.isTerrestrial())
            {
                System.out.println(p.getFriendlyName().toUpperCase());
            }
        }

        System.out.println("\nJovian planets:");

        for(Planet p: planets)
        {
            if(!p.isTerrestrial())
            {
                System.out.println(p.getFriendlyName());
            }
        }

        System.out.println("\nEnter a planet name:");
        userInput= kb.next().toUpperCase();

        for(Planet p: planets)
        {
            if(p.getFriendlyName().equalsIgnoreCase(userInput))
            {
                matchFound=true;
            }
        }
        
        while(matchFound==false)
        {
            System.out.println("Error:Planet does not exist");
            System.out.println("\nEnter a planet name:");
            
            userInput= kb.next().toUpperCase();
            
            for(Planet p: planets)
            {
                if(p.getFriendlyName().equalsIgnoreCase(userInput))
                {
                    matchFound= true;
                }
            }       
        }

        System.out.println(Planet.valueOf(userInput));
                System.out.println("\nEnd of processing");

    }
}
 