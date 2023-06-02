import java.util.HashMap;
import java.util.Map;

public class MapInterface 
{
    public static void main(String[] args) 
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("Saurav", 86);
        students.put("Rajat", 83);
        students.put("Akshat", 87);
        students.put("Rahul", 90);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        System.out.println(key + " : " + students.get(key));
    }
}
