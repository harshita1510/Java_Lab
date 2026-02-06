public class Calc {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        add(a,b);
        sub(a,b);
        multi(a,b);
        div(a,b);
    }
    public static void add(int a,int b)
    {
        System.out.println("Addition="+(a+b));
    }
    public static void sub(int a,int b)
    {
        System.out.println("Subtraction="+(a-b));
    }
    public static void multi(int a,int b)
    {
        System.out.println("Multiplication="+(a*b));
    }
    public static void div(int a,int b)
    {
        System.out.println("Division="+(a/b));
    }
}
