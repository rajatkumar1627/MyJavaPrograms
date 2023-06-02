interface ABC
{
    int age = 26;           // Variables are final and static in interface so it needs initialization
    String area = "Patna";  // Variables are final and static in interface so it needs initialization
    void show();
    void config();
}
class CBA implements ABC
{

    public void show() 
    {
        System.out.println("In show");
    }
    public void config() 
    {
        System.out.println("In config");
    }

}
public class InterFace 
{
    public static void main(String[] args) 
    {
        ABC obj;
        obj = new CBA();
        obj.show();
        obj.config();

        System.out.println(ABC.area);  // as the variables are final and static need not to create any object to call
        System.out.println(ABC.age);   // as the variables are finala and static need not to create any object to call
    }
}
