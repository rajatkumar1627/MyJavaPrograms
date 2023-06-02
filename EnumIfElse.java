enum Status
{
    Running, Failed, Pending, Success;
}
public class EnumIfElse
{
    public static void main(String[] args) 
    {
        Status s = Status.Running;
        System.out.println(s);

        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
        }
    }
}
