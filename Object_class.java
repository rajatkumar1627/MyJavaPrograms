class H
{
    public String toString() {
        return "H []";
    }

    public boolean equals(Object obj) 
    {
        return super.equals(obj);
    }

    public int hashCode() 
    {
        return super.hashCode();
    }
    
}
public class Object_class 
{
    public static void main(String[] args) 
    {
        H obj = new H();
        System.out.println(obj); // Will return toString method as getClass().getName() + '@' + Integer.toHexString(hashCode())
        H obj1 = new H();
        boolean result = obj.equals(obj1);
        System.out.println(result);
        System.out.println(obj.hashCode());
    }
}
