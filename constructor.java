class Human
{
    private int age;
    private String name;

    public Human()
    {
        System.out.println("In constructor");
        age = 20;
        name = "Cadet";
    }
    
    public int getAge() 
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
class constructor
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human();
        System.out.println("Default values");
        System.out.println(obj.getName() + " : " + obj.getAge());
        obj.setAge(26);
        obj.setName("Rajat");
        obj1.setName(null);
        System.out.println("With value assigned");
        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
