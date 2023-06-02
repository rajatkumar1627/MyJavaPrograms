class RajatException extends Exception
{
    public RajatException(String message)
    {
        super(message);
    }
}
public class CustomException 
{
    public static void main(String[] args) 
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new RajatException("I don't want to print message.");
        }
        catch(RajatException e)
        {
            j = 18/1;
            System.out.println(e + "\n" + "That's the default output");
        }
        System.out.println(j);
    }    
}
