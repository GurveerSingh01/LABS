/**
 * Gurveer Singh 
 * Student No.= 3187474
 */ 
import java.util.Scanner;
public class FlightNoFormat
{
    public static void main (String[] args)
    {
        String flightNo = " osed.2020.12A6.dlun".trim();
        System.out.println(formatFN(flightNo));
        System.out.println("\nend of program");
    }//end main
    // add format method here

    public static StringBuilder formatFN(String flightNo)
    {
        flightNo = flightNo.toLowerCase();
        String tokens[];
        StringBuilder formatNo= new StringBuilder(20); 

        boolean valid = flightNo.length()==14;
        if(!valid)
        {
            throw new IllegalArgumentException("wrong length");
        }

        valid = flightNo.charAt(4)==('.') && flightNo.charAt(9)==('.');

        if(!valid)
        {
            throw new IllegalArgumentException("Wrong format(dots in wrong position");
        }

        tokens= flightNo.split("\\.");
        for(int i=0;i<tokens.length;i++)
        {
            String token = tokens[i];

            if(i==0 || i==2)
            {
                for(int j=0;j<token.length();j++)
                {
                    valid = valid & Character.isLetter(token.charAt(j));
                }
            }

            if(!valid)
            {
                throw new IllegalArgumentException("Character not a LETTER in token number= "+(i+1));
            }

            else if(i==1)
            {
                for(int j=0;j<token.length();j++)
                {
                    valid = valid & Character.isDigit(token.charAt(j));
                }
            }
            
            if(!valid)
            {
                throw new IllegalArgumentException("Character not DIGIT in token number= "+(i+1));
            }
        }

        for(int i=0;i<tokens.length;i++)
        {
            String token = tokens[i];

            {
                if(i==0)
                {
                    valid = valid & token.charAt(0)==('o');
                }

                if(!valid)
                {
                    throw new IllegalArgumentException("first Character of first token is not o");        
                }

                if(i==2)
                {
                    valid = valid & token.charAt(0)==('d');
                }

                if(!valid)
                {
                    throw new IllegalArgumentException("first Character of third token is not d");                            
                }

            }
        }

        for(int i=0; i<tokens.length;i++)
        {
            String s=tokens[i];

            s=s.toUpperCase();
            if(i!=0)
            {
                formatNo.append("-");
            }
            formatNo.append(s);
        }
        return formatNo;
    }
}

