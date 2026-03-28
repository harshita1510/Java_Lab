[Program 1: Program to create  a calculator in java.](#Code1)

[Program 2: Program to find greatest of two numbers.](#Code2)

[Program 3: Program for the addition of two distances where each distance is given in meter and centimeter.](#Code3)

[Program 4: Program for the addition of two distances where each distance is given in meter, centimeter and millimeters.](#Code4)

[Program 5: Program for the addition of two times where each time is given in hours, minutes and seconds.](#Code5)

[Program 6: Program for reversing 1-D array using objects and classes.](#Code6)

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
~~~
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
~~~
<img width="324" height="152" alt="image" src="https://github.com/user-attachments/assets/5be78abc-b814-4037-9474-25e70387f024" />

## Code4
~~~
import java.util.Scanner;
public class Distance
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int m1,m2,cm1,cm2,mm1,mm2;
    int meter,centimeter,millimeter;
    System.out.println("Enter first Distance(meter,centimenter and millimeter):");
    m1=sc.nextInt();
    cm1=sc.nextInt();
    mm1=sc.nextInt();
    System.out.println("Enter second distance(meter,centimeter and millimeter):");
    m2=sc.nextInt();
    cm2=sc.nextInt();
    mm2=sc.nextInt();
    meter=m1+m2;
    centimeter=cm1+cm2;
    millimeter=mm1+mm2;
    if(millimeter>=10)
    {
      centimeter=centimeter+(millimeter/10);
      millimeter=millimeter%10;
    }  
    if(centimeter>=100)
    {
      meter=meter+(centimeter/100);
      centimeter=centimeter%100;
    } 
    System.out.println("Total Distance:"+meter+"m "+centimeter+"cm "+millimeter+"mm");
  }
}
~~~
<img width="408" height="173" alt="image" src="https://github.com/user-attachments/assets/7138e3b0-2c5b-47bc-b9d2-e02854b5741a" />

## Code5
~~~
import java.util.Scanner;

class Time {
    int hours, minutes,seconds;

    void addTime(int h1, int m1, int h2, int m2, int sec1, int sec2) {
        hours = h1 + h2;
        minutes = m1 + m2;
        seconds= sec1 + sec2;
        
        if (seconds >= 60){
            minutes =  minutes + seconds / 60;
            seconds = seconds % 60;
        } 

        if (minutes >= 60) {
            hours = hours + minutes / 60;
            minutes = minutes % 60;
        }
    }

    void display() {
        System.out.println("Total Time = " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int h1, m1, h2, m2, sec1, sec2;

        System.out.print("Enter first time (hours,minutes and seconds): ");
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        sec1=sc.nextInt();
        
        System.out.print("Enter second time (hours,minutes and seconds): ");
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        sec2=sc.nextInt();
        
        Time t = new Time();   // object creation
        t.addTime(h1, m1, h2, m2, sec1, sec2);
        t.display();
    }
}
~~~
<img width="353" height="154" alt="image" src="https://github.com/user-attachments/assets/8b3f5a10-d330-40a5-8426-bc7df2734396" />

## Code6
~~~
import java.util.Scanner;

class RevArray
{
  void ReverseArray()
  {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter size of array:");
    n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter elements of the array:\n");
    for(int i=0 ; i < n; i++)
    { 
      System.out.println("Enter "+ (i+1) +"th element:");
      arr[i] = sc.nextInt();
    }

    System.out.println("Original Array:-");
    for(int i=0; i < n; i++)
    { 
      System.out.print(arr[i]+" ");
    }

    System.out.println("\nReversed Array:-");
    for(int i=0; i < n/2; i++)
    {
      int temp = arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = temp;
    }
    for(int i=0; i < n; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}

public class MainRevArray
{
  public static void main(String[] args)
  {
    RevArray obj = new RevArray();
    obj.ReverseArray();
  }
}
~~~
<img width="334" height="298" alt="image" src="https://github.com/user-attachments/assets/ffc63198-b74b-42aa-a22a-4401e313066e" />

