public class nested_loop1 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5)
            {
                System.out.println("Roll " + i);
                int j = 1 ;
                while (j<=2) {
                    System.out.println("You are a volunteer!!" + j);
                    j++;
                } 
                System.out.println("That's all!! " + i);
                i++;
            }
        System.out.println("Game Over!! " + i);
       } 
}
