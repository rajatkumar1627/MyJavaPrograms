class AZ extends Thread
{
    public void run()
    {
        for (int i = 1; i < 100; i++) 
        {
            System.out.println("Hii");  
            try 
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {  
                e.printStackTrace();
            }  
        }
    }
}
class ZA extends Thread
{
    public void run()
    {
        for (int i = 1; i < 100; i++) 
        {
            System.out.println("Hello");
            try 
            {
                Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {  
                e.printStackTrace();
            }     
        }
    }
}
public class Threading 
{
    public static void main(String[] args) 
    {
        AZ obj1 = new AZ();
        ZA obj2 = new ZA();
    
        obj1.start();
        try 
        {
            Thread.sleep(5);
        } 
        catch (InterruptedException e) 
        {  
            e.printStackTrace();
        } 
        obj2.start();
    }    
    }

