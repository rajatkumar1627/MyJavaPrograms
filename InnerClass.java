class P
{
    int age;
    public void show()
    {
        System.out.println("In Show");
    }
    static class Q
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }
}
public class InnerClass 
{
    public static void main(String[] args) 
    {
        P obj = new P();
        obj.show();

        P.Q obj1 = new P.Q(); // Object of outer class creating object of inner class
        obj1.config();
    }
}
