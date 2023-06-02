public class mutable_buffer_string 
{
    public static void main(String[] args) 
    {
        // Mutable String (default size = 16)
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Rajat");
        System.out.println(sb1.capacity());
        System.out.println(sb1);

        sb1.append(" Jha");
        System.out.println(sb1);
         
        sb1.deleteCharAt(4);
        System.out.println(sb1);
    }
}
