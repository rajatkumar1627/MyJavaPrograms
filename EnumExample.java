enum Status
{
    Running, Failed, Pending, Success;
}
public class EnumExample 
{
    public static void main(String[] args) 
    {
        Status s = Status.Running;
        System.out.println(s);

        System.out.println("\nUsing loop for printing all the status");

        Status[] ss = Status.values();
        for(Status a : ss)
        {
            System.out.println(a + " : " + a.ordinal());
        }
    }
}
