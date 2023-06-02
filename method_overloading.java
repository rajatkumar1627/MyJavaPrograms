class Calculator
{
    public int add(int n1,int n2,int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public double add(double n1,int n2)
    {
        return n1 + n2;
    }
}
public class method_overloading 
{
    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 5;
        int num3 = 7;
        Calculator calc = new Calculator();

        int result1 = calc.add(num1,num2);
        System.out.println(result1);
        int result2 = calc.add(num1,num2,num3);
        System.out.println(result2);

    }   
}
