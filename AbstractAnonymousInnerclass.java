abstract class XYZ
{
    public abstract void show();
}
public class AbstractAnonymousInnerclass 
{
    public static void main(String[] args) 
    {
        XYZ obj = new XYZ()
        // AbstractAnonymousInnerclass 
        {
            public void show()
            {
                System.out.println("In new Show");
            }
        };

        obj.show();
    }    
}