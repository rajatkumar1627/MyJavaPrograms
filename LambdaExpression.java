@FunctionalInterface
interface AQ
{
    void show(int i);
}
public class LambdaExpression 
{
    public static void main(String[] args) 
    {
        // use of Lambda Expression
        AQ obj = i -> System.out.println("In show " + i);
        obj.show(3);
    }
}
