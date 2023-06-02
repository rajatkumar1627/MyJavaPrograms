public class conditional_even {
   public static void main(String[] args) {
    int n = 15;
    int result = 0;

  //  if (n%2 == 0)
    //    result = 10;

   // else
   //     result = 20;

   // using ternary for saving time

   result = n%2==0 ? 10 : 20;
        
    System.out.println(result);
   } 
}
