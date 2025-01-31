/**
 * Gurveer Singh 
 * Student No.= 3187474
 */ 
import java.util.Scanner;
public class GPWins
{
    public static void main(String[] args)
    {
        int count=7;

        String drivers[] = {"Hamilton","Verstaepen","Perez","Norris","Sainz","Chandock","Ocon"};
        String wins[][] = {{"Germany", "Canada", "Mexico", "Singapore"},
                {"Canada", "Austria", "France", "China"},
                {"Bahrain"},
                {"Nepal","Australia"},
                {"Spain","Vietnam"},
                {"Brazil"},
                {"Belgium","Italy"}};

        System.out.println("GP Driver Info:");
        System.out.println("\nenter a driver name:");

        Scanner sc=new Scanner(System.in);
        String userInput = sc.next();
        int index = getDriverIndex(userInput,drivers,count);
        
        if(index>=0)
        {
            for(int j=0;j<wins[index].length;j++)
            {
                System.out.print(wins[index][j] + " ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Driver does not exist in Grand Prix Winners List");
        }

        System.out.println("\nEnter n (1-7)");
        int userInputN=sc.nextInt();
        
        while(userInputN<=count && userInputN!=0)
        {
            System.out.println("Win #" + userInputN + ":");
            for(int i=0;i<count;i++)
            {
                if(wins[i].length>=userInputN)     //to check if lenght of wins sub-array has atleast userInputN elements
                {
                    System.out.println(drivers[i] + ": " + wins[i][userInputN-1]);
                }
            }
            
            System.out.println("********************");
            System.out.println("\nEnter n (1-7)");
            userInputN=sc.nextInt();
        }
        
        System.out.println("end of program");
    }

    public static int getDriverIndex(String userInput,String drivers[], int count)
    {
        int index=-1;
        for(int i=0;i<count;i++)
        {
            if(userInput.equalsIgnoreCase(drivers[i]))
            {
                index = i;
            }          
        }
        return index;
    }
}
 