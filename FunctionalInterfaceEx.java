@FunctionalInterface
interface AD
{
    void show();
}
// class DA implements AD
// {
//     public void show()
//     {
//         System.out.println("In show");
//     }
// }
public class FunctionalInterfaceEx
{
    public static void main(String[] args) 
    {
        AD obj = new AD()
        {
            public void show()
            {
                System.out.println("In Show");
            }
        };
        obj.show();
    }    
}
