// Gurveer Singh 3187474
import java.util.Scanner;
import java.util.Random;
public class Ques2 
{
    public static void main(String[] args)
    {
        int count=0;
        int arr[]= new int[50];
        Random rand = new Random();
        int randomNumber= rand.nextInt(26);
        while(randomNumber!=0 && count<50)
        {
            arr[count++]= randomNumber;
            randomNumber= rand.nextInt(26);
        }

        System.out.println("actual size of array: " + count);
        printList(arr, count);

        int m= rand.nextInt(3)+2;
        int[] multipleIndex = new int[count];
        int countIndex=0;
        int[] multipleValues  = new int[count];

        System.out.println("\n---------------------------------");
        for(int i=0;i<count;i++)
        {
            if(arr[i]%m==0)
            {
                multipleIndex[countIndex]= i;
                multipleValues[countIndex++]= arr[i];
            }
        }
        System.out.println("List of multiples of " + m +" with original index.");
        for(int i=0;i<countIndex;i++)
        {
            System.out.println(multipleIndex[i] + ": " + multipleValues[i]);

        }
        System.out.println("\nend of processing");
    }

    public static void printList(int[] arr, int count)
    {
        System.out.println("\nOriginal List");
        for(int i=1;i<=count;i++)
        {
            System.out.print(arr[i-1] + " ");
            if(i%5==0)
            {
                System.out.println();
            }
        }
        System.out.println();
    }
}