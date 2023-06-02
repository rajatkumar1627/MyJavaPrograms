@FunctionalInterface
interface AF
{
    int add(int i, int j);
}
public class LambdaExpressionWithReturnType 
{
    public static void main(String[] args) 
    {
        AF obj = (i,j) -> i+j; // no need of writing return for an expression as it is default as in case of this i+j here
        int result = obj.add(5,3);
        System.out.println(result);
    }
}
