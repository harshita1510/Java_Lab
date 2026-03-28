[Program 1: Program to create  a calculator in java.](#Code1)

[Program 2: Program to find greatest of two numbers.](#Code2)

[Program 3: Program for the addition of two distances where each distance is given in meter and centimeter.](#Code3)

## Code1
~~~
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
~~~
<img width="840" height="274" alt="image" src="https://github.com/user-attachments/assets/e9335dd4-951d-4206-9a2d-0d84449f072a" />

## Code2
~~~
public class Max {
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(a>b)
        {
            System.out.println("Greatest is "+a);
        }
        else if(a==b)
        {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Greatest is "+b);
        }
    }
    
}
~~~
<img width="484" height="226" alt="image" src="https://github.com/user-attachments/assets/889f0581-23cc-4ea6-991a-7802e6af04ce" />

## Code3
```
import java.util.Scanner;
public class Distance
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int m1,m2,cm1,cm2;
    int meter,centimeter;
    System.out.println("Enter first Distance(meter and centimenter):");
    m1=sc.nextInt();
    cm1=sc.nextInt();
    System.out.println("Enter second distance(meter and centimeter):");
    m2=sc.nextInt();
    cm2=sc.nextInt();
    meter=m1+m2;
    centimeter=cm1+cm2;
    if(centimeter>=100)
    {
      meter=meter+(centimeter/100);
      centimeter=centimeter%100;
    }   
    System.out.println("Total Distance:"+meter+"m "+centimeter+"cm");
  }
}
```
<img width="324" height="152" alt="image" src="https://github.com/user-attachments/assets/5be78abc-b814-4037-9474-25e70387f024" />

