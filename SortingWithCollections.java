import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithCollections 
{
    public static void main(String[] args) 
    {
        Comparator<Integer> com = new Comparator<Integer>() 
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<>();    
        nums.add(45);
        nums.add(41);
        nums.add(84);
        nums.add(33);

        System.out.println("Sorting based on values using collections class");
        
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("Sorting based on last digits using collections class");
        
        Collections.sort(nums, com);
        System.out.println(nums);
    }    
}
