import tools.*;

public class Calc_Demo 
{
    public static void main(String[] args) 
    {
        Calc ob1 = new Calc();
        AdvCalc ob2 = new AdvCalc();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(10,11);
        int r2 = obj.sub(14,54); 
        int r3 = obj.multi(144,12);
        int r4 = obj.div(54,27);    
        double r5 = obj.power(5,3);    

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " ");
    }    
}
