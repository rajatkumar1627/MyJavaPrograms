// uses of static_block
class Mobile
{
    String brand;
    int price;
    static String name;   
    
    // use of static block
    static
    {
        name = "Smartphone";
        System.out.println("In Static block");
    }

    public Mobile()
    {
        brand = "";
        price = 30_000;
        System.out.println("In Constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class Phone2
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 50_000;
        Mobile.name = "Smartphone";
        
        Mobile obj2 = new Mobile();

        obj1.show();
        obj2.show();
    }
}
