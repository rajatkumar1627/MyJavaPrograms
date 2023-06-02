public class mutable_string
{
    public static void main(String[] args) {
        String name = "Rajat ";
        name = name + "Jha";
        System.out.println("Hello! " + name);

        // Referencing same object with two in stack
        String S1 = "rajat";
        String S2 = "rajat";

        System.out.println(S1 == S2);
    }   
}