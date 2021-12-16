
package triangle;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Triangle {

  
    public static void main(String[] args) 
    {
        
        byte number =1;
        Scanner x = new Scanner (System.in);
        System.out.print("Enter the hieght :"  );
        try
        {
        byte hieght = x.nextByte(); 
        if(hieght>63)
        {
            System.err.print("The number must be smaller than 64");
        }
        else if(hieght>0)
        {
        for(byte counter=hieght;counter>0;counter--)
        {
        for(byte spaceCounter = 0;spaceCounter<counter;spaceCounter++ )
        {
            System.out.print("  ");
        }
        for(byte starCounter = 0;starCounter<number;starCounter++ )
        {
            System.out.print("* ");
        }
        System.out.println(' ');
        number+=2;
        }
        }
        else
        {
            System.err.print("The number must be more than 0");
        }
        }
        catch(InputMismatchException e)
        {
            System.err.print("Enter an integer only");
        }
        
    }
    
}
