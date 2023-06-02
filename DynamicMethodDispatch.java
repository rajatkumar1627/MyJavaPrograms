class E
{
    public void show()
    {
        System.out.println("In E's Show");
    }
}
class F extends E 
{
    public void show()
    {
        System.out.println("In F's Show");
    }
}
class G extends E
{
    public void show()
    {
        System.out.println("In G's Show");
    }
}
public class DynamicMethodDispatch 
{
    public static void main(String[] args) 
    {
        System.out.println("Here is RunTime Polymorphism OR Dynamic method dispatch");
        E obj = new F(); // Reference of E and object of F(obj type is E but implementation is F)
        obj.show();

        E obj1 = new E();
        obj1.show();

        obj1 = new F();
        obj1.show();

        obj1 = new G();
        obj1.show();
    }
}
