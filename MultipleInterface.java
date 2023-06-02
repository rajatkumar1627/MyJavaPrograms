// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface ABCD
{
    int age = 26;           // Variables are final and static in interface so it needs initialization
    String area = "Patna";  // Variables are final and static in interface so it needs initialization
    void show();
    void config();
}
interface BCD
{
    void run();
}
interface CD extends BCD
{
    void play();
}
class DCBA implements ABCD,CD
{
    public void show() 
    {
        System.out.println("In show");
    }
    public void config() 
    {
        System.out.println("In config");
    }
    public void  run()
    {
        System.out.println("Running..");
    }
    public void play()
    {
        System.out.println("Playing..");
    }

}
public class MultipleInterface  
{
    public static void main(String[] args) 
    {
        ABCD obj;
        obj = new DCBA();
        obj.show();
        obj.config();
        ((BCD) obj).run();

        System.out.println(ABCD.area);  // as the variables are final and static need not to create any object to call
        System.out.println(ABCD.age);   // as the variables are finala and static need not to create any object to call
    }
}
