class Phone 
{
    String brand;
    int price;
    String name;   
    
    public void show()
    {
        System.out.println(brand + "  : " + price + "  : " + name);
    }
}

public class Mobile
{
    public static void main(String[] args) 
    {
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.price = 50_000;
        obj1.name = "Smartphone";
        
        Phone obj2 = new Phone();
        obj2.brand = "Vivo";
        obj2.price = 28_000;
        obj2.name = "Smartphone";

        obj1.show();
        obj2.show();
    }
}
