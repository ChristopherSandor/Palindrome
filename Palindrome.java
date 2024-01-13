public class Palindrome {
    public static void main(String[] args) {
       
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        int num6 = Integer.parseInt(args[5]);

        boolean test = (num1 == num6 && num2 == num5 && num3 == num4);
        
        System.out.println(test);
    }
}
