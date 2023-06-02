enum Laptop
{
    Macbook(1_70_000), Thinkpad(80_000), Surface, XPS(2_20_000);

    private int price;

    
    private Laptop() 
    {
        // This is a default costructor for non parameterized "Surface laptop"
    }

    private Laptop(int price) 
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
public class EnumClass 
{
    public static void main(String[] args) 
    {
        Status s = Status.Running;
        System.out.print("Class of enum is: ");
        System.out.print(s.getClass().getSuperclass());  //enum is a part of "Enum Class"

        // Laptop lap = Laptop.Macbook;
        // System.out.println("\n" + lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values())
        {
            System.out.println("\n" + lap + " : " + lap.getPrice());
        }
    }
}
