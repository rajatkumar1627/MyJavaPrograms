class ASD
{
    public void show() throws ClassNotFoundException 
    {
        Class.forName("AXS");    
    }
}
public class ThrowsException 
{
    static
    {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) 
    {
        ASD obj = new ASD();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
