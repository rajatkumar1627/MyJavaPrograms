import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface 
{
    public static void main(String[] args) 
    {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(3);
        nums.add(8);
        nums.add(5);    
    
        System.out.println(nums);

        for(Object n : nums)
        {
            int num = (Integer)n;
            System.out.println(num*2);
        }
    }
}
