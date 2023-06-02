public class conditional_3 {
    public static void main(String[] args) {
        int a = 18;
        int b = 20;
        int c = 26;
        // No need of curly brackets after if or else for single statement after
        if (a>b && a>c) 
            System.out.println("Maximum Value is : "+ a);
        else if (b>a && b>c)
            System.out.println("Maximum Value is : "+ b);
        else
            System.out.println("Maximum Value is : "+ c);
    }
}
