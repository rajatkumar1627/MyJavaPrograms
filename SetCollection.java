import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetCollection
{
    public static void main(String[] args) 
    {
        Set<Integer> nums = new HashSet<Integer>();
        
        nums.add(68);
        nums.add(31);
        nums.add(8);
        nums.add(50);
        // As we are importing Set package it will not show duplicated values
        nums.add(6);    
    
        System.out.println(nums);

        for(int n : nums)
        {
            System.out.println(n*2);
        }

        System.out.println("This is a use case of TreeSet for getting sorted values");
        Collection<Integer> nums2 = new TreeSet<Integer>();
        
        nums2.add(36);
        nums2.add(43);
        nums2.add(98);
        nums2.add(45);  

        // Use of Iterator class instead of for loop

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());
    
        // System.out.println(nums2);

        // for(int n2 : nums2)
        // {
        //     System.out.println(n2*3);
        // }
    }
}

