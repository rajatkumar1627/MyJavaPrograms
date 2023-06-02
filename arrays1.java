public class arrays1 
{
  public static void main(String[] args) 
  {
    // creating static array with size 4 
    int nums [] = {2,3,6,9,};
    System.out.println(nums[1]); 
    System.out.println(nums[0]); 
    System.out.println(nums[3]);  

    // replacing 3 with 15
    nums[1] = 15;
    System.out.println("Replaced 3 with 15");
    System.out.println(nums[1]);

    // creating dynamic array with size 5
    int nums1 [] = new int[5];
    nums1[0] = 2;
    nums1[1] = 8;
    nums1[2] = 7;
    nums1[3] = 9;
    System.out.println("This is my dynamic array!!");
    for(int i = 0; i<4; i++)
    {
        System.out.println(nums1[i]);
    }
  }  
}
