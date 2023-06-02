import java.util.Arrays;
import java.util.List;

public class UseOfConsumerClass
{
    public static void main(String[] args) 
    {
        List<Integer> nums = Arrays.asList(4,5,6,8,9);
        //Enhanced for loop for printing each element
        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }

        nums.forEach(n -> System.out.println(n));

        int sum = 0;
        for(int n : nums)
        {
            if(n%2 == 0)
            {
                n = n*2;
                sum = sum + n;
            }
        }
        System.out.println("Printing double value of sum of all evens in list");
        System.out.println(sum);
    }
}
