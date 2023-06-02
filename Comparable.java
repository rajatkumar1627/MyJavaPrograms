import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    int age;
    String name;
    public String toString() 
    {
        return "Student1 [age=" + age + ", name=" + name + "]";
    }
    public Student1(int age, String name) 
    {
        this.age = age;
        this.name = name;
    }
    
    
}
public class Comparable
{
    public static void main(String[] args) 
    {
        // Comparator<Student1> com = new Comparator<Student1>() 
        // {
        //     public int compare(Student1 i, Student1 j)
        //     {
        //         if(i.age > j.age)
        //             return 1; // Swap
        //         else
        //             return -1; // Don't Swap
        //     }
        // };
        // Using Lambda as Comparator is a functional interface
        Comparator<Student1> com = ( i,  j) -> i.age > j.age?1:-1;
        
        List<Student1> studs = new ArrayList<>();    
        studs.add(new Student1(26, "Rajat"));
        studs.add(new Student1(23, "Rahul"));
        studs.add(new Student1(24, "Mohan"));
        studs.add(new Student1(22, "Saurav"));

        Collections.sort(studs, com);
        //Enhanced for loop
        for(Student1 s : studs)
            System.out.println(s);

    }    
}
