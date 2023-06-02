class AB
{
    public void show1()
    {
        System.out.println("In show AB");
    }
}

class BA extends AB
{
    public void show2()
    {
        System.out.println("In show BA");
    }
}
public class UpCasting 
{
    public static void main(String[] args) {
        AB obj1 = new BA();
        obj1.show1(); // Output: In show AB
        
        BA obj2 = new BA();
        obj2.show2(); // Output: In show BA
    }
}

