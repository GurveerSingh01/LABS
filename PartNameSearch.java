import java.util.Scanner;
public class PartNameSearch 
{
    public static void main(String[] args)
    {
        // ***** variables *****
        int count=5;

        int[] partNumber = {1234, 2234, 3234, 4234, 5234};
        String[] partName = {"Widget", "Doodad", "Geegaw", "Whatsit", "Blender"};

        int partIndex = -1;     // -1 is not found
        int ptNo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a part number.");
        ptNo = scanner.nextInt();

        // add your code here
        for(int i=0;i<count;i++)
        {
            if(ptNo == partNumber[i])
            {
                partIndex = i;
            }
        }

        if(partIndex>=0)
        {
            System.out.println(partName[partIndex]);
        }
        else
        {
            System.out.println("Part Not In Inventory");
        }
    }
}
 