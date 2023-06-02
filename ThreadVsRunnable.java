class ACD implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
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
class CDA implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
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
public class ThreadVsRunnable
{
    public static void main(String[] args) 
    {
        Runnable obj1 = new ACD();
        Runnable obj2 = new CDA();

        // Runnable object in thread class
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }    
    }
