class AC
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In A Show");
    }
}
class CA extends AC
{
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In B Show");
    }
}

public class Annotation
{
    public static void main(String[] args) 
    {
        CA obj = new CA();
        obj.showTheDataWhichBelongsToThisClass();
    }
}