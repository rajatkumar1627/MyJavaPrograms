class XY
{
    public void show()
    {
        System.out.println("In XY's Show");
    }
}
public class AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        XY obj = new XY()
        {
            public void show()
            {
                System.out.println("In new Show");
            }
        };

        obj.show();
    }    
}
