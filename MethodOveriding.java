class X
{
    public void show()
    {
        System.out.println("In X's show");
    }
    public void config()
    {
        System.out.println("In X's config");
    }
}
class Y extends X
{
    public void show()
    {
        System.out.println("In Y's show");
    }
}
public class MethodOveriding 
{
    public static void main(String[] args) 
    {
        Y obj = new Y();
        obj.show();
        obj.config();    
    }   
}
