public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e + "\n");
        }
        System.out.println(j);

        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong: " + e + "\n");
        }

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Something went wrong: " + e + "\n");
        }

        System.out.println("Bye");
    }
}
